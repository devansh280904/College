import time

#Recursive method
start=time.time()
def LinearSearch(arr,num,i=0):
    if arr[i]==len(arr):
        return -1
    if arr[i]==num:
        return i
    return LinearSearch(arr,num,i+1)


num=int(input("Enter size of array: "))
arr=[]

for i in range(num):
    val=int(input("Enter the values(sorted): "))
    arr.append(val)

num=int(input("Enter element to be searched:"))

res=LinearSearch(arr,num)
end=time.time()

if res !=-1:
    print("Element is found at index:",res)
else:
    print("Element is not found.")

print("Execution time in recursive method:",end-start,"seconds")
    
