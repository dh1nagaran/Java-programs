class Solution {
    public int mostFrequentEven(int[] nums) {
        TreeMap<Integer,Integer>hs=new TreeMap<>();
        int max=0;
        for(int n:nums)
        {
            if(n%2==0)
            {
                hs.put(n,hs.getOrDefault(n,0)+1);
                max=Math.max(max,hs.get(n));
            }        
        }
        for(int n:hs.keySet())
        {
            if(max==hs.get(n))return n;
        }
       return -1;
    }
}
