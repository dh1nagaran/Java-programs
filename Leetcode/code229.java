class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int max=0;
        int nn=nums.length;
        HashMap<Integer,Integer>hs=new HashMap<>();
        List<Integer> ls=new ArrayList<>();
        for(int n:nums)
        {
            hs.put(n, hs.getOrDefault(n, 0) + 1);
            max=Math.max(hs.get(n),max);
        }
        if(Math.floor(nn/3)>=max) return ls;
        for(int n:nums)
        {
            if(hs.get(n)>(nn/3) && !ls.contains(n) ) ls.add(n);
        }
        return ls; 
        
    }
}