package DataStructuresImplementation.TwoPointers;

public class ReverseArray {
    public static int[] reversearray(int[] arr){
        int left = 0;
        int right = arr.length -1;

        while(left < right ){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left ++;
            right --;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {8,9,3,1,5,6,10,7};
        int[] res= reversearray(arr);
        for(int num : res){
            System.out.println("Answer array: " + num);
        }
    }
}
