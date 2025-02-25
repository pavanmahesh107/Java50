package DataStructures4.DynamicProgramming;

public class FrogJumpSpaceOpt {
    public static void main(String[] args) {
        int[] height = {30,10,60,10,60,50};
        int n = height.length;
        int prev = 0;
        int prev2 = 0;

        for(int i = 1;i<n; i++) {

            int jumpOne = prev + Math.abs(height[i] - height[i - 1]);
            int jumpTwo = Integer.MAX_VALUE;
            if (i >= 2) {
                jumpTwo = prev2 + Math.abs(height[i] - height[i - 2]);
                int cur_i = Math.min(jumpOne, jumpTwo);
                prev2 = prev;
                prev = cur_i;
            }
            System.out.println(prev);
        }
    }
}
