package DataStructres2.Hashing2;

import java.util.HashSet;

public class SubArraySumK {
    public static boolean sumk(int[] A, int K){
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;
        set.add(0);  // Edge case
        for(int i = 0; i < A.length; i++){
            sum += A[i];
            int val = sum - K;
            if(set.contains(val)){
                return true;
            } else {
                set.add(sum);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int [] A = {3, 9, -4, 1, 5, 6, 2};
        int K = 23;
        System.out.println(sumk(A,K));
    }
}

// The Time complexity & space complexity is O(n).
