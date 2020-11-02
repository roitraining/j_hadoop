/**
 * 
 */
package com.roi.hadoop.wordcount;

/**
 * @author student
 *
 */

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.util.GenericOptionsParser;

public class Main {
	public static void main(String[] args) throws Exception {
		Configuration conf = new Configuration();
		args = new GenericOptionsParser(conf, args).getRemainingArgs();
		if (args.length != 2) {
			System.err.println("Usage: wordcount <in> <out>");
			System.exit(2);
		}


		//TODO: add code here
		
		
		
	}
}
