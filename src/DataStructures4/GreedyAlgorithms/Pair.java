package DataStructures4.GreedyAlgorithms;

public class Pair {
    int weight;
    int protein;
    double ppk;

    public Pair(int weight, int protein){
        this.weight = weight;
        this.protein = protein;
        this.ppk = (double) protein/ weight;
    }
 }
