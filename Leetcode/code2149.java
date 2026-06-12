class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> pos=new ArrayList<>();
        List<Integer> neg=new ArrayList<>();
        int n=nums.length;
        int j=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]>0)pos.add(nums[i]);
            else neg.add(nums[i]);
        }
        for(int i=0;i<n;i++)
        {
            if(i%2==0)nums[i]=pos.get(j);
            else
            {
                nums[i]=neg.get(j);
                j++;
            }
        }
        return nums;

        
    }
}