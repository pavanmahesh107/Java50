package DataStructuresImplementation;

public class TwoPointersExp {
    public static boolean findPairWithSum(int[] arr, int target) {
        int left = 0; // Start pointer
        int right = arr.length - 1; // End pointer

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                System.out.println("Pair found: (" + arr[left] + "," + arr[right]+")");
                return true;
            }
            if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        System.out.println("No pair found with the given target sum");
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 8, 11};
        int target = 10;
        findPairWithSum(arr, target);
    }
}
