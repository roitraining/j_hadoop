CREATE EXTERNAL TABLE dpm_text(month string, days int)
ROW FORMAT DELIMITED
FIELDS TERMINATED BY ','
STORED AS TEXTFILE
LOCATION '/user/student/dpm_textfile';
