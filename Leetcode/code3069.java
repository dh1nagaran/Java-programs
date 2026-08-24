class Solution {
    public int[] resultArray(int[] nums) {
        List<Integer>ls1=new ArrayList<>();
        List<Integer>ls2=new ArrayList<>();
        int n=nums.length;
        int indx=0;
        ls1.add(nums[0]);
        ls2.add(nums[1]);
        for(int i=2;i<n;i++)
        {
            if(ls1.get(ls1.size()-1) > ls2.get(ls2.size()-1)) ls1.add(nums[i]);
            else ls2.add(nums[i]);
        }   
        nums=new int[n];     
        for(int m:ls1) nums[indx++]=m;
        for(int m:ls2) nums[indx++]=m;
        return nums;
    }
}

