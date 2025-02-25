package DataStructures4.Recursion;

import java.util.ArrayList;
import java.util.List;

// Print All subsequences using Recursion
public class PrintAll {
    public static void subsequences(int ind,int n,List<Integer> list,int[] arr){
        // Base case
        if(ind >= n){
            System.out.println(list);
            return;
        }
        list.add(arr[ind]);
        subsequences(ind + 1,n,list,arr);  // Take
        list.remove(list.size() - 1);
        subsequences(ind + 1,n,list,arr);  // Not Take
    }
    public static void main(String[] args) {
        int[] arr = {3,1,2};
        int n = arr.length;
        List<Integer> list = new ArrayList<>(n);
        subsequences(0,n,list,arr);
    }
}
