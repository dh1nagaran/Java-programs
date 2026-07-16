class Solution {
    public int findLHS(int[] nums) {
        int result=0;
        HashMap<Integer,Integer>hs=new HashMap<>();
        for(int i:nums)  hs.put(i,hs.getOrDefault(i,0)+1);
        for(int i:hs.keySet())
        {
            if(hs.containsKey(i+1)) result=Math.max(result,hs.get(i)+hs.get(i+1));
        }
        return result;
        
    }
}