class Solution {
    public int dominantIndex(int[] nums) {
        int max=0;
        int index=0;
        for(int n:nums)
            max=Math.max(n,max);
        for(int i=0;i<nums.length;i++)
        {
            if(max==nums[i])
                index=i;
            if(nums[i]!=max && (nums[i]*2)>max)
                return -1;
        }
        return index;
    }
}