class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
       HashMap<Character,Integer>hs=new HashMap<>();
       HashMap<Character,Integer>hs2=new HashMap<>();
       for(char c:magazine.toCharArray()) hs.put(c,hs.getOrDefault(c,0)+1);
       for(char c:ransomNote.toCharArray()) hs2.put(c,hs2.getOrDefault(c,0)+1);
       for(char c:hs2.keySet())
       {
            if(!(hs.containsKey(c)&&hs2.get(c)<=hs.get(c)))return false;
       }
       return true;
        
    }
}