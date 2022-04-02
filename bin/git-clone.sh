#! /bin/sh
export GITPROJECT=$1
rm -r /home/student/ROI/$1
git clone https://github.com/roitraining/$1.git
rm -r /class
ln -s /home/student/ROI/$1 /class

