class Solution1 {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        for(int i=0;i<prices.length;i++){
            int maxLater = 0;
            for(int j=i+1;j<prices.length;j++){
                if(prices[j]>maxLater){
                    maxLater = prices[j];
                }
            }
            if(maxLater-prices[i]>maxProfit){
                maxProfit = maxLater-prices[i];
            }
        }
        return maxProfit;
    }
}//TLE

class Solution2{
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice =prices[0];
        for(int i=1;i<prices.length;i++){
            if(prices[i]<minPrice){
                minPrice = prices[i];
            } else if (prices[i]-minPrice>maxProfit){
                maxProfit = prices[i]-minPrice;
            }
        }
        return maxProfit;
        }
}