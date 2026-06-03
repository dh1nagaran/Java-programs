class Solution {
    public String greatestLetter(String s) {
        String t= s.replaceAll("[a-z]", "");
        char c[]=t.toCharArray();  
        Arrays.sort(c);
        for(int i=c.length-1;i>=0;i--)
        {
            if(s.indexOf(Character.toLowerCase(c[i]))!=-1) return String.valueOf(c[i]);
        }      
        return "";
    }
}