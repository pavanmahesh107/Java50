package DataStructres2.Recursion3;

// Tower of Hannai
// Given N plates and 3 Towers (Source, destination, Helper) Transfer all plates from source to
// destination and print instructions by keeping the following rules in mind.
// 1. We can move only one plate at a time.
// 2. A Big plate can't be placed over a small plate.
// 3. We can only move the top most plate from a tower.

public class TowerofHannai {
    // Assumption
    public static void toh(int n, char src, char des, char hel) {
        // Base case
        if (n == 0) {
            return;
        }
        // Main logic
        // transfer(n-1) steps from src to hel using des
        toh(n - 1, src, hel, des);

        // transfer nth plate from source to destination
        System.out.println("Move " + n + " plate from " + src + " to " + des);

        //transfer(n-1) plates from hel to des using src
        toh(n - 1, hel, des, src);

    }

    public static void main(String[] args) {
        int n = 3;
        toh(n, 'S', 'D', 'H');
    }
}
