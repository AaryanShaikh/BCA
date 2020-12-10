echo "Program to check if the number is divisible by 8 or not"
echo "Enter any number"
read a
b=`expr $a % 8`
if [ $b -eq 0 ]
then
echo "$a is divisible by 8"
else
echo "$a is not divisible by 8"
fi
