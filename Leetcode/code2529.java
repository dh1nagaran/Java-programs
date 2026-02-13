class Solution {
    public int maximumCount(int[] nums) {
        int count=0;
        int count1=0;
        for(int n:nums)
        {
            if(n>0)
                count++;
            else if(0>n)
                count1++;
        }
        return Math.max(count,count1);   
    }
}