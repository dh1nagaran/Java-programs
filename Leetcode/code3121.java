class Solution {
    public int numberOfSpecialChars(String word) {
        HashMap<Character,Integer> hs=new HashMap<>();
        int count=0;
       for(int i=0;i<word.length();i++)
       {
            if(Character.isLowerCase(word.charAt(i))) hs.put(word.charAt(i),i);
       }
       for(char c: hs.keySet())
       {
            if(hs.get(c)<=word.indexOf(Character.toUpperCase(c))) count++;
       }
        return count;

    }
}