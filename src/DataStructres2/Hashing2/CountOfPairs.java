package DataStructres2.Hashing2;

import java.util.HashMap;

public class CountOfPairs {
    public static int UsingHashing(int[] Array, int Q) {
        int count = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(Array[0], 1);
        for (int i = 1; i < Array.length; i++) {
            int K = Q - Array[i];
            if (hashMap.containsKey(K)) {
                count += hashMap.get(K);
            }
            if (hashMap.containsKey(Array[i])) {
                int oldfre = hashMap.get(Array[i]);
                hashMap.put(Array[i], oldfre + 1);
            } else {
                hashMap.put(Array[i], 1);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] Array = {2, 5, 1, 5, 2, 7, 10, 5};
        int Q = 12;
        System.out.println(UsingHashing(Array, Q));
    }
}
