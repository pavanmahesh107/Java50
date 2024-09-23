package Experimentations;

public class MaximumAverageSubArray {
    public static double findMaxAvg(int[] nums, int K){
     int sum = 0;
     for(int i = 0; i < K;i++){
         sum += nums[i];
     }
     int maxSum = sum;

     // Start a sliding window
     int startIndex = 0;
     int endIndex = K;
     while (endIndex < nums.length){

         // Remove Previous element
         sum -= nums[startIndex];
         startIndex++;

         // Adding next element
          sum += nums[endIndex];
          endIndex++;

         maxSum = Math.max(maxSum, sum);  // Update max sum
     }
        return (double) maxSum/K;
    }
    public static void main(String[] args) {
        int[] nums = {1, 12, -5, -6, 50, 3};
        int K = 4;

        System.out.println(findMaxAvg(nums,K));
    }
}
