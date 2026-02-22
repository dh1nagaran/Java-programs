class Solution {
    public int binaryGap(int n) {
        String s=Integer.toBinaryString(n);
        int dis=0;
        int first=-1;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='1' && first==-1)
                first=i;

            if(s.charAt(i)=='1'&&i-first>=1)
            {
                dis=Math.max(dis,i-first);
                first=i;
            }
        }
        return dis;
        
    }
}