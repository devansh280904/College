#Binary search in Recursive method

import time
start=time.time()

def BinarySearch(arr,num,low,high):
    if low <= high: 
        mid=(low+high)//2
        if arr[mid]==num:
            return mid
        elif num > arr[mid]:
            return BinarySearch(arr,num,mid+1,high)
        else:
            return BinarySearch(arr,num,low,mid-1)
    else:
        return -1
num=int(input("Enter size of array: "))
arr=[]

for i in range(num):
    val=int(input("Enter the values(sorted): "))
    arr.append(val)

num=int(input("Enter element to be searched:"))

res= BinarySearch(arr,num,0,len(arr)-1)
if(res==-1):
    print("Element not found.")
else:
    print("Element is found at index:",res)
    
end=time.time()

print("Execution time:",end-start,"seconds")
