package DataStructres2.Recursion3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        TowersofHannai towersofHannai = new TowersofHannai();
        int numberOfDisks = 3;

        ArrayList<ArrayList<Integer>> result = towersofHannai.towerofhannoi(numberOfDisks);

        for (ArrayList<Integer> move : result) {
            System.out.println("Move disk " + move.get(0) + " from tower " + move.get(1) + " to tower " + move.get(2));
        }

        System.out.println(" Total number of moves: " + result.size());

    }
}
