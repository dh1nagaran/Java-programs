class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        TreeSet<Integer> ts1 = new TreeSet<>();
        TreeSet<Integer> ts2 = new TreeSet<>();
        List<Integer> ls1 = new ArrayList<>();
        List<Integer> ls2 = new ArrayList<>();
        List<List<Integer>> ls = new ArrayList<>();
       for(int n:nums1)
       ts1.add(n);
       for(int n:nums2)
       ts2.add(n);
       for(int n:ts1)
       {
            if(!ts2.contains(n))
            ls1.add(n);
       }
       for(int n:ts2)
       {
            if(!ts1.contains(n))
            ls2.add(n);
       }
        ls.add(ls1);
        ls.add(ls2);
        return ls;

    }
}