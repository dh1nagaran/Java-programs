class Solution {
    public String removeOuterParentheses(String s) {
        char ch[]=s.toCharArray();
        int open=1;
        s="";
        for(int i=1;i<ch.length;i++)
        {
            if(ch[i]=='(')
            {
                open++;
                if(open>1)
                    s+='(';
            }
            else
            {
                if(open>1)
                    s+=')';
                open--;
            }
        }
        return s;
    }
} 