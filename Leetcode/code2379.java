class Solution {
    public int minimumRecolors(String blocks, int k) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<=blocks.length()-k;i++)
        {
            String con=blocks.substring(i,i+k);
            min=Math.min(min,check(con));
        }
        return min;
    }
    public static int check(String s)
    {
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='W')
            count++;
        }
        return count;
    }
}