#! /bin/bash

hadoop fs -mkdir -p /user/student
hadoop fs -put /datasets/text/big_shakespeare.txt /user/student/big_shakespeare.txt

