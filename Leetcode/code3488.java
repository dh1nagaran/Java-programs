class Solution {
    public List<Integer> solveQueries(int[] nums, int[] queries) {
        HashMap<Integer,List<Integer>> hs=new HashMap<>();
        List<Integer>ls=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            hs.putIfAbsent(nums[i],new ArrayList<>());
            hs.get(nums[i]).add(i);
        }    
        for(int n:queries)
        {
            List<Integer>ls2=hs.get(nums[n]);
            int res=Integer.MAX_VALUE;
            if(ls2.size()==1)ls.add(-1);
            else
            {
                int pos=Collections.binarySearch(ls2,n);
                if(pos<ls2.size()-1) res=Math.min(res,ls2.get(pos+1)-ls2.get(pos));
                if(pos>0) res=Math.min(res,ls2.get(pos)-ls2.get(pos-1));
                if(pos==0||pos==ls2.size()-1) res=Math.min(res,nums.length-(ls2.get(ls2.size()-1)-ls2.get(0)));
                ls.add(res);
            }
        }
        return ls;


    }
}