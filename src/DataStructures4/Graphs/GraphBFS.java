package DataStructures4.Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GraphBFS {
    public static void bfs(int startNode, List<List<Integer>> adjList, int n) {
        boolean[] visited = new boolean[n];
        Queue<Integer> queue = new LinkedList<>();


        queue.add(startNode);
        visited[startNode] = true;

        // Traverse the graph
        while (!queue.isEmpty()) {  // The loop will iterate until the queue becomes empty
            int currentNode = queue.poll();
            System.out.print(currentNode + " ");

            for (int neighbour : adjList.get(currentNode)) { // Retrieves the list of neighbors (adjacent nodes) of the currentNode from the adjacency list.
                if (!visited[neighbour]) {
                    queue.add(neighbour);
                    visited[neighbour] = true;
                }
            }
        }
    }
    public static void main(String[] args) {
        int n = 5;  // Number of Vertices.
        // Represent the Graph using an Adjacency list.
        List<List<Integer>> adjList = new ArrayList<>();

        // Initialize adjacency List.
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }

        adjList.get(0).add(1);
        adjList.get(0).add(2);
        adjList.get(1).add(3);
        adjList.get(1).add(4);
        adjList.get(2).add(3);
        adjList.get(3).add(4);

        System.out.println("BFS Starting from node 0: ");
        bfs(0, adjList, n);
    }
}
