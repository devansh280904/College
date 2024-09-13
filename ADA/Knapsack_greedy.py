def knapsack(profit,weight,cap):
    ratios = [(profit[i] / weight[i], profit[i], weight[i]) for i in range(num)]
    Sort_items(ratios)
    Total_value=0
    Current_weight=0
    for ratio, value, weight in ratios:
        if Current_weight + weight <= cap:
            Total_value += value
            Current_weight += weight
        else:
            fraction = (cap - Current_weight) / weight
            Total_value += value * fraction
            break
    
    return Total_value

def Sort_items(ratios):
    for i in range(1,len(ratios)):
        j = i
        while j>0 and ratios[j]>ratios[j-1]:
            ratios[j],ratios[j-1]=ratios[j-1],ratios[j]
            j-=1

num=int(input("Enter size of array: "))
profit1=[]
weight1=[]

cap=int(input("Enter the capacity of knapsack"))

for i in range(num):
    val=int(input("Enter the value: "))
    profit1.append(val)


for i in range(num):
    weight=int(input("Enter the weight: "))
    weight1.append(weight)

print("values:",profit1)
print("weights:",weight1)

print("Maximum profit in knapsack:",knapsack(profit1,weight1,cap))
