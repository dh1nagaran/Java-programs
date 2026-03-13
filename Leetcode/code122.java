class Solution {
    public int maxProfit(int[] prices) {
        int m=0;
        int n=0;
        int sum=0;
        for(int i=1;i<prices.length;i++)
        {
            n=prices[i];
            m=prices[i-1];
            if((n-m)>0) 
                sum+=n-m;
        }
        return sum;
        
    }
}