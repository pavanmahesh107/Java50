package DataStructures4.Graphs;

import java.util.*;

public class DijkstraAlgorithm {
    public static int[] dijkstra(List<List<Pair>> graph, int srcNode){
        PriorityQueue<Helper> pq = new PriorityQueue<>(new Comparator<Helper>() {
            @Override
            public int compare(Helper o1, Helper o2) {
                if(o1.distance < o2.distance){
                    return -1;
                } else if (o1.distance > o2.distance){
                    return 1;
                } else {
                    return 0;
                }
            }
        });

        // int ans[n] = Integer.MAX_VALUE;
        int n = graph.size();  // Number of nodes in the graph.
        int[] ans = new int[n];  // Distance Array
        Arrays.fill(ans,Integer.MAX_VALUE); // Initialize all distances to infinity.
        // Arrays.fill() It is used to assign a specified value to each element of an array.

        pq.add(new Helper(srcNode,0));
        while (!pq.isEmpty()){
            Helper helper = pq.poll();
            int node = helper.node;
            int distance = helper.distance;

            if(ans[node] == Integer.MAX_VALUE) {
                ans[node] = distance;
                for (Pair neigh : graph.get(node)) {
                    if (ans[neigh.neighbornode] == Integer.MAX_VALUE) {
                        pq.add(new Helper(neigh.neighbornode, neigh.weight + distance));
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of Nodes:");
        int nodes = sc.nextInt();

        System.out.print("Enter the number of Edges:");
        int edges = sc.nextInt();

        List<List<Pair>> graph = new ArrayList<>();
        for(int i = 0; i < nodes; i++){
            graph.add(new ArrayList<>());
        }

        // Add edges to the graph.
        System.out.println("Enter Edges (format: source destination weight):");
        for(int i = 0; i < edges; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            int weight = sc.nextInt();

            graph.get(u).add(new Pair(v,weight));
            graph.get(v).add(new Pair(u,weight));
        }

        System.out.println("Enter the source node");
        int srcNode = sc.nextInt();

        int[] distance = dijkstra(graph,srcNode);

        for(int i = 0; i < distance.length;i++){
            System.out.println(distance[i]);
        }

    }
}
