class Solution {
    public boolean uniformArray(int[] nums1) {
        int n=nums1.length;
        int nums2[]=new int[n];
        int min=Integer.MAX_VALUE;
        for(int m:nums1)min=Math.min(min,m);
        nums2[0]=nums1[0];
        if(min%2!=0)return true;
        for(int i=1;i<n;i++)
        {
            nums2[i]=nums1[i]-nums1[i-1];
            if(nums2[i]%2!=0)return false;
        }
        return true;

        
    }
}