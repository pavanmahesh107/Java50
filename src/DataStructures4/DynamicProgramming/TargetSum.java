package DataStructures4.DynamicProgramming;

import java.util.HashMap;
import java.util.Map;

public class TargetSum {
    public int findTargetSumWays(int[] nums, int target){
        // Memoization map to store
        Map<String, Integer> memo = new HashMap<>();
        return backTrack(nums,target,0,0,memo);
    }

    public int backTrack(int[] nums, int target, int i,int total, Map<String,Integer> memo ){
        if(nums.length == i){
            if(total == target){
                return 1;
            } else {
                return 0;
            }
        }
        // create a unique key for the current state.
        String key = i + " , " + total;

        if(memo.containsKey(key)){
            return memo.get(key);
        }

        int add = backTrack(nums,target,i+1,total + nums[i],memo);
        int subtract = backTrack(nums,target,i+1,total - nums[i],memo);

        memo.put(key,add + subtract);

        return memo.get(key);
    }
    public static void main(String[] args) {
        TargetSum targetSum = new TargetSum();
        int[] nums = {1,0,1,1};
        int target = 1;

        System.out.println("number of ways: " + targetSum.findTargetSumWays(nums,target));
    }
}
