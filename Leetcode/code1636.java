class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> hs = new HashMap<>();
        TreeMap<Integer, TreeSet<Integer>> ts = new TreeMap<>();
        int i = 0;
        int n = nums.length;
        for (int k : nums)
            hs.put(k, hs.getOrDefault(k, 0) + 1);
        for (int k : hs.keySet()) {
            ts.putIfAbsent(hs.get(k), new TreeSet<>());
            ts.get(hs.get(k)).add(k);
        }
        for (int k : ts.keySet()) {
            TreeSet<Integer> ts1 = new TreeSet<>();
            ts1 = ts.get(k);
            Iterator<Integer> it = ts1.descendingIterator();
            while (it.hasNext()) {
                int m = it.next();
                for (int j = 0; j < k; j++)
                    nums[i++] = m;
            }
        }
        return nums;

    }
}