class Solution {
    public int minimumDeletions(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int min_index=0;
        int max_index=0;
        for(int i=0;i<nums.length;i++)
        {
            if(min>nums[i])
            {
                min=nums[i];
                min_index=i;
            }
            if(max<nums[i])
            {
                max=nums[i];
                max_index=i;
            }
        }
        int n = nums.length;
        int left = Math.min(min_index, max_index);
        int right = Math.max(min_index, max_index);
        int option1 = right + 1;
        int option2 = n - left;
        int option3 = (left + 1) + (n - right);
        return Math.min(option1, Math.min(option2, option3));
    }
}