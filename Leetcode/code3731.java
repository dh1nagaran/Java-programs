
class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        List<Integer>ls=new ArrayList<>();
        int j=0;
        for(int i=nums[0];i<=nums[nums.length-1];i++)
        {
            if(nums[j]==i)j++;
            else ls.add(i);
        }
        return ls;
        
    }
}