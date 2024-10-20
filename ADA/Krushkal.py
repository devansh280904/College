class Edge: 
    def __init__(self, u, v, weight): 
        self.u = u  
        self.v = v  
        self.weight = weight 
    def __lt__(self, other): 
        return self.weight < other.weight 
def find(parent, i): 
    if parent[i] == i: 
        return i 
    parent[i] = find(parent, parent[i])  
    return parent[i] 
def union(parent, rank, x, y): 
    root_x = find(parent, x) 
    root_y = find(parent, y) 
    if root_x != root_y: 
        if rank[root_x] < rank[root_y]: 
            parent[root_x] = root_y 
        elif rank[root_x] > rank[root_y]: 
            parent[root_y] = root_x 
        else: 
            parent[root_y] = root_x 
            rank[root_x] += 1 
def kruskal(n, edges): 
    edges.sort() 
    mst = [] 
    total_weight = 0 
    parent = [i for i in range(n + 1)]   
    rank = [0] * (n + 1) 
    for edge in edges: 
        u = edge.u 
        v = edge.v 
        root_u = find(parent, u) 
        root_v = find(parent, v) 
        if root_u != root_v: 
            mst.append(edge) 
            total_weight += edge.weight 
            union(parent, rank, root_u, root_v) 
        if len(mst) == n - 1: 
            break 
    return mst, total_weight 
n = int(input("Enter the number of nodes: ")) 
e = int(input("Enter the number of edges: ")) 
edges = [] 
print("Enter the edges in the format: u v weight") 
for _ in range(e): 
    u, v, weight = map(int, input().split()) 
    edges.append(Edge(u, v, weight)) 
mst, total_weight = kruskal(n, edges) 
print(f"\nMinimum Spanning Tree edges (u -> v : weight):") 
for edge in mst: 
    print(f"{edge.u} -> {edge.v} : {edge.weight}") 
print(f"\nTotal weight of the Minimum Spanning Tree: {total_weight}") 