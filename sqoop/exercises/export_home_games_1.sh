sqoop export --connect jdbc:mysql://localhost/baseball?useSSL=false \
--username sqoopuser --password sqooppassword \
--table home_games -m 1 \
--export-dir /baseball --input-fields-terminated-by ',' \
--lines-terminated-by '\n' \
--columns "year,league,team,park,first,last,games,openings,attendance" 
