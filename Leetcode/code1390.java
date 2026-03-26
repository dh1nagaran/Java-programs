class Solution {
    public int sumFourDivisors(int[] nums) {
        int k = 0;
        HashMap<Integer, Integer> hs = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!hs.isEmpty() && hs.containsKey(nums[i]))
                k += hs.get(nums[i]);
            else {
                int num = solve(nums[i]);
                k += num;
                hs.put(nums[i], num);
            }
        }
        return k;
    }

    public static int solve(int n) {
        int count = 0;
        int ans = 0;
        for (int i = 1; i<= n; i++) {
            if (n % i == 0) {
                ans += i;
                count++;
            }
            if(count>4) return 0;
        }
        return count == 4 ? ans : 0;
    }

}