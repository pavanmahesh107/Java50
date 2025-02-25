package DataStructures4.DynamicProgramming;

public class ClimbingStairs {
    public static int stairs(int ind){
        if(ind <= 2) return ind;

        int r = stairs(ind -1);
        int l = stairs(ind -2);

        return r+l;
    }

    // Using a Memoization Climbing Stairs problem.
//    public static int memoStairs(int ind, int[] memo){
//        if(ind <= 2) return ind;
//
//        if(memo[ind] != 0){
//            return memo[ind];
//        }
//        memo[ind] = memoStairs(ind -1,memo) + memoStairs(ind -2,memo);
//        return memo[ind];
//    }
//    public static int stairs(int n){
//        int[] memo = new int[n+1];
//        return memoStairs(n,memo);
//    }
    public static void main(String[] args) {

        System.out.println(stairs(4));
    }
}
