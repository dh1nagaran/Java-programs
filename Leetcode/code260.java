class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer>hs=new HashMap<>();
        int m[]=new int[2];
        int i=0;
        for(int n:nums)
            hs.put(n,hs.getOrDefault(n,0)+1);
        for(int n:hs.keySet())
        {
            if(hs.get(n)==1) m[i++]=n;
            if(i==2) return m;
        }
        return m;


    }
}