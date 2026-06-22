class Solution {
    public int maxNumberOfBalloons(String text) {
        String txt="balloon";
        int count=Integer.MAX_VALUE;
        HashMap<Character,Integer>hs=new HashMap<>();
        for(char c:text.toCharArray()){
            if(txt.indexOf(c)!=-1) hs.put(c,hs.getOrDefault(c,0)+1);
        }
        if(hs.size()==5)
        {
             for(char c:hs.keySet())
            {
                if(c=='l') count=Math.min(hs.get(c)/2,count);
                else if(c=='o') count=Math.min(hs.get(c)/2,count);
                 else count=Math.min(hs.get(c),count);
            }
        }
    
        return count==Integer.MAX_VALUE?0:count;
    }
}