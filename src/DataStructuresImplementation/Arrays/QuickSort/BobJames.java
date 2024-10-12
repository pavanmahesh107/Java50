package DataStructuresImplementation.Arrays.QuickSort;

public class BobJames {
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int piv = partiton(arr, low, high);
            quickSort(arr, low, piv - 1);
            quickSort(arr, piv +1, high);
        }
    }

    public static int partiton(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;

                // Swap arr[i] and arr[j]

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Swap Arr[i+1] and Arr[high]

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static int getMaxScore(int[] Bob, int[] James) {
        int n = Bob.length;

        quickSort(Bob, 0, n - 1);
        quickSort(James, 0, n - 1);

        int maxScore = 0;

        for (int i = 0; i < n; i++) {
            if (Bob[i] > James[i]) {
                maxScore += (Bob[i] - James[i]);
            }
        }
        return maxScore;
    }

    public static void main(String[] args) {
        int[] Bob = {8, 3, 7, 5, 1};
        int[] James = {6, 2, 9, 4, 2};

        int maxScore = getMaxScore(Bob, James);
        System.out.println("Maximum Score can bob get is:" + maxScore);
    }
}
