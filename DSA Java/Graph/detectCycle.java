import java.util.ArrayList;

public class detectCycle {
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    // Detect cycle in an undirected graph
    public static boolean detectCycle(ArrayList<Edge>[] graph) {
        boolean[] vis = new boolean[graph.length];

        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                if (detectCycleUtil(graph, i, vis, -1)) {
                    return true; // cycle found
                }
            }
        }
        return false; // no cycle
    }

    // Utility DFS for cycle detection
    public static boolean detectCycleUtil(ArrayList<Edge>[] graph, int curr, boolean[] vis, int parent) {
        vis[curr] = true;

        for (Edge e : graph[curr]) {
            if (!vis[e.dest]) {
                if (detectCycleUtil(graph, e.dest, vis, curr)) {
                    return true;
                }
            } else if (e.dest != parent) {
                // visited neighbor that is not parent → cycle
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge>[] graph = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        // Example graph with cycle: 0-1-2-0
        graph[0].add(new Edge(0, 1, 1));
        graph[1].add(new Edge(1, 0, 1));

        graph[1].add(new Edge(1, 2, 1));
        graph[2].add(new Edge(2, 1, 1));

        graph[2].add(new Edge(2, 0, 1));
        graph[0].add(new Edge(0, 2, 1));

        System.out.println("Cycle present? " + detectCycle(graph));
    }
}

