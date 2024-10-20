def knapsack(max_capacity, weights, values, n): 
    dp = [[0 for x in range(max_capacity + 1)] for x in range(n + 1)] 
    for i in range(n + 1): 
        for w in range(max_capacity + 1): 
            if i == 0 or w == 0: 
                dp[i][w] = 0   
            elif weights[i - 1] <= w: 
                dp[i][w] = max(values[i - 1] + dp[i - 1][w - weights[i - 1]], dp[i - 1][w]) 
            else: 
                dp[i][w] = dp[i - 1][w] 
    return dp[n][max_capacity] 
n = int(input("Enter the number of items: ")) 
weights = list(map(int, input(f"Enter the weights of the {n} items (separated by spaces): ").split())) 
values = list(map(int, input(f"Enter the values of the {n} items (separated by spaces): ").split())) 
max_capacity = int(input("Enter the maximum capacity of the knapsack: ")) 

max_value = knapsack(max_capacity, weights, values, n) 
print(f"The maximum value that can be obtained in the knapsack is: {max_value}")
