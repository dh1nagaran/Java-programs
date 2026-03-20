class Solution {
    public int longestSubarray(int[] nums) {
        int max=0;
        int count=0;
        String s="";
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            count++;
            s+=String.valueOf(nums[i]);
            
            if(count>1)
            {
                max=Math.max(max,s.length()-2);
                int n=s.indexOf('0');
                s=s.substring(n+1,s.length());
                count--;
            }
        }
        if(count<=1)
            max=Math.max(max,s.length()-1);
        else
            max=Math.max(max,s.length()-2);
        
        return max;
    }
}