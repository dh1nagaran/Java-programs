class Solution {
    public int countCompleteSubarrays(int[] nums) {
        HashSet<Integer>hs=new HashSet<>();
        int distinct=0;
        for(int n:nums) hs.add(n); 
        for(int i=0;i<nums.length;i++)
        {
            HashSet<Integer>hs2=new HashSet<>();
            for(int j=i;j<nums.length;j++)
            {
                hs2.add(nums[j]);
                if(hs.size()==hs2.size()){
                    distinct+=nums.length-j;
                    break;
                }
            }
        }
        return distinct;  
    }
}
