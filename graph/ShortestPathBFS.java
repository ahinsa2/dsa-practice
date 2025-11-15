import java.util.*;

public class ShortestPathBFS {
    public static int[] shortestPath(int n, int[][] edges, int source) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) graph.add(new ArrayList<>());

        for (int[] e : edges) {
            graph.get(e[0]).add(e[1]);
            graph.get(e[1]).add(e[0]);
        }

        int[] dist = new int[n];
        Arrays.fill(dist, -1);
        dist[source] = 0;

        Queue<Integer> q = new LinkedList<>();
        q.add(source);

        while (!q.isEmpty()) {
            int node = q.poll();
            for (int nbr : graph.get(node)) {
                if (dist[nbr] == -1) {
                    dist[nbr] = dist[node] + 1;
                    q.add(nbr);
                }
            }
        }
        return dist;
    }

    public static void main(String[] args) {
        int[][] edges = {{0,1},{0,2},{1,3},{2,4},{3,5}};
        System.out.println(Arrays.toString(shortestPath(6, edges, 0)));
    }
}
