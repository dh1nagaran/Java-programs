class Solution {
    public int missingMultiple(int[] nums, int k) {
        List<Integer>ls=new ArrayList();
        for(int n:nums)ls.add(n);
        for(int i=1;i<=100;i++)
        {
            if(!ls.contains(i*k))return i*k;
        }
        return 101;
    }
}