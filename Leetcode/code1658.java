class Solution {
    public int minOperations(int[] nums, int x) {
        int n=nums.length;
        int tot=0;
        for(int m:nums)tot+=m;
        int target=tot-x;
        if(target<0)return -1;
        if(target==0)return n;
        int len=-1;
        int l=0;
        int sum=0;
       for(int i=0;i<n;i++)
       {
           sum+=nums[i];
            while(l<=i && sum>target)
            {
                sum-=nums[l];
                l++;
            }
            if(sum==target)len=Math.max(len,i-l+1);
       }
       return len==-1?-1:n-len;
    }
}