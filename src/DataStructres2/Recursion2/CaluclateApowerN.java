package DataStructres2.Recursion2;

// Given A & N Caluclate A power N

public class CaluclateApowerN {


    public static int pow(int A, int N){
        if(N == 0){
            return 1;
        }

        // Using the below version, the no.of levels in the code is N which is Time complexity is O(N).
//        int temp = pow(A, N -1);
//        return temp * A;
        // Using the below version, the no.of levels in the code is REDUCED which is logN i.e., log base 2 32 = 5 levels.
        int temp = pow(A, N/2);
        if(N%2 == 0){  // Even Case
            return temp * temp;
        } else { // odd case
            return temp * temp * A;
        }
    }
    public static void main(String[] args) {
        int A = 3;
        int N = 5;
      int res = pow(A, N);
        System.out.println(res);
    }
}
