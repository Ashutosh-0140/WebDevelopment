import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CreateGraphAL{
    static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w){
            this.src = s;
            this.dest = d;
            this.wt  = w;
        }
    }

    public static void bfs(ArrayList<Edge>[] graph){
        boolean vis[] = new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
            if(!vis[i]){
                bfsUtil(graph,vis);
            }
        }
    }
    public static void bfsUtil(ArrayList<Edge>[] graph,boolean vis[]){
        Queue<Integer> q = new LinkedList<>();
        
        q.add(0); //source = 0

        while(!q.isEmpty()){
            int curr = q.remove();
            if(!vis[curr]){
                System.out.print(curr+" ");
                vis[curr] = true;
                for(int i = 0; i < graph[curr].size(); i++){
                    Edge e = graph[curr].get(i);
                    if(!vis[e.dest]){
                        q.add(e.dest);
                    }
                }
            }
        }
    }

    public static void dfs(ArrayList<Edge>[] graph){
        boolean vis[] = new boolean[graph.length];
        for(int i = 0; i<graph.length;i++){
            if(!vis[i]){
                dfsUtil(graph, i, vis);
            }
        }
    }
    public static void dfsUtil(ArrayList<Edge>[] graph, int curr, boolean vis[]){
        //visit current
        System.out.print(curr+" ");
        vis[curr] = true;
        for(int i = 0; i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]){
                dfsUtil(graph,e.dest,vis);
            }
        }
    }

    //has path
    public static boolean hasPath(ArrayList<Edge>[] graph, int src, int dest, boolean vis[]){
        if(src == dest){
            return true;
        }
        for(int i = 0; i<graph[src].size();i++){
            Edge e = graph[src].get(i);
            if(!vis[e.dest] && hasPath(graph, e.dest, dest, vis)){
                return true;
            }
        }
        return false;
    }
    public static void main(String s[]){
        /*
        (0)
         |
        5|
         v
        (1) →3→ (3)
         |       ^
        1|       |
         v       4
        (2) →6→ (4)
        */

        int V = 5;
        //int arr[] = new int[5];
        ArrayList<Edge>[] graph = new ArrayList[V];

        for(int i = 0;i<V;i++ ){
            graph[i] = new ArrayList<>();
        }
        //0-vertex
        graph[0].add(new Edge(0,1,5));

        //1Vertex
        graph[1].add(new Edge(1,2,1));
        graph[1].add(new Edge(1,0,5));
        graph[1].add(new Edge(1,3,3));

        //2-vertex
        graph[2].add(new Edge(2,1,1));
        graph[2].add(new Edge(2,3,1));
        graph[2].add(new Edge(2,4,2));

        //3-vertex
        graph[3].add(new Edge(3,1,3));
        graph[3].add(new Edge(3,2,1));

        //4-vertex
        graph[4].add(new Edge(4,2,2));


        //Finf 2's neighbour
        for(int i = 0; i<graph[2].size(); i++){
            Edge e = graph[2].get(i);
            System.out.println(e.dest);
        }

        System.out.println("BFS");
        bfs(graph);
        System.out.println();
        System.out.println("DFS");
        dfs(graph);

        //Has path
        System.out.println(hasPath(graph, 0, 1, new boolean[V]));
    }
}