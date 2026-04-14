class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        boolean s[]=new boolean[101];
        List <Integer> ls=new ArrayList<>();
        for(int i=0;i<bulbs.size();i++)
        {
            int num=bulbs.get(i);
            s[num]=!s[num];
        }
        for(int i=0;i<101;i++)
        {
            if(s[i])
            ls.add(i);
        }
        return ls;
    }
}