/**
 * 
 */
package com.roi.hadoop.wordcount;

/**
 * @author student
 *
 */

import java.io.IOException;
import java.util.regex.Pattern;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class WordMapper extends Mapper<Object, Text, Text, IntWritable> {

	private final static Pattern NON_LETTERS = Pattern.compile("[^a-zA-Z]");
	private final static String SPACE = " ";
	private final static String SPACES = " +";

	public static String[] findWords(String line) {
		line = NON_LETTERS.matcher(line).replaceAll(SPACE);
		return line.split(SPACES);
	}

	public void map(Object ignoredKey, Text value, Context context)
			throws IOException, InterruptedException {

	//TODO: Add code here
		
	}
}
