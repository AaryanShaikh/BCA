echo "Program to print any message using CLI"
a=$1
b=1
echo "How many times do you wanna run this message"
read n
while [ $b -le $n ]
do
echo $a
b=`expr $b + 1`
done

