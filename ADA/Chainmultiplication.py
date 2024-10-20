def matrix_chain_order(p, n): 
    dp = [[0 for _ in range(n)] for _ in range(n)] 
    for length in range(2, n): 
        for i in range(1, n - length + 1): 
            j = i + length - 1 
            dp[i][j] = float('inf') 
            for k in range(i, j): 
                q = dp[i][k] + dp[k + 1][j] + p[i - 1] * p[k] * p[j] 
                if q < dp[i][j]: 
                    dp[i][j] = q 
    return dp[1][n - 1] 
n = int(input("Enter the number of matrices: ")) 
dimensions = list(map(int, input(f"Enter the dimensions of the matrices (separated by spaces): ").split())) 

if len(dimensions) != n + 1: 
    print("Error: The number of dimensions should be equal to the number of matrices + 1.") 
else: 
    min_multiplications = matrix_chain_order(dimensions, n + 1) 
    print(f"The minimum number of multiplications needed to multiply the chain of matrices is: {min_multiplications}")