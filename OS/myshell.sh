echo "Hello from my first Shell Script Program"
echo "My file name is:$0"
name="Aaryan"
echo $name
a=2
echo $a
b=3
echo $b
echo "Addition"
add=`expr $a + $b`
echo $add
add1=`expr $1 + $2`
echo "Addition of number taken as argument at CLI:$add1"
echo "Enter two numbers"
read c d
echo $c
echo $d
echo "Subtraction"
echo `expr $c - $d`
