package DataStructuresImplementation.Arrays.TwoPointers;

import java.util.HashMap;

public class TwoPointersHashTable {
    public static int[] findPairs(int[] arr, int target) {
        if (arr == null || arr.length < 2) {
            return new int[]{};
        }
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (hashMap.containsKey(target - arr[i])) {
                return new int[]{hashMap.get(target - arr[i]), i};
            }
            hashMap.put(arr[i], i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 4};
        int target = 6;
        int[] res = findPairs(arr, target);
        printArray(res, target);
    }

    private static void printArray(int[] arrResult, int target) {
        if (arrResult.length == 2) {
            System.out.println("Pair found for target " + target + " at indices " + arrResult[0] + " and " + arrResult[1]);
        } else {
            System.out.println("No target found");
        }
    }
}
