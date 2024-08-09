# Implementation and Time analysis of Binary search algorithm.

import time

start=time.time()
def Binary_search(arr,TS):
    low=0
    high=len(arr) - 1
    while low<=high:
        mid=(low+high)//2
        if TS > arr[mid]:
            low=mid+1
        elif TS < arr[mid]:
            high=mid-1
        else:
            return mid 
    return False

arr=[10,20,25,30,35,40,45,50,55]
TS=int(input("Enter element to be Searched:"))

res= Binary_search(arr,TS)

print(arr)
if(res==False):
    print("Element not found.")
else:
    print("Element is found at index:",res)
    
end=time.time()

print("Execution time:",end-start,"seconds")
