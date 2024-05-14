echo "Enter String without space"
read string 
for i in $(seq 0 ${string})
do  
    rstring=${string:$i:1}${rstring}
done
echo "String was: " $string
echo " Reversed string: " $rstring
if [ "$string" = "$rstring" ]
then 
    echo "String is a Pallindrome."
else
    echo "String is not a Pallindrome."
fi
