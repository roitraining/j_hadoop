#! /bin/sh
sh /home/student/ROI/stop-hadoop.sh
rm -r /hdfs
mkdir /hdfs
mkdir /hdfs/data
mkdir /hdfs/nn
mkdir /hdfs/snn
hdfs namenode -format
#sh /home/student/ROI/start-hadoop.sh
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
jps
hadoop fs -mkdir /user
hadoop fs -mkdir /user/student
hadoop fs -mkdir /user/root
hadoop fs -mkdir /user/hive
hadoop fs -mkdir /user/hive/warehouse
hadoop fs -chown student:student /user/student


