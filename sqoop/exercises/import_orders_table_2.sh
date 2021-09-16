sqoop import --connect jdbc:mysql://localhost/northwind?useSSL=false \
 --username sqoopuser --password sqooppassword --table orders -m 1 
