import time
start=time.time()

def quick_sort(arr,l,r):
    if l<r:
        loc=Partition(arr,l,r)
        quick_sort(arr,l,loc-1)
        quick_sort(arr,loc+1,r)

def Partition(arr,l,r):
    pivot=arr[l]
    start= l + 1
    end=r
    while(start <= end):
        while(start <= end and arr[start] <= pivot):                                                                                                                                                                                                                                       
            start += 1
        while(arr[end]>pivot):
            end -= 1 
        if(start < end):
            arr[start], arr[end]= arr[end], arr[start]
    arr[l], arr[end] = arr[end], arr[l]
    return end
end=time.time()

num=int(input("Enter size of array: "))
arr=[]

for i in range(num):
    val=int(input("Enter the values: "))
    arr.append(val)
print("Unsorted Array:",arr)

quick_sort(arr,0,len(arr)-1)
print("Sorted Array:",arr)
print("Execution time:",end-start,"seconds")
