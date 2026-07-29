class Solution {
    public long maxProduct(int[] nums) {
        int n=nums.length;
        long nums2[]=new long[n];
        for(int i=0;i<n;i++) nums2[i]=(long)Math.abs(nums[i]);
        Arrays.sort(nums2);
        return (nums2[n-1]*nums2[n-2])*100000;
    }
}