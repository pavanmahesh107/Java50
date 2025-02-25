package DataStructures4.Recursion;

import java.util.ArrayList;
import java.util.List;

// Printing subsequences whose sum is K.
public class PrintingSubSumK {
   private static void whosesumk(int ind, int n, int sum, List<Integer> list,int k,int[] arr){
       if(ind == n){
           if(sum == k){
               System.out.println(list);
               }
               return;
       }
       list.add(arr[ind]);
       sum += arr[ind];
       whosesumk(ind +1,n,sum,list,k,arr);
       list.remove(list.size() -1);
       sum -= arr[ind];
       whosesumk(ind + 1,n,sum,list,k,arr);
   }
    public static void main(String[] args) {
        int[] arr = {1,2,1};
        int n = arr.length;
        int k = 2;
        List<Integer> list = new ArrayList<>(n);
        whosesumk(0,n,0,list,k,arr);
    }
}
