class Solution {
    public boolean divideArray(int[] nums) {
        
        HashMap<Integer,Integer>hs=new HashMap<>();
        for(int n:nums)
        {
            hs.put(n,hs.getOrDefault(n,0)+1);
        }
        for(int n:hs.keySet())
        {
            if(hs.get(n)%2!=0)return false;
        }
        return true;
    }
}