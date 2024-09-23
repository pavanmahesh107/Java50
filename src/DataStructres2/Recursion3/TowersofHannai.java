package DataStructres2.Recursion3;

import java.util.ArrayList;

public class TowersofHannai {

    public ArrayList<ArrayList<Integer>> towerofhannoi(int A) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if (A > 0) {
            solve(A, 1, 3, 2, result);
        }
        return result;
    }

    private void solve(int n, int start, int end, int aux, ArrayList<ArrayList<Integer>> result) {
        if (n == 1) {
            addMove(n, start, end, result);
            return;
        }
        // Move n-1 disks from the start to aux using the end.
        solve(n - 1, start, aux, end, result);

        // Move the nth disk from start to end.
        addMove(n, start, end, result);

        // Move the n-1 disks from aux to end using start.
        solve(n - 1, aux, end, start, result);
    }

    private void addMove(int disk, int start, int end, ArrayList<ArrayList<Integer>> result) {
        ArrayList<Integer> move = new ArrayList<>();
        move.add(disk);
        move.add(start);
        move.add(end);
        result.add(move);
    }
}


