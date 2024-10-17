import time


def MergeSort(arr):
    if len(arr)<=1:
        return arr
    else:
        mid=len(arr)//2
        left=MergeSort(arr[:mid])
        right=MergeSort(arr[mid:])
        return Merge(left,right)

def Merge(left,right):
    sl=[]
    i=0
    j=0
    while i < len(left) and  j < len(right):
        if left[i] < right[j]:
            sl.append(left[i])
            i += 1
        else: 
            sl.append(right[j])
            j += 1
    sl.extend(left[i:])
    sl.extend(right[j:])
    return sl

num=int(input("Enter size of array: "))
arr=[]

for i in range(num):
    val=int(input("Enter the values: "))
    arr.append(val)
print("Unsorted Array:",arr)  
start=time.time()
res=MergeSort(arr)
end=time.time()
print("Sorted Array:",res)
print("Execution time:",end-start,"seconds")

