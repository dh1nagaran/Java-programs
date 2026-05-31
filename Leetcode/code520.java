class Solution {
    public boolean detectCapitalUse(String word) {
        String uppper=word.toUpperCase();
        String  lower=word.toLowerCase();
        String onecap= word.substring(0,1).toUpperCase()+word.substring(1).toLowerCase();
        System.out.println(onecap);
        if(word.equals(uppper)) return true;
        else if(word.equals(lower))return true;
        else if(word.equals(onecap)) return true;
        return false;
        
    }
}