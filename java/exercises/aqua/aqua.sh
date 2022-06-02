#!/bin/sh
hadoop fs -copyFromLocal /home/student/roi_hadoop/datasets/aquaculture.csv /aquaculture.csv
hadoop fs -rm -r /javaoutput
hadoop jar /home/student/roi_hadoop/exercises/aqua/target/aqua-1.0.0.jar com.roi.hadoop.aqua.Main /aquaculture.csv /javaoutput
hadoop fs -cat /javaoutput/*
