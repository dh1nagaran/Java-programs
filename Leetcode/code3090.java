class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character,Integer>hs=new HashMap<>();
        int max=0;
        String t="";
        for(char c:s.toCharArray())
        {
            hs.put(c, hs.getOrDefault(c, 0) + 1);
            t+=String.valueOf(c);
            if(hs.get(c)<=2)
            {
                max=Math.max(max,t.length());
            }
            else if(hs.get(c)==3)
            {
                int st=t.indexOf(c);
                for(int i=0;i<=st;i++){
                    int co=hs.get(t.charAt(i));
                    hs.put(t.charAt(i),co-1);
                }
                t = t.substring(st + 1);
            }
        }
        return max;
    }
}