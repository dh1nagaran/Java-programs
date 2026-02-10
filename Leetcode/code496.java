class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int neww[]=new int[nums1.length];
        for(int i=0;i<nums1.length;i++)
        {
            neww[i]=check(nums1[i],nums2);
        }
        return neww;        
    }
    public static int check(int n,int num[])
    {
        int pos=0;
        for(int i=0;i<num.length;i++)
        {
            if(n==num[i])
                pos=i;
        }
        for(int i=pos+1;i<num.length;i++)
        {
            if(n<num[i])
              return num[i];
        }
        return -1;
    }
}