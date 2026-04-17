import java.util.*;

class Solution {
    public int minimumDistance(int[] nums) {
        if (nums.length < 3)
            return -1;
        int min = Integer.MAX_VALUE;
        HashMap<Integer, List<Integer>> hs = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hs.putIfAbsent(nums[i], new ArrayList<>());
            hs.get(nums[i]).add(i);
        }
        for (int key : hs.keySet()) {
            List<Integer> ls = hs.get(key);
            if (ls.size() >= 3) {
                System.out.println(ls);
                for (int i = 0; i <= ls.size() - 3; i++) {
                    int num1 = ls.get(i);
                    int num2 = ls.get(i + 1);
                    int num3 = ls.get(i + 2);
                    int sum = Math.abs(num1 - num2) + Math.abs(num2 - num3) + Math.abs(num3 - num1);
                    min = Math.min(min, sum);
                }
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}