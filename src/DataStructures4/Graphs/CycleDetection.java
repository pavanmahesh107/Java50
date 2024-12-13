package DataStructures4.Graphs;

import java.util.ArrayList;
import java.util.List;

public class CycleDetection {
    // Recursive DFS method.
    public static boolean isCyclic(int startNode, List<List<Integer>> AdjList, boolean[] visit, boolean[] recStack) {
        // Mark the current node as visited and add it to the recursion stack.
        visit[startNode] = true;
        recStack[startNode] = true;

        // Explore all the neighbors.
        for (int neighbor : AdjList.get(startNode)) {
            // If a neighbor is not visited, recursively check for cycle.
            if (!visit[neighbor]) {
                if (isCyclic(startNode, AdjList, visit, recStack)) {
                    return true;
                }
                // If the neighbor is in the recursive stack, a cycle is detected.
            } else if (recStack[neighbor]) {
                return true;
            }
        }
        recStack[startNode] = false;
        return false;
    }


    public static void main(String[] args) {
        int numNodes = 4;
        List<List<Integer>> AdjList = new ArrayList<>();

        for (int i = 0; i < numNodes; i++) {
            AdjList.add(new ArrayList<>());
        }

        AdjList.get(0).add(1);
        AdjList.get(1).add(2);
        AdjList.get(2).add(3);
        AdjList.get(3).add(1);

        boolean[] visit = new boolean[numNodes];
        boolean[] recStack = new boolean[numNodes];

        boolean hasCycle = false;
        for (int i = 0; i < numNodes; i++) {
            if (!visit[i] && isCyclic(i, AdjList, visit, recStack)) {
                hasCycle = true;
                break;
            }
        }

        System.out.println("Graph contains the cycle: " + hasCycle);
    }
}
