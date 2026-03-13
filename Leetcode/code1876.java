class Solution {
    public int countGoodSubstrings(String s) {
        int count=0;
        for(int i=0;i<=s.length()-3;i++)
        {
            String d=s.substring(i,i+3);
            if(check(d))
                count++;
        }
        return count;
    }
    public static boolean check(String s)
    {
        String d="";
        for(char ch:s.toCharArray())
        {
            if(d.indexOf(ch)==-1)
            d+=ch;
            else
            return false;
        }
        return true;
    }
}