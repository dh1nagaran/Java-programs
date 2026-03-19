class Solution {
    public int longestOnes(int[] nums, int k) {
        if(nums.length<=k)
        return k;

        String s = "";
        int max = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                count++;

            s += String.valueOf(nums[i]);
            if (k < count) {
                max = Math.max(max, s.length() - 1);
                int n = s.indexOf('0');
                s = s.substring(n + 1, s.length());
                count--;
            }
        }
        max=Math.max(max,s.length());
        return max;
    }
}