package DataStructres2.Sorting1;

public class Bubblesorting {
    public static void bubblesort(int[] Arr) {
        // Bubble sort algorithm
        int n = Arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (Arr[j] > Arr[j + 1]) {
                    // Swap the data of A[j] and A[j+1]
                    int temp = Arr[j];
                    Arr[j] = Arr[j + 1];
                    Arr[j + 1] = temp;
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
        int[] Arr = {2, 9, 10, 11, 3, 4, 77, 6, 8, 1, 4, 2};
        print(Arr);
        bubblesort(Arr);
        print(Arr);
    }
}
