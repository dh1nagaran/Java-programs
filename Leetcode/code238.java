class Solution {
    public int[] productExceptSelf(int[] nums) {
        int pre=1;
        int post=1;
        int num[]=new int[nums.length];
        for(int i=0;i<num.length;i++)
            num[i]=1;
        for(int i=0;i<num.length;i++)
        {
            num[i]*=pre;
            pre*=nums[i];
        }
        for(int i=num.length-1;i>=0;i--)
        {
            num[i]*=post;
            post*=nums[i];
        }
        return num;
        
    }
}