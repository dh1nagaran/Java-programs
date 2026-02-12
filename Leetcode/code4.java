class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n[]=new int[nums1.length+nums2.length];
        int k=0;
        for(int i=0;i<n.length;i++)
        {
            if(i<nums1.length)
                n[i]=nums1[i];
            else
                n[i]=nums2[k++];
        }
        Arrays.sort(n);
        int mid=(n.length)/2;
        if(n.length%2==0)
            return (double)(n[mid]+n[mid-1])/2;
        else
            return (double)(n[mid]);
        
    }
}