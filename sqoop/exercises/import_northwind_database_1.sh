sqoop import-all-tables --connect jdbc:mysql://localhost/northwind --username sqoopuser --password sqooppassword  --warehouse-dir /northwind -m 1 --outdir generated_code

