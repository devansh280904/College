import heapq 
def prims_algorithm(graph, n): 
    visited = [False] * n 
    mst_edges = [] 
    min_heap = [(0, 0, -1)]  
    total_weight = 0 
    while len(mst_edges) < n - 1: 
        weight, u, parent = heapq.heappop(min_heap) 
        if visited[u]: 
            continue 
        visited[u] = True     
        if parent != -1: 
            mst_edges.append((parent, u, weight)) 
            total_weight += weight  
        for v, w in enumerate(graph[u]): 
            if not visited[v] and w > 0: 
                heapq.heappush(min_heap, (w, v, u)) 
    return mst_edges, total_weight 
n = int(input("Enter the number of nodes: ")) 
print("Enter the adjacency matrix (use 0 for no direct edge between nodes):") 
graph = [] 
for _ in range(n): 
    row = list(map(int, input().split())) 
    graph.append(row) 
mst_edges, total_weight = prims_algorithm(graph, n) 
print(f"\nMinimum Spanning Tree edges (parent -> child : weight):") 
for u, v, weight in mst_edges: 
    print(f"{u} -> {v} : {weight}") 
print(f"\nTotal weight of the Minimum Spanning Tree: {total_weight}") 