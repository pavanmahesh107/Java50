package DataStructures4.DynamicProgramming;

public class CoinChange {
    public static int change(int ind,int n,int[] memo,int[] coins,int amount){
        // Base Case: If the amount is 0,no coins are needed.
        if(amount == 0) return 0;

        if(n <= 1 && coins[ind] != amount){
            return -1;
        }

        if(memo[ind] != 0){
            return memo[ind];
        }
        int take = 0;
        int notTake = change(ind -1,n,memo,coins,amount);
        take = change(ind,n,memo,coins,amount - coins[ind] -1);

        return take + notTake;

    }
    public static int coin(int[] coins,int target){
        int n = coins.length;
        int[] memo = new int[n+1];
        return change(n-1,n,memo,coins,target);
    }

    public static void main(String[] args) {
        int[] coins = {1,2,5};
        int target = 11;
        System.out.println("Fewest number of coins to return amount : " + coin(coins,target));
    }
}
