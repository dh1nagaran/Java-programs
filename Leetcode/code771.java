class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character,Integer>hs=new HashMap<>();
        int tot=0;
        for(int i=0;i<stones.length();i++)
        {
            if(jewels.indexOf(stones.charAt(i))!=-1)tot++;
        }
        return tot;

        
    }
}
