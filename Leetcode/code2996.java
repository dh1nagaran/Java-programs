class Solution {
    public int missingInteger(int[] nums) {
        List<Integer>ls =new ArrayList<>();
        int sum=nums[0];
        for(int n:nums) ls.add(n);
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]-nums[i-1]==1)sum+=nums[i];
            else break;
        }
       while (ls.contains(sum)) {
            sum++;
        }

        return sum;
        
    }
}