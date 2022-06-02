package com.roi.hadoop.aqua;

import java.io.IOException;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class AquaMapper extends Mapper<Object, Text, Text, AquaStat> {

	private final AquaIngest ingest = new AquaIngest();

	@Override
	public void map(Object ignoredKey, Text value, Context context)
			throws IOException, InterruptedException {

	//TODO:  Add code here
	
	}
}
