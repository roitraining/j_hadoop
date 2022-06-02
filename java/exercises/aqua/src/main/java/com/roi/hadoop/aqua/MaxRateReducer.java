package com.roi.hadoop.aqua;

import java.io.IOException;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class MaxRateReducer extends Reducer<Text, AquaStat, Text, AquaStat> {
	@Override
	public void reduce(Text key, Iterable<AquaStat> values, Context context)
			throws IOException, InterruptedException {
	
		//TODO: Add code here
	
	}
}
