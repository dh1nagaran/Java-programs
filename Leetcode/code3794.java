class Solution {
    public String reversePrefix(String s, int k) {
        int count=0;
        StringBuilder n=new StringBuilder();
        n.append(s.substring(0,k));
        n.reverse();
        n.append(s.substring(k,s.length()));
        return n.toString();
    }
}