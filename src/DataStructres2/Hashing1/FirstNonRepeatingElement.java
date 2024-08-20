package DataStructres2.Hashing1;

import java.util.HashMap;

public class FirstNonRepeatingElement {
    public static void NonRepeating(int[] A) {
        HashMap<Integer, Integer> frmap = new HashMap<>();
        for (int ele : A) {
            if (frmap.containsKey(ele) == false) {
                frmap.put(ele, 1);
            } else {
                int oldfreq = frmap.get(ele);
                frmap.put(ele, oldfreq + 1);
            }
        }
        for (int val : A) {
            if (frmap.get(val) == 1) {
                System.out.println(val + " : " + frmap.get(val));
                return;
            }
        }
    }

    public static void main(String[] args) {
        int[] A = {2, 3, 5, 4, 5, 2, 6};
        NonRepeating(A);
    }
}


// The time & space complexity of this program is 0(n).