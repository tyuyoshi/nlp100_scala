cat popular-names.txt| awk '{print $1}' > col1.txt 
cat popular-names.txt| awk '{print $2}' > col2.txt 
cut -f 1 col1.txt | head -n 5
cut -f 1 col2.txt | head -n 5