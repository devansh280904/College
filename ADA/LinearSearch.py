# Implementation and Time analysis of Linear search algorithm.

import time

start=time.time()
def Linear_search(arr,TS):
    for i in range(len(arr)):
        if arr[i]==TS:
            return i
    return False
    
arr=[10,20,25,30,35,40,45,50,55]
TS=int(input("Enter element to be Searched:"))

res=Linear_search(arr,TS)
end=time.time()
print(arr)

if(res==-1):
    print("Element not found.")
else:
    print("Element is found at index:",res)
  
print("Execution time:",end-start,"seconds")
