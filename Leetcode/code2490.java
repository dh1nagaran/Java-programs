class Solution {
    public boolean isCircularSentence(String sentence) {
        String n[]=sentence.split(" ");
        if(n.length==1&&(sentence.charAt(sentence.length()-1)==sentence.charAt(0)))
        return true;

        for(int i=0;i<n.length;i++)
        {
            String s1=n[i];
            String s2="";
            if(i==n.length-1)
                s2=n[0];
            else
                s2=n[i+1];

            if(s1.charAt(s1.length()-1)!=s2.charAt(0))
            return false;
        }
    return true;
    }
}