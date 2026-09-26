class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        String t="";
        HashMap<String,String>hs=new HashMap<>();
       for(List<String> ls:knowledge)
       {
            List<String> ls2=ls;
            String change=ls2.get(1);
            String replace=ls2.get(0);
            hs.put(replace,change);
       }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(')
            {
                int end=s.indexOf(')',i+1);
                String r=s.substring(i+1,end);
                if(hs.containsKey(r)){
                t+=hs.get(r);
                }
                else{
                    t+="?";
                }
                i=end;
            }
        else t+=s.charAt(i);
        } 
       return t;
    }
}
