class Solution {
    public int numberOfSpecialChars(String word) {
        int count=0;
        HashSet<Character> set=new HashSet<>();
        for(char ch:word.toCharArray())
        {
            if(Character.isLowerCase(ch)) set.add(ch);
        }
        for(char c:set)
        {
            if(word.indexOf(Character.toUpperCase(c))!=-1) count++;
        }
        return count;
    }
}