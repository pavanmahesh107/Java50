package DataStructres2.Hashing1;

import java.util.HashMap;

public class CountFrequency {
    public static void frequencyOfElement(int[] A, int[] Q) {
        //make a frequency map
        HashMap<Integer, Integer> fmap = new HashMap<>();
        // key -> element of array A.
        // value -> frequency of that element.
        for (int ele : A) {
            if (fmap.containsKey(ele) == false) {
                // insert a new pair of element with freq = 1
                fmap.put(ele, 1);
            } else {
                // increase old freq by 1
                int oldFre = fmap.get(ele);
                fmap.put(ele, oldFre + 1);
            }
        }

        // Iterate on every query and just get the freq from fmap.
        for (int val : Q) {
            if (fmap.containsKey(val) == true) {
                System.out.println(val + " : " + fmap.get(val));
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
