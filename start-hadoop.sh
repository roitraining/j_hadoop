#! /bin/bash
echo "starting namenode"
/usr/local/hadoop/bin/hdfs --daemon start namenode
echo "starting secondary name node"
/usr/local/hadoop/bin/hdfs --daemon start secondarynamenode
echo "starting datanode"
/usr/local/hadoop/bin/hdfs --daemon start datanode
echo "starting resource manager"
/usr/local/hadoop/bin/yarn --daemon start resourcemanager
echo "starting nodemanager"
/usr/local/hadoop/bin/yarn --daemon start nodemanager
echo "starting hive metastore"
nohup hive --service metastore &>/dev/null &
echo "starting hiveserver2"
nohup hive --service hiveserver2 &>/dev/null &


