echo "Program to check if the entered number is even or odd"
echo "Enter any number"
read a
b=`expr $a % 2`
if [ $b -eq 0 ]
then
echo "Number is an even number"
else
echo "Number is an odd number"
fi
