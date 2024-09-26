package DataStructres2.Sorting1;

public class Insertionsorting {
    public static void insertionSort(int[] Arr) {
        int n = Arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (Arr[j] < Arr[j - 1]) {
                    // Swap curr i.e., Arr[j] with prev. i.e., Arr[j-1]
                    int temp = Arr[j];
                    Arr[j] = Arr[j - 1];
                    Arr[j - 1] = temp;
                } else {
                    // If curr is greater than prev,
                    // that means curr ele is already placed at correct position.
                    break;
                }
            }
        }
    }
    public static void print(int[] Arr) {
        for (int ele : Arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] Arr = {7, 8, 4, 9, 5, 13, 2, 18, 1,};
        print(Arr);
        insertionSort(Arr);
        print(Arr);
    }
}
