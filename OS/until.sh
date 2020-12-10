echo "Until loop"
a=1
for $a in 1 2 3 4
do
echo $a
a=`expr $a + 1`
done
