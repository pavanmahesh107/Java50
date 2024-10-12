package DataStructuresImplementation.Arrays.TwoPointers;

// Two pointers sum for a multiple pairs. If the array is Sorted.

import java.util.ArrayList;
import java.util.List;

public class TwoPointersforManyoutput {
    public static List<int[]> findPairs(int[] arr, int target){
        List<int[]> pairs = new ArrayList<>();
        int left = 0;
        int right = arr.length -1;

        while(left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                pairs.add(new int[]{arr[left], arr[right]});
                left++;
                right--;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return pairs;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 5, 6, 7};
        int target = 7;

        System.out.println("Array:");
        printArray(arr);
        System.out.println("\nPairs with sum " + target + ":");
        List<int[]> pairs = findPairs(arr, target);
        for (int[] pair : pairs) {
            System.out.println(pair[0] + ", " + pair[1]);
        }
    }
        private static void printArray(int[] arr){
            for(int num : arr){
                System.out.print(num + " ");
            }
            System.out.println();
        }
}
