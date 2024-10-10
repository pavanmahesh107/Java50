package DataStructuresImplementation.Experimentations;

import java.util.Arrays;

public class SortZeroOne {
    public static int[] sortZeOn(int[] arr) {
        Arrays.sort(arr);
      return arr;
    }
        public static void main (String[]args){
            int[] arr = {0, 1, 0, 0, 1, 1, 0, 1, 0};
            int[] res = sortZeOn(arr);
            for(int num : res) {
                System.out.print(num);
            }
            System.out.println();
        }
}
// The Time Complexity for inbuilt Arrays.sort(arr) is O(nlogn) which is not recommended.
