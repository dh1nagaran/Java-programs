class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>hs=new HashMap<>();
        TreeMap<Integer,TreeSet<Integer>>tm=new TreeMap<>(Collections.reverseOrder());
        for(int n:nums) hs.put(n,hs.getOrDefault(n,0)+1);
        for(int n:hs.keySet()) 
        {
            tm.putIfAbsent(hs.get(n),new TreeSet<>());
            tm.get(hs.get(n)).add(n);
        }
        int count=0;
        nums=new int[k];
        for(int n:tm.keySet())
        {
            TreeSet<Integer> ts=new TreeSet<>();
            ts=tm.get(n);
            for(int m:ts)
            {
                nums[count++]=m;
                if(count==k) break;
            }
            if(count==k) break;
        }

        return nums;
        
    }
}