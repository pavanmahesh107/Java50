package DataStructres2.Hashing3;

import java.util.HashSet;

public class DistinctCoordinates {
    public static int countOfDistinctCoordinates(int[][] arr){
        HashSet<String> set = new HashSet<>();
        for(int i = 0; i < arr.length; i++){
            int X = arr[i][0];
            int Y = arr[i][1];
            set.add(X + "#" + Y);
        }
        return set.size();
    }

    public static void main(String[] args) {
        int[][] arr = {{5,6}, {2,8}, {-1,-1}, {2,-3}, {2,8}, {7,7}, {2,8}, {2,-3}};
        System.out.println(countOfDistinctCoordinates(arr));
    }
}
