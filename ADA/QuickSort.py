import time

start=time.time()
def QuickSort(arr):
    if len(arr)<=1:
        return arr
    less=[]
    greater=[]
    equal=[]
    pivot=arr[0]
    for i in arr:
            if i < pivot:
                less.append(i)
            elif i == pivot:
                equal.append(i)
            else:
                greater.append(i)
    return ( QuickSort(less)+ equal + QuickSort(greater))
    
    
num=int(input("Enter size of array: "))
arr=[]

for i in range(num):
    val=int(input("Enter the values: "))
    arr.append(val)
print("Unsorted Array:",arr) 

res= QuickSort(arr)
end=time.time()

print("Sorted Array:",res)
print("Execution time:",end-start,"seconds")
