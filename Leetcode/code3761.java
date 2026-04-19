class Solution {
    public int minMirrorPairDistance(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int min = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            int num=nums[i];
            if(map.containsKey(nums[i])) min=Math.min(min,i-map.get(num));
            map.put(reverse(nums[i]),i);
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
