/**
 * 
 */
package com.roi.hadoop.wordcount;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;

/**
 * @author student
 * 
 */
public class AlphabetizedPartitioner extends
		org.apache.hadoop.mapreduce.Partitioner<Text, IntWritable> {

	@Override
	public int getPartition(Text text, IntWritable count, int numPartitions) {
		// find the first letter
		int letterNumber = 25; // "z" by default
		String word = text.toString().toLowerCase();
		if (word.length() > 0) {
			char last = word.charAt(word.length() - 1);
			letterNumber = last - 'a';
		}
		return letterNumber % numPartitions; // modulo
	}

}
