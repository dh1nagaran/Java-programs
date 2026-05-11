class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer>ls=new ArrayList<>();
        for(int n:nums)
        {
           String t=String.valueOf(n);
           for(char c:t.toCharArray()) ls.add((int)c-'0');
        }
        nums=new int[ls.size()];
        for(int i=0;i<ls.size();i++) nums[i]=ls.get(i); 
        return nums;  
    }
}