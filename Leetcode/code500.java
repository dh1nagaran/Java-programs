class Solution {
    public String[] findWords(String[] words) {
        String first="qwertyuiopQWERTYUIOP";
        String second="asdfghjklASDFGHJKL";
        String third="zxcvbnmZXCVBNM";
       List<String> ls=new ArrayList<>();
        for(String s:words)
        {   
            int n=0;
           if (first.indexOf(s.charAt(0)) != -1) n = 1;
            if(second.indexOf(s.charAt(0))!=-1)n=2;
            if(third.indexOf(s.charAt(0))!=-1)n=3;
            int m=0;
            for(char c:s.toCharArray())
            {
                 
                if(first.indexOf(c)!=-1)m=1;
                else if(second.indexOf(c)!=-1)m=2;
                else if(third.indexOf(c)!=-1)m=3;
                if(n!=m)
                {
                    n=-1;
                    break;
                }
            }
            if(n!=-1)ls.add(s);
        }
        words=new String[ls.size()];
int i=0;
        for(String s:ls)
        {
            words[i++]=s;
        }
        return words;

    }
}