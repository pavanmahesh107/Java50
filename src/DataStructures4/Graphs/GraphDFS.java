package DataStructures4.Graphs;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GraphDFS {
    public static void dfsIterative(int startNode, List<List<Integer>> AdjList, int n){
        boolean[] visited = new boolean[n];
        Stack<Integer> stack = new Stack<>();
        stack.push(startNode);
        visited[startNode] = true;

        while (!stack.isEmpty()){
            int currentNode = stack.pop();
            System.out.print(currentNode + " ");

                for(int neighbour : AdjList.get(currentNode)){
                    if (!visited[neighbour]){
                        stack.push(neighbour);
                        visited[neighbour] = true;
                    }
                }
            }
        }

    public static void main(String[] args) {
        int n = 5;
        // Representation of the graph using the Adjacency List.
        List<List<Integer>> AdjList = new ArrayList<>();

        // Initialization of Adjacency List
        for(int i = 0; i < n; i++){
            AdjList.add(new ArrayList<>());
        }

        // Adding elements to the Adjacency List.

        AdjList.get(0).add(1);
        AdjList.get(0).add(2);
        AdjList.get(1).add(3);
        AdjList.get(1).add(4);
        AdjList.get(2).add(3);

        System.out.println("DFS traversal starting from node 0:");
        dfsIterative(0,AdjList,n);
    }
}
