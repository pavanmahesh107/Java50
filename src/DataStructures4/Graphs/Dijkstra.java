package DataStructures4.Graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class Dijkstra {
    static class Node implements Comparable<Node>{
        int vertex;
        int weight;

        Node(int vertex, int weight){
            this.vertex = vertex;
            this.weight = weight;
        }

        @Override
        public int compareTo(Node Other) {
            return this.weight - Other.weight;
        }
    }

    public static void shortestPath(int startNode, List<List<Node>> adjList,int numVertices){
        int[] distances = new int[numVertices];  // Stores shortest distances.
        Arrays.fill(distances,Integer.MAX_VALUE);  // Initializes the distances to Infinity
        distances[startNode] = 0;

        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.add(new Node(startNode,0));

        // Incomplete


    }

    public static void main(String[] args) {
        int numVertices = 5;

        // Represent the graph using the Adjacency List.
        List<List<Node>> adjList = new ArrayList<>();

        // Initialize the Adjacency List
        for(int i = 0; i < numVertices; i++){
            adjList.add(new ArrayList<>());
        }

        // Adding vertices to the Adjacency List.
        adjList.get(0).add(new Node(1,2));
        adjList.get(0).add(new Node(2, 4));
        adjList.get(1).add(new Node(2, 1));
        adjList.get(1).add(new Node(3, 7));
        adjList.get(2).add(new Node(4, 3));
        adjList.get(3).add(new Node(4, 1));
    }
}
