package DataStructuresImplementation.Experimentations;

public class SortZeroOne {
    public static int[] sortZeOn(int[] arr) {

        int n = arr.length;
        int countZero = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                arr[countZero] = 0 ;
                countZero++;
            }
        }
        for(int i = countZero; i < n; i++){
            arr[i] = 1;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 0, 1, 1, 0, 1, 0};
        int[] res = sortZeOn(arr);
        for (int num : res) {
            System.out.print(num);
        }
        System.out.println();
    }
}
