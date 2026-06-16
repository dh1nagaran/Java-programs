class Solution {
    public String processStr(String s) {
        StringBuilder t=new StringBuilder();
        for(char c:s.toCharArray())
        {
            if(c=='#') t.append(t);
            else if(c=='%') t=t.reverse();
            else if(c=='*' && t.length()!=0) t=t.deleteCharAt(t.length()-1); 
            else if(c>=97 && c<=122) t.append(c);
        }
        return t.toString();
         
    }
}