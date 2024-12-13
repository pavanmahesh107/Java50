package DataStructures4.Graphs;

// Rotten Oranges using BFS.

import java.util.LinkedList;
import java.util.Queue;

public class RottenOranges {
    public static int rottenOranges(int[][] mat) {
        int n = mat.length; // Number of rows
        int m = mat[0].length; // Number of columns

        // Initializing the time array
        int[][] time = new int[n][m]; // To track the time to rot each orange.
        Queue<Pair1> queue = new LinkedList<>();  //i,j
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 2) {
                    queue.add(new Pair1(i, j));
                    time[i][j] = 0;
                } else {
                    time[i][j] = -1;
                }
            }
        }

        int[] dx = {-1, 0, 0, 1}; // directions of row movement.
        int[] dy = {0, -1, 1, 0}; // directions of columns movement.

        int maxTime = 0;

        // Perform BFS on all oranges
        while (!queue.isEmpty()) {
            Pair1 current = queue.poll();
            int i = current.x;
            int j = current.y;

            for (int k = 0; k < 4; k++) {  // Explore on all 4 directions
                int x = i + dx[k];
                int y = j + dy[k];

                if (x >= 0 && x < n && y >= 0 && y < m && mat[x][y] == 1) {
                    mat[x][y] = 2; // rot thr fresh orange.
                    time[x][y] = 1 + time[i][j]; // update the time to rot.
                    maxTime = Math.max(maxTime, time[x][y]); // Track the maximum time.
                    queue.add(new Pair1(x, y)); // Add the new rotten orange to the queue.
                }
            }
        }
        // Check if there is any fresh oranges left.
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 1) {
                    return -1;
                }
            }
        }
        return maxTime;
    }

    public static void main(String[] args) {
        int[][] grid = {
                {2, 0, 2},
                {0, 1, 0},
                {1, 1, 1}};

        System.out.println("Time require to rot all the oranges is: " + rottenOranges(grid));
    }
}


// Time complexity is 0(n*m)