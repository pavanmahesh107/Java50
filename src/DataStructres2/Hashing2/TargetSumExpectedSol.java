package DataStructres2.Hashing2;

import java.util.HashSet;

public class TargetSumExpectedSol {
    public static boolean ExpectedSol(int[] Arr, int P){
        HashSet<Integer> set = new HashSet<>();
        set.add(Arr[0]);
        for(int i = 1; i < Arr.length;i++){
            int X = P - Arr[i];
            if(set.contains(X)){
                return true;
            } else {
                set.add(i);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] Arr = {8, 9, 1, -2, 4, 5, 10, -6, 4};
        int P = 18;
        System.out.println(ExpectedSol(Arr,P));
    }
}

// The Time complexity is 0(n) and Space complexity is 0(1).