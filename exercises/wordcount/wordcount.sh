#!/bin/sh
hadoop fs -copyFromLocal /home/student/roi_hadoop/datasets/shakespeare.txt /shakespeare.txt
hadoop fs -rm -r /javaoutput
hadoop jar /home/student/roi_hadoop/solutions/wordcount/target/wordcount-1.0.0.jar com.roi.hadoop.wordcount.Main /shakespeare.txt /javaoutput
hadoop fs -cat /javaoutput/*
