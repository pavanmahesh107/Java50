package DataStructres2.Hashing2;

public class TargetSumPair {

    // Traversal on all possible pairs.
    public static boolean Solve(int[] A, int K) {
        int n = A.length;
        for (int i = 0; i < n; i++) {
            int X = K - A[i];
            for (int j = i + 1; j < n; j++) {
                if (A[j] == X) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] A = {3, 9, 4, 7};
        int K = 16;
        System.out.println(Solve(A,K));
    }
}
// The Time complexity is 0(n^2), and space complexity is 0(1), but the expected Time complexity is 0(n).