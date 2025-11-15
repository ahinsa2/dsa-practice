from collections import deque

def min_steps(grid):
    n, m = len(grid), len(grid[0])
    if grid[0][0] == 1:
        return -1
    
    dirs = [(1,0),(-1,0),(0,1),(0,-1)]
    visited = [[False]*m for _ in range(n)]
    
    q = deque([(0, 0, 0)])  # r, c, dist
    visited[0][0] = True
    
    while q:
        r, c, dist = q.popleft()
        
        if r == n-1 and c == m-1:
            return dist
        
        for dx, dy in dirs:
            nr, nc = r + dx, c + dy
            if 0 <= nr < n and 0 <= nc < m and not visited[nr][nc] and grid[nr][nc] == 0:
                visited[nr][nc] = True
                q.append((nr, nc, dist + 1))
    
    return -1

grid = [
    [0,0,1],
    [0,0,0],
    [1,0,0]
]

print(min_steps(grid))
