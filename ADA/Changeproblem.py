def min_coins(coins, amount): 
    dp = [float('inf')] * (amount + 1) 
    dp[0] = 0  
    for coin in coins: 
        for x in range(coin, amount + 1): 
            dp[x] = min(dp[x], dp[x - coin] + 1) 
    return dp[amount] if dp[amount] != float('inf') else -1 
coins = list(map(int, input("Enter coin denominations (space-separated): ").split())) 
amount = int(input("Enter the amount to make: ")) 
result = min_coins(coins, amount) 
if result != -1: 
    print(f"The minimum number of coins required to make {amount} is: {result}") 
else: 
    print(f"It's not possible to make {amount} with the given coin denominations.")