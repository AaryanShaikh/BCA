echo "Program to display table of any number"
echo "Enter any number"
read a
b=1
while [ $b -le 10 ]
do
c=`expr $a \* $b`
echo "$a x $b = $c"
b=`expr $b + 1`
done

