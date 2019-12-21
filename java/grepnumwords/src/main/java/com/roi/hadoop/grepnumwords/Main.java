package com.roi.hadoop.grepnumwords;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.util.GenericOptionsParser;

public class Main {
	public static void main(String[] args) throws Exception {
		// parse command-line
		Configuration conf = new Configuration();
		args = new GenericOptionsParser(conf, args).getRemainingArgs();
		if (args.length <= 2) {
			System.err.println("Usage: grepnumwords <in> <out> <term1> <term2>");
			System.exit(2);
		}

		// set up parameters to Mapper and Reducer
		String[] searchTerms = new String[args.length - 2];
		for (int i = 2; i < args.length; ++i) {
			searchTerms[i - 2] = args[i];
		}
		conf.setStrings("searchTerms", searchTerms);

		// configure the job
		Job job = Job.getInstance(conf);
		job.setJarByClass(Main.class);
		job.setMapperClass(SearchTermsMapper.class);
		//job.setCombinerClass(MaxCountReducer.class);
		job.setReducerClass(MaxCountReducer.class);
		job.setOutputKeyClass(Text.class);
		job.setOutputValueClass(IntWritable.class);
		FileInputFormat.addInputPath(job, new Path(args[0]));
		FileOutputFormat.setOutputPath(job, new Path(args[1]));
		job.setNumReduceTasks(2);

		// run the job
		System.exit(job.waitForCompletion(true) ? 0 : 1);
	}
}