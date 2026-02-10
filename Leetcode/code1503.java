class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int num[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            num[i]=check(nums[i],nums,i);
        }
        return num;
        
    }
    public static int check(int n,int num[],int j)
    {
        for(int i=j;i<num.length;i++)
        {
            if(n<num[i])
                return num[i];
        }
        for(int i=0;i<j;i++)
        {
            if(n<num[i])
                return num[i];
        }
        return -1;
    }
}