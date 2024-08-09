# Implementation and Time analysis of sorting algorithms: Bubble sort

import time

start=time.time()
num=int(input("Enter size of array: "))
arr=[]

for i in range(num):
    val=int(input("Enter the value: "))
    arr.append(val)
print("Unsorted array:",arr)

flag=0
while(flag == 0):
    flag=1
    for i in range(num-1):
        if(arr[i]>arr[i+1]):
            arr[i] ,arr[i+1]=arr[i+1] ,arr[i]
            flag=0
end=time.time()

print("Sorted array:",arr)
print("Execution time:",end-start,"seconds")
