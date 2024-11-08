package DataStructures4.PriorityQueues;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PairComparator implements Comparator<Pair> {
    @Override
    public int compare(Pair a, Pair b) {
        if(a.x < b.x){
            return -1;
        } else if (a.x > b.x) {
            return 1;
        } else {
            return 0;
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Pair> pairs = new PriorityQueue<>(new PairComparator());

        pairs.add(new Pair(2,1));
        pairs.add(new Pair(3,1));
        pairs.add(new Pair(1,3));
        pairs.add(new Pair(2,8));
        pairs.add(new Pair(2,4));

        while (!pairs.isEmpty()){
            Pair p = pairs.remove();
            System.out.println(p.x + " " + p.y);
        }
    }
}
