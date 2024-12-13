package DataStructures4.Graphs;

import java.util.*;

public class TopologicalSort {
    public static void main(String[] args) {   // Constructing the AdjacentList dynamically.
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of Nodes: ");
        int nodes = sc.nextInt();

        System.out.print("Enter the number of Edges: ");
        int edges = sc.nextInt();


        // Create the Graph
        List<List<Integer>> graph = createGraph(nodes, edges);

        System.out.println("Adjacency List");
        for (int i = 0; i < graph.size(); i++) {
            System.out.println(i + "->" + graph.get(i));
        }


        List<Integer> topOrder = topSort(nodes,graph);
        System.out.println("Topological order: " + topOrder);
    }
    public static List<List<Integer>> createGraph(int nodes, int edges) {
        // Initializes the Adjacency List
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < nodes; i++) {
            graph.add(new ArrayList<>());
        }

        // Take Input for the edges
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Edges in the format: from to:");

        for (int i = 0; i < edges; i++) {
            int from = sc.nextInt();
            int to = sc.nextInt();
            graph.get(from).add(to);   // Add the edge.
        }
        return graph;
    }

    public static List<Integer> topSort(int nodes, List<List<Integer>> graph) {
        // calculating the in-degree of all vertices.
        int[] in = new int[nodes];
        for (int i = 0; i < nodes; i++) {
            for (int neighbor : graph.get(i)) {
                in[neighbor]++;
            }
        }

        // Adding the nodes of in degree 0 into the Queue.
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < nodes; i++) {
            if (in[i] == 0) {
                queue.add(i);
            }
        }

        //
        List<Integer> ans = new ArrayList<>();
        while (!queue.isEmpty()) {
            int c = queue.poll();
            ans.add(c);
            for (int neigh : graph.get(c)) {
                in[neigh]--;
                if (in[neigh] == 0) {
                    queue.add(neigh);
                }
            }
        }
        // Cycle Detection
        if (ans.size() != nodes) {
            throw new RuntimeException("Cycle detected in the graph");
        }
        return ans;
    }
}
