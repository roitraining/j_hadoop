#!/bin/sh

rm -rf $HOME/hdfs
mkdir -p $HOME/hdfs/nn
mkdir -p $HOME/hdfs/snn
mkdir -p $HOME/hdfs/dn

$HADOOP_HOME/bin/hdfs namenode -format
