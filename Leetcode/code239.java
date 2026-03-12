class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        TreeMap<Integer,Integer> ts = new TreeMap<>();
        int num[] = new int[(nums.length - k) + 1];
        int j = 0;
        for (int i = 0; i < k; i++)
            ts.put(nums[i],ts.getOrDefault(nums[i],0)+1);

        num[j++]=ts.lastKey();
        
        for (int i = k; i < nums.length; i++) {
            int remove = nums[i-k];
            ts.put(remove, ts.get(remove)-1);
            if(ts.get(remove)==0)
                ts.remove(remove);
            ts.put(nums[i], ts.getOrDefault(nums[i],0)+1);
            num[j++] = ts.lastKey();
        }
        return num;
    }
}