read -p"Enter Number n:" n
fact=1
for (( i = 2; i <= n; i++ )); 
{
    fact=$((fact * i))
}
echo "Factorial of given Number:"$fact

