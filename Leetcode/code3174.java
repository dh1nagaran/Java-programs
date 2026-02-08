class Solution {
    public String clearDigits(String s) {
    StringBuilder ss=new StringBuilder();
    for(int i=0;i<s.length();i++)
    {
        if(ss.length()!=0 && Character.isDigit(s.charAt(i)))
            ss.deleteCharAt(ss.length()-1);
        else
            ss.append(s.charAt(i));
    }
    return ss.toString();
        
    }
}