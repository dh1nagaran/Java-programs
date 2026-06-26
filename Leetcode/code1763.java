class Solution {
    public String longestNiceSubstring(String s) {
        String ans="";
        for(int i=0;i<s.length();i++)
        {
            for(int j=i+2;j<=s.length();j++)
            {
                String t=s.substring(i,j);
                if(ans.length()<t.length() && isNice(t)) ans=t;
            }
        }
        return ans;
    }
    public static boolean isNice(String s)
    {
        HashSet<Character> hs=new HashSet<>();
        for(char c:s.toCharArray()) hs.add(c);
        for(char c:hs)
        {
            if (!hs.contains(Character.toLowerCase(c)) || !hs.contains(Character.toUpperCase(c)))
            return false;
        }
        return true;
    }
}