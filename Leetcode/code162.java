class Solution {
    public int findPeakElement(int[] nums) {
        int i=1;
        int n=nums.length-1;
        while(i<n)
        {
            if(nums[i]>=nums[i-1] &&  nums[i]>=nums[i+1]) return i;
            i++;
        }
        return nums[0]>nums[n]?0:n;   
    }
}