echo "Select any Option"
echo "*****************"
echo "1)Display Calener of current month" 
echo "2)Display Today's Date and Time" 
echo "3)Display Username who are currently logged in" 
echo "4)Display your name on given x,y position" 
echo "5)Display your terminal Number" 
echo "6)Exit" 
read -p"Enter your choice:" ch 
case $ch in
1)cal;;
2)date;;
3)who;;
4)row=$(tput lines)
col=$(tput cols)
echo "Has Rows=$rows Cols=$col"
echo "Enter X position:"
read x 
echo "Enter Y position:"
read y 
echo "Enter name:"
read name 
tput cup $x $y
echo "$name";;
5)tty;;
6)echo "Exit";;
*)echo "Enter valid choice";;
esac
