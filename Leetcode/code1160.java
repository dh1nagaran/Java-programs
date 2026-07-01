class Solution {
    public int countCharacters(String[] words, String chars) {
        HashMap<Character,Integer> hs=new HashMap<>();
        int count=0;

        for(char ch:chars.toCharArray())
        {
            hs.put(ch,hs.getOrDefault(ch,0)+1);
        }
        for(String s:words)
        {
            int tot=0;
            HashMap<Character,Integer>hs2=new HashMap<>();
            for(char c:s.toCharArray())
            {
               hs2.put(c,hs2.getOrDefault(c,0)+1);
            }
            for(char c:hs2.keySet())
            {
                if(hs.containsKey(c)&& hs2.get(c)<=hs.get(c))tot+=hs2.get(c);
                else break;
            }
            if(tot==s.length()) count+=tot;
        }
        return count;

        
    }
}