package LeetcodeProblems.Arrays;

public class BestTimetoBuyandSellStock2 {
    public static int maximumProfit(int[] prices){
        int profit = 0;
        for(int i = 1; i < prices.length; i++){
            if(prices[i] > prices[i -1]){
                profit += prices[i] - prices[i -1];
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        int[] prices = {2,1,1,2,1};
        int res = maximumProfit(prices);
        System.out.println("The maximum profit after buy and selling is: " + res);
    }
}

// The time complexity is O(n) because we are using only for loop.
// Space complexity is O(1).