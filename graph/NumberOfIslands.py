import java.util.*;

public class NumberOfIslands {
    public static int numIslands(char[][] grid) {
        int n = grid.length, m = grid[0].length;
        boolean[][] visited = new boolean[n][m];
        int count = 0;

        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == '1' && !visited[i][j]) {
                    count++;
                    Queue<int[]> q = new LinkedList<>();
                    q.add(new int[]{i, j});
                    visited[i][j] = true;

                    while (!q.isEmpty()) {
                        int[] cell = q.poll();
                        int x = cell[0], y = cell[1];

                        for (int[] d : dirs) {
                            int nx = x + d[0];
                            int ny = y + d[1];

                            if (nx >= 0 && nx < n && ny >= 0 && ny < m &&
                                grid[nx][ny] == '1' && !visited[nx][ny]) {
                                visited[nx][ny] = true;
                                q.add(new int[]{nx, ny});
                            }
                        }
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        char[][] grid = {
            {'1','1','0','0'},
            {'0','1','0','1'},
            {'0','0','1','1'}
        };
        System.out.println(numIslands(grid));
    }
}
