class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word2.length()>word1.length()) return false;
        TreeMap<Character,Integer>ts1=new TreeMap<>();
        TreeMap<Character,Integer>ts2=new TreeMap<>();
        boolean data=true;
        for(int i=0;i<word1.length();i++)
        {
            ts1.put(word1.charAt(i),ts1.getOrDefault(word1.charAt(i),0)+1);
            if(i<word2.length()) ts2.put(word2.charAt(i),ts2.getOrDefault(word2.charAt(i),0)+1);
        }
        for(char w:ts1.keySet())
        {
            for(char c:ts2.keySet())
            {
                if(w==c){
                    data=true;
                    break;
                }
                else data=false;
            }
            if(!data)return false;
        }   
        for(char w:ts1.keySet())
        {
            int n=ts1.get(w);
            for(char c:ts2.keySet())
            {
                if(n==ts2.get(c)){
                    data=true;
                    ts2.put(c,-1);
                    break;
                }
                else data=false;
            }
            if(!data)return false;
        }   
    return true;
    }
}