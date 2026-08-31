class Solution {
    public int maxProfit(int[] prices) {
       int small=prices[0];
       int i=0;
       int n=prices.length;
       int great=0;
       for(i=0;i<n;i++){
        if(small>prices[i]){
            small = prices[i];
        }
        int ans=prices[i]-small;
        if(ans >great){
            great=ans;
        }
       } 
        return great;
    }
}