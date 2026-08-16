class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
        HashSet<Integer>hs=new HashSet<>();
        List<Integer>ls2=new ArrayList<>();
        for(int m:nums)hs.add(m);
        for(int i=1;i<=n;i++)
        {
            if(!hs.contains(i))ls2.add(i);
        }
        return ls2;
        
    }
}