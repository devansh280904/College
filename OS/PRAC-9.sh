read -p"Enter Total Numbers:" n 
for((i=0; i<$n; i++))
do
    read -p"Enter arr[$((i+1))]" arr[$i]
done
for((i=0; i<$n; i++))
do  
    for((j=0; j<$n; j++))
    do
         if [ ${arr[j]} -lt ${arr[$((j+1))]} ]
        then
            t=${arr[j]} 
            arr[$j]=${arr[$((j+1))]} 
            arr[$((j+1))]=$t
            fi
        done
    done
    echo "Numbers in Descending Order:" ${arr[*]}
