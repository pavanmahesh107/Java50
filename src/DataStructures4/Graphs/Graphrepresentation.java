package DataStructures4.Graphs;

// using Pair class for better readability and maintainability.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Graphrepresentation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of nodes:");
        int nodes = sc.nextInt();

        System.out.print("Enter the number of Edges:");
        int edges = sc.nextInt();

        List<List<Pair>> graph = new ArrayList<>();
        for(int i = 0 ;i < nodes; i ++){
            graph.add(new ArrayList<>());
        }

        // Add edges into the graph.
        System.out.println("Enter the edges in the format: source destination weight");
        for(int i = 0; i < edges; i++) {
            int u = sc.nextInt();  // source node
            int v = sc.nextInt();  // destination node
            int weight = sc.nextInt(); // weight of the edge

            // Add the edge to the graph

            graph.get(u).add(new Pair(v, weight));  // graph.get(u) -> retrieves the list of neighbors for node u.
            // add(new pair(v,weight) -> adds a new edge to the list
            // where v is the destination & weight is the distance between u and v.
            graph.get(v).add(new Pair(u, weight));
        }

        // print the adjacency List
        for(int i = 0; i < nodes; i ++){
            System.out.print("Node " + i + ": ");
            for(Pair pair : graph.get(i)){
                System.out.print("[" +pair.neighbornode + "  " +pair.weight+ "]");
            }
            System.out.println();
        }
        sc.close();
    }
}
