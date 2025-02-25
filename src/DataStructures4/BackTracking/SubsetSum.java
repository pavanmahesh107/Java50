package DataStructures4.BackTracking;

public class SubsetSum {
    public static int contSubSets(int[] arr,int n,int k){
        // BaseCase - if a sum becomes 0, We found a subset.
        if(k == 0) return 1;
        //
        if(n == 0) return 0;


        if(arr[n-1] <= k){
              return contSubSets(arr,n-1,k - arr[n-1]) +
                      contSubSets(arr,n -1,k);
          } else {
               return contSubSets(arr,n -1, k);
          }
    }
    public static void main(String[] args) {
        int[] arr = {2,3,5,6,8,10};
        int k = 10;
        int n = arr.length;
        System.out.println("Count of subsets with sum = "+ k + ": " + contSubSets(arr,n,k));
    }
}
