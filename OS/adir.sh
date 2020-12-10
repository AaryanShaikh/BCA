echo "Enter the name of the directory"
read a
if [ ! -d $a ]
then
mkdir $a
else
echo "Directory exist"
fi

