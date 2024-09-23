package DataStructres2.Hashing3;

import java.util.HashMap;
import java.util.HashSet;
public class WindowofSizeB {

    public static int[] distinctNumbers(int[] A, int B) {
        int n = A.length;

        // 1. Size of an answer array + create an answer array.
        int[] ans = new int[n - B + 1];


        // 2. Make a frequency Map & fill it for the first B size window.
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < B; i++) {
            int ele = A[i];
            if (!hashMap.containsKey(A[i])) {
                hashMap.put(ele, 1);
            } else {
                int oldfre = hashMap.get(ele);
                hashMap.put(ele, oldfre + 1);
            }
        }

        int index = 0;
        int S = 1;
        int E = B;

        // Loop through the remaining subarray using the sliding window technique.
        while (E < n) {

            // Calculate the number of distinct elements in the current subarray.
            ans[index] = hashMap.size();
            index++;

            // Remove the impact of A[S-1] from hashMap
            int preElement = A[S - 1];
            if (hashMap.containsKey(preElement)) {
                int freq = hashMap.get(preElement);
                if (freq == 1) {
                    hashMap.remove(preElement);
                } else {
                    hashMap.put(preElement, freq - 1);
                }
            }

            // Add the impact of A[e] in the Map.
            int newElement = A[E];
            int ele = newElement;
            if(!hashMap.containsKey(ele)){
                hashMap.put(ele, 1);
            } else {
                int  oldFreq = hashMap.get(ele);
                hashMap.put(ele, oldFreq +1);
            }

            S++;
            E++;

            // Calculate the number of distinct elements in the lsst  sub array.
            ans[index] = hashMap.size();
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 1, 3, 4, 3};
        int B = 3;

        int result[] = distinctNumbers(A, B);

        for(int i = 0; i < result.length; i++){
            System.out.println( result[i] + " ");
        }
    }
}

