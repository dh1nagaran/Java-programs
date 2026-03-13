class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int min=Integer.MAX_VALUE;
        TreeSet<Integer> ts=new TreeSet<Integer>();
        for(int n:nums1)
        {
            ts.add(n);
        }
        for(int n:nums2)
        {
            if(ts.contains(n))
                min=Math.min(n,min);
        }
        return min==Integer.MAX_VALUE?-1:min;   
    }
}