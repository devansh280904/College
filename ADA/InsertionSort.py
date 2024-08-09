# Implementation and Time analysis of sorting algorithms: Insertion sort

import time
start=time.time()

num=int(input("Enter size of array: "))
arr=[]

for i in range(num):
    val=int(input("Enter the value: "))
    arr.append(val)
print("Unsorted array:",arr)

for i in range(1,len(arr)):
    j=i
    while j>0 and arr[j]<arr[j-1]:
        arr[j],arr[j-1]=arr[j-1],arr[j]
        j-=1

end=time.time()

print("Sorted array:",arr)
print("Execution time:",end-start,"seconds")
