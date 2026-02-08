class Solution {
    public int[] countBits(int n) {
        int num[]=new int[n+1];
        for(int i=0;i<=n;i++)
        {
            num[i]=check(i);
        }  
        return num;
    }
    public static int check(int i)
    {
        String data=Integer.toBinaryString(i);
        int count=0;
        for(int j=0;j<data.length();j++)
        {
            if(data.charAt(j)=='1')
                count++;
        }
        return count;
    }
}