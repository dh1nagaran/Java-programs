class Solution {
    public int minimumDistance(int[] nums) {
        if(nums.length<3) return -1;
        int num1=0;
        int num2=0;
        int num3=0;
        int count=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
             num1=nums[i];
            for(int j=i+1;j<nums.length;j++)
            {

                if(num1==nums[j] && count==0)
                {
                    num2=j;
                    count++;
                }
                else if(num1==nums[j] && count==1 )
                {
                num3=j;
                break;
                }
            }
            count=0;
            if(num2!=0 && num3!=0)
            {
                int sum=Math.abs(i-num2)+Math.abs(num2-num3)+Math.abs(num3-i);
                min=Math.min(sum,min);
            }
            num2=0;
            num3=0;
        }
        return min==Integer.MAX_VALUE?-1:min;
        
    }
}