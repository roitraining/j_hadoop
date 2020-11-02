DROP TABLE reviews;
CREATE TABLE reviews (movieid STRING, rating INT, length INT) ROW FORMAT DELIMITED FIELDS TERMINATED BY '\t';

LOAD DATA LOCAL INPATH 'reviews.txt' OVERWRITE INTO TABLE reviews;

add FILE rating_mapper.py;

DROP TABLE reviewintensity;
CREATE TABLE reviewintensity(movieid STRING, intensity INT, numreviews INT) ROW FORMAT DELIMITED FIELDS TERMINATED BY '\t';

INSERT OVERWRITE TABLE reviewintensity
SELECT
  TRANSFORM (movieid, rating, length)
  USING 'python rating_mapper.py'
  AS (movieid, intensity, numreviews)
FROM reviews;

INSERT OVERWRITE TABLE reviewintensity
SELECT movieid, ROUND(AVG(intensity)), COUNT(*) FROM reviewintensity
  GROUP BY movieid;

SELECT * from reviewintensity WHERE numreviews > 5 ORDER BY intensity DESC;

