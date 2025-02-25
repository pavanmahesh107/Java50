package DataStructures4.DynamicProgramming;

public class LongestIncreasingSubsequenceusingRecurssion {
    public static int Increasing(int n,int[] nums){
        int count = 0;

        for(int i = 0; i < n; i++){
            if(nums[i] > nums[i+1]) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {10,9,2,5,3,7,10,18};
        int n = nums.length;
        int result = Increasing(n,nums);
        System.out.println(result);
    }
}
