#!/bin/bash

docker-compose up -d namenode1 namenode2 && \
sleep 30 && \
docker exec -it ha_namenode1_1 bash -c "bin/hdfs zkfc -formatZK" && \
sleep 15 && \
docker-compose up -d datanode1 datanode2 && \
sleep 15 && \
docker-compose up -d client && \
echo "ALL SERVICES STARTED!" && \
echo "TAILING LOGS" && \
docker-compose logs -f
