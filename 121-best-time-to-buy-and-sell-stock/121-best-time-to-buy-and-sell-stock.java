class Solution {
    public int maxProfit(int[] prices) {
        
        if(prices.length < 2){
            return 0;
        }
        
        
        int mx = 0, l = 0 , r = 1;
        while(r < prices.length){
            if(prices[l] < prices[r]){
                mx = Math.max(mx, prices[r]-prices[l]);
                r++;
            }else{
                l = r;
                r++;
            }
        }
        return mx;
    }
}