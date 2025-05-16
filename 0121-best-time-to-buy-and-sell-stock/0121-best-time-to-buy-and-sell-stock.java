class Solution {
    public int maxProfit(int[] prices) {

        int profit = 0;
        int buy = prices[0]; //1


        for(int i = 1; i < prices.length; i++){ 
            //5 > 1
            if(prices[i] > buy){
                        //5- 0 ==5
                int diff = prices[i] - buy;
                if(diff > profit){
                    profit = diff;
                }

            }else{
                buy = prices[i];
            }
        }


        return profit;
        
    }
}