echo "Program for roll no & class"
echo "My file name is:$0"
rollno=$1
class=$2
echo "Roll no:"$rollno
echo "Class:"$class
a=2
echo $a
b=3
echo $b
echo "Multiplication"
mul=`expr $a \* $b`
echo $mul
echo "Division of two numbers:"
echo "Enter two numbers"
read c d
echo $c
echo $d
echo "Division"
echo `expr $c / $d`
