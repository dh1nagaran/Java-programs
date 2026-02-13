class Solution {
    public int maxSubArray(int[] nums) {
        int curr=0;
        int max=Integer.MIN_VALUE;
        for(int n:nums)
        {
            int temp=curr+n;
            if(temp<n)
                curr=n;
            else
                curr=temp;
            max=Math.max(max,curr);
        }
        return max;
    }
}