class Solution {
    public int maxProfit(int[] prices) {
        int finalProfit = 0;
        int buyPrice = Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            int profit = 0;
            if(buyPrice < prices[i]){
                profit = prices[i]-buyPrice;
                finalProfit = Math.max(finalProfit,profit);
            }
            else{
                buyPrice = prices[i];
            }
        }
        return finalProfit;
    }
}