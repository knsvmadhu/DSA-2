import java.util.*;

public class ConnectedComponents {
    static ArrayList<Integer>[] graph;
    static boolean[] visited;

    static void dfs(int v) {
        visited[v] = true;

        for(int u : graph[v]) {
            if(!visited[u])
                dfs(u);
        }
    }

    public static void main(String[] args) {
        int V = 9;

        graph = new ArrayList[V];
        visited = new boolean[V];

        for(int i=0;i<V;i++)
            graph[i] = new ArrayList<>();

        graph[0].add(1);
        graph[1].add(2);
        graph[2].add(0);

        int count = 0;

        for(int i=0;i<V;i++) {
            if(!visited[i]) {
                dfs(i);
                count++;
            }
        }

        System.out.println("Components = " + count);
    }
}
