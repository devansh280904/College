echo "Enter marks of OS out of 100:"
read os
echo "Enter marks of COA out of 100:"
read coa
echo "Enter marks of OOP out of 100:"
read oop
echo "******"
total=`expr $os + $coa + $oop`
echo "Total Marks:" $total
percentage=`expr $total / 3`
echo "Your Percentage:"$percentage %

if [ $percentage -ge 70 ] 
then
echo "First class with Distinction"
    #statements
elif [ $percentage -ge 60  ] 
then
echo "First class"
    #statements
elif [ $percentage -ge 40 ] 
then
echo "Second class"
else
echo "Fail"
fi
