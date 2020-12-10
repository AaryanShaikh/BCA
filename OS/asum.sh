echo "Program to find the sum of square of numbers between 1 - 10"
a=1
b=10
sum=0
while [ $a -le $b ]
do
c=`expr $a \* $a`
echo "$a x $a = $c"
sum=`expr $sum + $c`
a=`expr $a + 1`
done
echo "Sum of the numbers is = $sum"


