class Solution {
    public int removeDuplicates(int[] nums) {
        int count=0;
        int occur=0;
        TreeSet<Integer>ts=new TreeSet<Integer>();
        for(int n:nums)
        ts.add(n);

        Iterator<Integer> iterator = ts.iterator();
        int j=iterator.next();

        for(int i=0;i<nums.length;i++)
        {
            if(j==nums[i])
            {
                count++;
                if(count>2)
                    nums[i]=Integer.MAX_VALUE;
            }
            else
            {
                if(count>2)
                    occur+=count-2;
                count=1;
                j=iterator.next();
            }
        }
        if(count>2)
            occur+=count-2;
            
        Arrays.sort(nums);
        return nums.length-occur;  
    }
}