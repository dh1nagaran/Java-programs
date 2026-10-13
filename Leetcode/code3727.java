class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n=nums.length;
        long sqrs[]=new long[n];
        for(int i=0;i<n;i++)
            sqrs[i]=nums[i]*nums[i];
        Arrays.sort(sqrs);
        int mid=n/2;
        long sum=0;
        for(int i=0;i<mid;i++)sum-=sqrs[i];
        for(int i=mid;i<n;i++)sum+=sqrs[i];
        return sum;
        
    }
}