from collections import defaultdict 
class Graph: 
    def __init__(self): 
        self.graph = defaultdict(list) 
    def add_edge(self, u, v): 
        self.graph[u].append(v) 
    def dfs(self, start_node): 
        visited = set() 
 
        dfs_order = [] 
        self._dfs_recursive(start_node, visited, dfs_order) 
        return dfs_order 
    def _dfs_recursive(self, node, visited, dfs_order): 
        visited.add(node) 
        dfs_order.append(node) 
        for neighbor in self.graph[node]: 
            if neighbor not in visited: 
                self._dfs_recursive(neighbor, visited, dfs_order) 
g = Graph() 
n = int(input("Enter the number of nodes: ")) 
e = int(input("Enter the number of edges: ")) 
print("Enter the edges (u v) representing an edge from node u to node v:") 
for _ in range(e): 
    u, v = map(int, input().split()) 
    g.add_edge(u, v) 
start_node = int(input("Enter the starting node for DFS: ")) 
dfs_result = g.dfs(start_node) 
print("\nDepth-First Search traversal order:") 
print(" -> ".join(map(str, dfs_result)))