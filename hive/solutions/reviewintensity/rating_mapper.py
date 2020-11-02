#!/usr/bin/python

import sys
import math

for line in sys.stdin:
  line = line.strip()
  movieid, rating, reviewlength = line.split('\t')

  rating = (float(rating) - 5.5)/4.5;  # -1 to +1
  intensity = float(reviewlength)/200.0;
  if intensity > 1.0 :
     intensity = 1.0;
  intensity = int(round( 5*(abs(rating) + intensity) )) #0-10

  print '\t'.join([movieid, str(intensity), "1" ])
