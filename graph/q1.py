from collections import deque

def shortest_path(n, edges, source):
    graph = [[] for _ in range(n)]
    
    for u, v in edges:
        graph[u].append(v)
        graph[v].append(u)

    dist = [-1] * n
    dist[source] = 0

    q = deque([source])

    while q:
        node = q.popleft()
        for nbr in graph[node]:
            if dist[nbr] == -1:
                dist[nbr] = dist[node] + 1
                q.append(nbr)

    return dist

print(shortest_path(6, [[0,1],[0,2],[1,3],[2,4],[3,5]], 0))
