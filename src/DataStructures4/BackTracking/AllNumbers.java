package DataStructures4.BackTracking;

public class AllNumbers {
    public static void generateNumbers(int n, String current){
        if(n == 0){
            System.out.println(current);
            return;
        }
        generateNumbers(n-1,current + "1");
        generateNumbers(n-1,current + "2");
    }
    public static void main(String[] args) {
        int n = 3;
        generateNumbers(n,"");
    }
}
