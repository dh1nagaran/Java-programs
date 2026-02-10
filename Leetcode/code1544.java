class Solution {
    public String makeGood(String s) {
        StringBuffer n=new StringBuffer();
        n.append(s.charAt(0));
        for(int i=1;i<s.length();i++)
        {
            if(n.length()!=0 && Math.abs(s.charAt(i)-(n.charAt(n.length()-1)))==32)
                n.deleteCharAt(n.length()-1);
            else
                n.append(s.charAt(i));
        }
        return n.toString();  
    }
}