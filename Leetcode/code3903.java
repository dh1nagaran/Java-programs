class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int max=0;
        int min=Integer.MAX_VALUE;
        int min_arr[]=new int[n];
        min_arr[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--)
        {
            min_arr[i]=Math.min(nums[i],min_arr[i+1]);
        }
        for(int i=0;i<n;i++)
        {
            max=Math.max(max,nums[i]);
            if(max-min_arr[i]<=k)min=Math.min(min,i);
        }
        return min==Integer.MAX_VALUE?-1:min;
    }
}