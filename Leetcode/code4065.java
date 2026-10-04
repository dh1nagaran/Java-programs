class Solution {
    public int[] rearrangeArray(int[] nums) {
        TreeMap<Integer,Integer>hs=new TreeMap<>();
        for(int i:nums)
            hs.put(i,hs.getOrDefault(i,0)+1);
        int i=0;
        while(i<nums.length)
        {
            for(int j:hs.keySet())
            {
                int k=hs.get(j);
                if(k!=0 && i<nums.length)
                {
                    nums[i++]=j;
                    hs.put(j,--k);
                }
            }
        }
        return nums;
        
    }
}
