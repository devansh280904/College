# Implementation and Time analysis of factorial program using iterative and recursive method.

import time

# Iterative method
start=time.time()
def Fact(num):
    fact=1
    for i in range (1,num+1):
        fact=fact*i
    return fact
end=time.time()

# Recursive method
start1=time.time()
def Fact1(num):
    if num==0:
        return 1
    else:
        return num*Fact1(num-1)
end1=time.time()

num=int(input("Enter the Number:"))

print("Factorial of Given Number in Iterative method:",Fact(num))
print("Execution time in Iterative method:",end-start,"seconds")
print("Factorial of Given Number in Recursive method:",Fact1(num))
print("Execution time in Recursive method:",end1-start1,"seconds")
