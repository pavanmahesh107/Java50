package DataStructures4.DynamicProgramming;

public class FrogJumpMemo {
    public static int jump(int ind,int[] memo,int[] ene){
        if(ind == 0) return 0;

        if(memo[ind] != 0){
            return memo[ind];
        }
        // Cost for a one-step jump
        int left = jump(ind -1,memo,ene) + Math.abs(ene[ind] - ene[ind -1]);
        int right = Integer.MAX_VALUE;
        if(ind >= 2) {
             right = jump(ind - 2, memo, ene) + Math.abs(ene[ind] - ene[ind - 2]);
        }
        // Store and return the minimum cost.
        memo[ind] = Math.min(left,right);
        return memo[ind];
    }

    public static int jumping(int n,int[] ene){
        int[] memo = new int[n];
        return jump(n -1,memo,ene); // start from the last step.
    }

    public static void main(String[] args) {
        int[] ene = {30,10,60,10,50};
        int n = ene.length;
        System.out.println("minimum energy required: " + jumping(n,ene));
    }
}
