echo " Enter the Number:"
read n 
i=1
while [ $i -le 10 ]
do
result=`expr $i \* $n`
echo " $n * $i =$result"
((i++))
done
