class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        String t="";
        String f="";
        int count1=0;
        int count2=0;
        int max=0;
        for(int i=0;i<answerKey.length();i++)
        {
                char c=answerKey.charAt(i);
                t+=c;
                f+=c;
                if(c=='F')count1++;
                if(c=='T')count2++;
                if(count1>k)
                {
                    max=Math.max(max,t.length()-1);
                    int index=t.indexOf("F");
                    t=t.substring(index+1);
                    count1--;
                }
                if(count2>k)
                {
                    max=Math.max(max,f.length()-1);
                    int index=f.indexOf("T");
                    f=f.substring(index+1);
                    count2--;
                }
        }
         max=Math.max(max,t.length());
         max=Math.max(max,f.length());
        return max;    
    }
}
