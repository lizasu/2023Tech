class Solution {
    public int maxProfit(int[] prices) {
        // Given prices[], price on ith day
        // maximize profit; buy date -> sell date
        // find biggest gap / increasing
        // Brute Force - O(n^2) - nested loop, find max positive diff between two numbers
        // int maxProfit = 0;
        // for (int i = 0; i < prices.length; i++) {
        //     for (int j = i+1; j < prices.length; j++) {
        //         if (prices[j] - prices[i] > maxProfit) {
        //             maxProfit = prices[j] - prices[i];
        //         }
        //     }
        // }
        // return maxProfit;

        // max(price[j] - price[i]) , i < j
        // DP
        // T[i] = maxProfit if sold on ith day
        // T[i] = max(T[j] + P[i] - P[j]) , P[i] > P[j], i > j
        // int[] T = new int[prices.length];
        // for(int i=0; i< prices.length; i++) {
        //     T[i] = 0;
        // }
        // for(int i= 0; i < prices.length; i++) {
        //     for(int j=0; j < i; j++) {
        //         int diff = prices[i] - prices[j];
        //         if(prices[i] > prices[j] && diff + T[j] > T[i]) {
        //             T[i] = diff + T[j];
        //         }
        //     }
        // }
        // int maxProfit = 0;
        // for(int i =0; i < T.length; i++) {
        //     if (T[i] > maxProfit) {
        //         maxProfit = T[i];
        //     }
        // }

        // MaxProfit = prices[i] - min so far
        int min = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }
            maxProfit = Math.max(maxProfit, prices[i] - min);
        }

        return maxProfit;
    }
}
