package DataStructures4.Graphs;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class NTowns {
    public static int allTowns(int n, List<List<Integer>> AdjList, int B, int C) {
        boolean[] visited = new boolean[n];
        Stack<Integer> stack = new Stack<>();

        stack.push(C);

        while (!stack.isEmpty()) {
            int currentNode = stack.pop();

            if (currentNode == B) {
                return 1;
            }

            // Mark the current Node visited aa true.
            visited[currentNode] = true;

            for (int neighbor : AdjList.get(currentNode)) {
                if (!visited[neighbor]) {
                    stack.push(neighbor);

                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int n = 5;
        int B = 4;   // Destination
        int C = 2;  // Source

        List<List<Integer>> AdjList = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            AdjList.add(new ArrayList<>());
        }

        // Input Array A
        int[] A = {1, 1, 2, 3};

        for (int i = 1; i < A.length; i++) {
            AdjList.get(A[i]).add(i + 1);  //  Directed edge from A[i] to i+1
        }
        System.out.println("Is town " + B + " reachable  from town " + C + " ?");
        int result = allTowns(n, AdjList, B, C);
        System.out.println(result == 1 ? "Yes" : "No");
    }
}
