package DataStructures4.Graphs;

import java.util.Scanner;
import java.util.Stack;

public class AdjacencyMatrix {
    public static int cycleDetection(int startNode, int[][] adjMat,int A){
        boolean[] visited = new boolean[A];
        int[] parent = new int[A];
        Stack<Integer> stack  = new Stack<>();

        visited[startNode] = true;
        stack.push(startNode);

        while(!stack.isEmpty()){
            int currenNode = stack.pop();
            System.out.println(currenNode + " ");

            for(int neighbor = 0; neighbor < A; neighbor++){


            }
        }

        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input no.of edges and Nodes.
        System.out.print("Enter no.of Nodes: ");
        int A = sc.nextInt();

        System.out.print("Enter no.of Edges: ");
        int M = sc.nextInt();

        // Initialize the Adjacent matrix.
        int[][] adjMat = new int[A][A];

        // Input Edges
        System.out.println("Enter edges (u V) where u & v are Nodes (1-based index)");
        for(int i = 0; i < M; i++){
            int u = sc.nextInt() - 1; // Convert to 0 based index.
            int v = sc.nextInt() - 1; // Convert to 0 based index.

            adjMat[u][v] = 1;  // Mark Edge from u to v.
            adjMat[v][u]  = 1; // Uncomment for undirected graphs.

        }
       //  Print the Adjacent Matrix.
        System.out.println("Adjacent Matrix");
        for(int i = 0 ; i < A;i++){
            for(int j = 0; j < A; j++){
                System.out.print(adjMat[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
