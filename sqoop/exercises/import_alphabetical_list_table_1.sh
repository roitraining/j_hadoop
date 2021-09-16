sqoop import -Dorg.apache.sqoop.splitter.allow_text_splitter=true \
--connect jdbc:mysql://localhost/northwind?useSSL=false \
--username sqoopuser --password sqooppassword \
--warehouse-dir /northwind4 \
--table 'AlphabeticalProducts' --split-by CategoryName

