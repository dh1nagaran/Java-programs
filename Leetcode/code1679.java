class Solution {
    public int maxOperations(int[] nums, int k) {
       int count = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int n : nums)
		{
			int m = k - n;
			if (map.getOrDefault(m, 0) > 0)
			{
				count++;
				map.put(m, map.get(m) - 1);
			}
			else
				map.put(n, map.getOrDefault(n, 0) + 1);
		}
        return count;
        
    }
}