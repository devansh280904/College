from collections import defaultdict, deque 
class Graph: 
    def __init__(self): 
        self.graph = defaultdict(list) 
    def add_edge(self, u, v): 
        self.graph[u].append(v) 
    def bfs(self, start_node): 
        visited = set() 
        queue = deque([start_node]) 
        visited.add(start_node) 
        bfs_order = [] 
        while queue: 
            node = queue.popleft() 
            bfs_order.append(node) 
            for neighbor in self.graph[node]: 
                if neighbor not in visited: 
                    queue.append(neighbor) 
                    visited.add(neighbor) 
        return bfs_order 
g = Graph() 
n = int(input("Enter the number of nodes: ")) 
e = int(input("Enter the number of edges: ")) 
 
print("Enter the edges (u v) representing an edge from node u to node v:") 
for _ in range(e): 
    u, v = map(int, input().split()) 
    g.add_edge(u, v) 
start_node = int(input("Enter the starting node for BFS: ")) 
bfs_result = g.bfs(start_node) 
print("\nBreadth-First Search traversal order:") 
print(" -> ".join(map(str, bfs_result))) 
from collections import defaultdict, deque 
class Graph: 
    def __init__(self): 
        self.graph = defaultdict(list) 
    def add_edge(self, u, v): 
        self.graph[u].append(v) 
    def bfs(self, start_node): 
        visited = set() 
        queue = deque([start_node]) 
        visited.add(start_node) 
        bfs_order = [] 
        while queue: 
            node = queue.popleft() 
            bfs_order.append(node) 
            for neighbor in self.graph[node]: 
                if neighbor not in visited: 
                    queue.append(neighbor) 
                    visited.add(neighbor) 
        return bfs_order 
g = Graph() 
n = int(input("Enter the number of nodes: ")) 
e = int(input("Enter the number of edges: ")) 
print("Enter the edges (u v) representing an edge from node u to node v:") 
for _ in range(e): 
    u, v = map(int, input().split()) 
    g.add_edge(u, v) 
start_node = int(input("Enter the starting node for BFS: ")) 
bfs_result = g.bfs(start_node) 
print("\nBreadth-First Search traversal order:") 
print(" -> ".join(map(str, bfs_result)))