# Implementation and Time analysis of sorting algorithms: Bubble sort

import time

start=time.time()
num=int(input("Enter size of array: "))
arr=[]

for i in range(num):
    val=int(input("Enter the value: "))
    arr.append(val)
print("Unsorted array:",arr)

for i in range(num):
    mini=i
    for j in range(i+1,num):
        if(arr[j]<arr[mini]):
            mini=j
    if(mini!=i):
        arr[i] , arr[mini]=arr[mini] ,arr[i]
end=time.time()

print("Sorted array:",arr)
print("Execution time:",end-start,"seconds")
