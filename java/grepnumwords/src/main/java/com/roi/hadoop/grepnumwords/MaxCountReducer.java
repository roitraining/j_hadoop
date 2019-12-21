package com.roi.hadoop.grepnumwords;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class MaxCountReducer extends Reducer<Text, IntWritable, Text, IntWritable> {
	@Override
	public void reduce(Text key, Iterable<IntWritable> values, Context context)
			throws IOException, InterruptedException {
		// compute the max for this key
		int max = 0;
		for (IntWritable val : values) {
			if (val.get() > max) {
				max = val.get();
			}
		}
		// write it out
		IntWritable result = new IntWritable(max);
		context.write(key, result);
	}
}
