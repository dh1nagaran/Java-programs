class Solution {
    public int minMirrorPairDistance(int[] nums) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            map.putIfAbsent(nums[i], new ArrayList<>());
            map.get(nums[i]).add(i);
        }
        for (int i = 0; i < nums.length - 1; i++) {
            int rev = reverse(nums[i]);
            List<Integer> ls = map.get(rev);
            if (ls == null)
                continue;
            int pos = Collections.binarySearch(ls, i + 1);
            if (pos < 0)
                pos = -(pos + 1);
            if (pos < ls.size())
                min = Math.min(min, ls.get(pos) - i);
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }

    public static int reverse(int n) {
        int num = 0;
        while (n > 0) {
            num = num * 10 + n % 10;
            n /= 10;
        }
        return num;

    }
}