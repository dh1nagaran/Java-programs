class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int incr=1;
        int decr=1;
        int max=1;
        int n=nums.length;
        for(int i=1;i<n;i++)
        {
            if(nums[i-1]>nums[i]){
                incr=1;
                decr++;
                max=Math.max(decr,max);
            }
            else if(nums[i]>nums[i-1]){
                decr=1;
                incr++;
                max=Math.max(incr,max);
            }
            else{
                decr=1;
                incr=1;
            }
        }
        return max;
    
        
    }
}