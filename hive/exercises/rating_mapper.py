#!/home/student/anaconda3/bin/python

import sys

for line in sys.stdin:
  line = line.strip()
  movieid, rating, reviewlength = line.split('\t')
  rating = (float(rating) - 5.5)/4.5;  #( place ratings on scale from -1 to +1
  intensity = float(reviewlength)/200.0;
  if intensity > 1.0:
    intensity = 1.0;
  intensity = int(round(5 * (abs(rating) + intensity) )) # 0-10
  print("\t".join([movieid, str(intensity), "1"]))
