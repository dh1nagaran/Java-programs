class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String>hs=new HashMap<>();
        HashMap<String,Character>hs2=new HashMap<>();
        String arr[]=s.split(" ");
        if(arr.length!=pattern.length())return false;
        int i=0;
        for(char c:pattern.toCharArray())
        {
            String word=arr[i].trim();
            if(hs.containsKey(c) && !hs.get(c).equals(word)) return false;
            if(hs2.containsKey(word) && !hs2.get(word).equals(c)) return false;
            hs.put(c,word);
            hs2.put(word,c);
            i++;
        }
        return true;

        
    }
}