class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int lsum = 0;
        int rsum = 0;
        int larr[] = new int[n];
        int rarr[] = new int[n];
        for (int i = 0; i < n; i++) {
            larr[i] = lsum;
            lsum += nums[i];
        }
        for (int i = n - 1; i >= 0; i--) {
            rarr[i] = rsum;
            rsum += nums[i];
        }
        for (int i = 0; i < n; i++) {
            nums[i] = Math.abs(larr[i] - rarr[i]);
        }
        return nums;

    }
}