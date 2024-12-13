package DataStructures4.Graphs;

import java.util.ArrayList;
import java.util.List;

public class CycleinUndirectedgraph {

    public static boolean hasCycle(int nodes, List<List<Integer>> nondirGra){
        boolean[] visit = new boolean[nodes];  // visited array.

        // Travel all the node to handle disconnected Components.
        for(int i = 0; i < nodes; i++){
            if(!visit[i]){
              if(cycle(i,-1,visit,nondirGra)) {
                  return true;
              }
            }
        }
        return false; // No cycle detected.
    }

    public static boolean cycle(int node, int parent,boolean[] visit,List<List<Integer>> nondirGra){
        visit[node] = true;  // Mark the current node as visited.

        for(int neighbor : nondirGra.get(node)){

        }


        return false;
    }

    public static void main(String[] args) {
        int nodes = 5;
        List<List<Integer>> nondirGra = new ArrayList<>();

        for(int i  = 0; i < nodes; i++){
            nondirGra.add(new ArrayList<>());
        }

        nondirGra.get(0).add(1);
        nondirGra.get(1).add(0);
        nondirGra.get(1).add(2);
        nondirGra.get(2).add(1);
        nondirGra.get(2).add(3);
        nondirGra.get(3).add(2);
        nondirGra.get(3).add(4);
        nondirGra.get(4).add(3);
    }
}
