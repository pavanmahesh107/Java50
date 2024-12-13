package DataStructures4.GreedyAlgorithms;

import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {
    public static double getMaxProtein(int[] wt, int[] protein, int k){
        int n = wt.length;
        Pair[] arr = new Pair[n];

        // Step 1: create pair objects for each item with weight, protein and ppk values.
        for(int i = 0; i < n; i++){
             arr[i] = new Pair(wt[i],protein[i]);
        }

        // Step 2: Sort items by protein to weight ratio(ppk) is ascending order.
        Arrays.sort(arr, new Comparator<Pair>() {
            @Override
            public int compare(Pair P1, Pair P2) {
                return Double.compare(P1.ppk,P2.ppk);
            }
        });

        // Step 3: Iterate from highest to lowest ppk (from left to right after sorting)
        double ans = 0;
        for(int i = n-1; i >= 0; i--){
           Pair p  = arr[i];
           if(p.weight <= k){
               ans += p.protein;
               k -= p.weight;
           } else {
               // Only part of the item can be consumed to fill the remaining capacity.
               ans += (k * p.ppk);
               break;
           }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] wt = {20,15,50,10,25,12,5};
        int[] protein = {200,180,250,150,200,132,100};
        int k = 70;

        double res = getMaxProtein(wt,protein,k);
        System.out.println("Maximum protein we can get is: " +res);
    }
}
