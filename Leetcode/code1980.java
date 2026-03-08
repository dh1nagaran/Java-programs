class Solution {
    public String findDifferentBinaryString(String[] nums) {
        ArrayList<String> ls=new ArrayList<String>();
        for(int i=0;i<nums.length;i++)
        {
            ls.add(nums[i]);
        }
        String ans="";
        int n=(int)Math.pow(2,nums[0].length());
        for(int i=0;i<n;i++)
        {
            ans=Integer.toBinaryString(i);
            ans = String.format("%" + nums[0].length() + "s", ans).replace(' ', '0');
            if(!(ls.contains(ans)))
            return ans; 
        }
        return ans;
    }
}