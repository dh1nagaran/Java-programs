class Solution {
    public int minimumPairRemoval(int[] nums) {
        List<Integer> ls = new ArrayList<>();
        for (int n : nums) ls.add(n);
        int count = 0;
        while (!check(ls)) {
            int min=Integer.MAX_VALUE;
            int idx=0;
            for(int i=0;i<ls.size()-1;i++)
            {
                int sum=ls.get(i)+ls.get(i+1);
                if(sum<min)
                {
                    min=sum;
                    idx=i;
                }
            }
            ls.set(idx,min);
            ls.remove(idx+1);
            count++;
        }
        return count;
    }
    public static boolean check(List<Integer> ls)
    {
        for(int i=1;i<=ls.size()-1;i++)
        {
            if(ls.get(i)<ls.get(i-1)) return false;
        }
        return true;
    }
}