echo "Program Using case to display the numbers in words"
echo "Enter any number from 1-10"
read a
case $a in 1)
echo "1 -> ONE"
;;
2)
echo "2 -> TWO"
;;
3)
echo "3 -> THREE"
;;
4)
echo "4 -> FOUR"
;;
5)
echo "5 -> FIVE"
;;
6)
echo "6 -> SIX"
;;
7)
echo "7 -> SEVEN"
;;
8)
echo "8 -> EIGHT"
;;
9)
echo "9 -> NINE"
;;
10)
echo "10 -> TEN"
;;
*)
echo "Wrong input !"
;;
esac
