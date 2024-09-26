package DataStructres2.Sorting1;

import java.util.Arrays;

public class MergesortedArray {
    public static int[] mergeTwoSortedArray(int[] A, int[] B) {
        int n = A.length;
        int m = B.length;
        int[] res = new int[n + m];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < n && j < m) {
            if (A[i] < B[j]) {
                res[k] = A[i];
                i++;
            } else {
                res[k] = B[j];
                j++;
            }
            k++;
        }
        // If i is left
        while (i < n) {
            res[k] = A[i];
            i++;
            k++;
        }
        // If j is left
        while (j < m) {
            res[k] = B[j];
            j++;
            k++;
        }

        return res;
    }

    public static void print(int[] A) {
        for (int ele : A) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] A = {2, 5, 9, 12, 15};
        int[] B = {3, 6, 8, 10, 16, 18};
        int[] res = mergeTwoSortedArray(A, B);
        print(A);
        print(B);
        print(res);
//        System.out.println(Arrays.toString(res));
//        System.out.println(Arrays.toString(mergeTwoSortedArray(A, B)));
    }
}
