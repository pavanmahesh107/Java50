package DataStructres2.Hashing1;

import java.util.HashSet;

public class DistinctElement {
    public static void differelement(int[] A){
        HashSet<Integer> set = new HashSet<>();
        for(int ele : A){
            set.add(ele);
        }
        System.out.println(set.size());
    }
    public static void main(String[] args) {
        int[] A = {3, 9, 3,4,5};
        differelement(A);
    }
}
