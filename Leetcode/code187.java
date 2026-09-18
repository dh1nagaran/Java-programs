class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
       HashSet<String>hs=new HashSet<>();
       HashSet<String>ls=new HashSet<>();
       for(int i=0;i<=s.length()-10;i++)
       {
            String t=s.substring(i,i+10);
            if(hs.contains(t))ls.add(t);
            hs.add(t);
       }
       return new ArrayList<>(ls);
        
    }
}