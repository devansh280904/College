def rabin_karp(text, pattern, prime=101): 
    n = len(text) 
    m = len(pattern) 
    d = 256   
    h = 1   
    p_hash = 0   
    t_hash = 0  
    positions = []  
    for i in range(m - 1): 
        h = (h * d) % prime 
    for i in range(m): 
        p_hash = (d * p_hash + ord(pattern[i])) % prime 
        t_hash = (d * t_hash + ord(text[i])) % prime 
    for i in range(n - m + 1): 
        if p_hash == t_hash: 
            if text[i:i + m] == pattern: 
                positions.append(i) 
        if i < n - m: 
            t_hash = (d * (t_hash - ord(text[i]) * h) + ord(text[i + m])) % prime 
            if t_hash < 0: 
               t_hash += prime 
    return positions 
text = input("Enter the text: ") 
pattern = input("Enter the pattern: ") 
positions = rabin_karp(text, pattern) 
if positions: 
    print("\nPattern found at positions:", " ".join(map(str, positions))) 
else: 
    print("\nPattern not found in the text.")