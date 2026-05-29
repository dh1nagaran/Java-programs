class Solution {
    public int minElement(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int n:nums)
        {
            int sum=0;
            while(n>0)
            {
                int temp=n%10;
                sum+=temp;
                n/=10;
            }
            min=Math.min(min,sum);
        }
        return min;
    }
}