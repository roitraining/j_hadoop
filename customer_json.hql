ADD JAR /usr/local/hive/hcatalog/share/hcatalog/hive-hcatalog-core.jar;

use northwind;

drop table customers;

create table customers
(companyname string
, city string
, region string
, country string)
stored as avro
location '/customers';

load data local inpath '/class/datasets/northwind/AVRO/customers' 
overwrite into table customers;

insert overwrite local directory '/tmp/customers' 
ROW FORMAT SERDE 'org.apache.hive.hcatalog.data.JsonSerDe'
select companyname as name, city as city, region as region, country as country
from customers;