echo "Enter the file name"
read a
if [ -f $a ]
then
echo "file exists"
else
echo "file doesn't exists"
fi
