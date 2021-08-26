n=`wc -l $1 | awk '{print $1}'`
lc=`expr $n / $2`
split -l $lc $1 split-