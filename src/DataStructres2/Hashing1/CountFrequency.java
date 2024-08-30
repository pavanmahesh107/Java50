package DataStructres2.Hashing1;

import java.util.HashMap;

public class CountFrequency {
    public static void frequencyOfElement(int[] A, int[] Q) {
        //make a frequency map
        HashMap<Integer, Integer> freqmap = new HashMap<>();
        // key -> element of array A.
        // value -> frequency of that element.
        for (int ele : A) {
            if (freqmap.containsKey(ele) == false) {
                // insert a new pair of elements with freq = 1
                freqmap.put(ele, 1);
            } else {
                // increase old freq by 1
                int oldFre = freqmap.get(ele);
                freqmap.put(ele, oldFre + 1);
            }
        }

        // Iterate on every query and get the freq from freqmap.
        for (int val : Q) {
            if (freqmap.containsKey(val) == true) {
                System.out.println(val + " : " + freqmap.get(val));
            } else {
                System.out.println(val + " : " + 0);
            }
        }
    }
    public static void main(String[] args) {
        int[] A = {2, 1, 2, 3, 1, 4, 2, 6};
        int[] Q = {2, 1, 2, 4, 6, 5};
        frequencyOfElement(A, Q);
    }
}

 // The Time Complexity is 0(n + q) & Space Complexity is 0(n).