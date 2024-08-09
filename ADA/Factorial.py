# Implementation and Time analysis of factorial program using iterative and recursive method.

import time

start=time.time()

# Iterative method
def Fact(num):
    fact=1
    for i in range (1,num+1):
        fact=fact*i
    return fact

# Recursive method
def Fact1(num):
    if num==0:
        return 1
    else:
        return num*Fact1(num-1)

num=int(input("Enter the Number:"))
end=time.time()

print("Factorial of Given Number in Iterative method:",Fact(num))
print("Factorial of Given Number in Recursive method:",Fact1(num))
print("Execution time:",end-start,"seconds")
