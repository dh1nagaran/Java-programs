class Solution {
    public int lengthOfLongestSubstring(String s) {
        StringBuilder ans=new StringBuilder();
        int n=0; 
        for(int i=0;i<s.length();i++)
        {
            int index=ans.indexOf(String.valueOf(s.charAt(i)));
            if(index==-1)
                ans.append(s.charAt(i));
            else
            {
                ans.delete(0,index+1);
                ans.append(s.charAt(i));
            }
            n=Math.max(n,ans.length());
        }
        return n;
        
    }
}