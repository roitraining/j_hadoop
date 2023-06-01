# run with spark-submit shipper_to_json.py
# then cat /tmp/shippersjson/*
from pyspark import SparkConf, SparkContext
from pyspark.sql import SparkSession, SQLContext
from pyspark.sql.types import *

sc = SparkContext()
spark = (SparkSession.builder.appName('notebook') 
    .enableHiveSupport().getOrCreate()
    )

shipperSchema = StructType([
StructField('shipperid', StringType()), 
StructField('shippername', StringType()),
StructField('phone', StringType())
])
shippers = spark.read.csv('file:///class/datasets/northwind/TSV/shippers', 
sep='\t', header=False, inferSchema=False, schema=shipperSchema)
shippers.write.mode('overwrite').json('file:///tmp/shippersjson')


