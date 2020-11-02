docker run -it --rm --network hadoop -h hdfs-client --name hdfs-client \
-v /class/datasets:/datasets -v /class/hdfs_exercises/hdfs-scripts:/scripts -w /scripts roi/hadoop:2.7.5 /bin/bash

