import java.util.*;

public class MinimumStepsMatrix {
    public static int minSteps(int[][] grid) {
        int n = grid.length, m = grid[0].length;

        if (grid[0][0] == 1) return -1;

        boolean[][] visited = new boolean[n][m];
        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};

        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0, 0, 0}); // row, col, distance
        visited[0][0] = true;

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int r = cur[0], c = cur[1], dist = cur[2];

            if (r == n-1 && c == m-1) return dist;

            for (int[] d : dirs) {
                int nr = r + d[0];
                int nc = c + d[1];

                if (nr >= 0 && nr < n && nc >= 0 && nc < m &&
                    !visited[nr][nc] && grid[nr][nc] == 0) {

                    visited[nr][nc] = true;
                    q.add(new int[]{nr, nc, dist + 1});
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[][] grid = {
            {0,0,1},
            {0,0,0},
            {1,0,0}
        };
        System.out.println(minSteps(grid));
    }
}
