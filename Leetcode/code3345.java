class Solution {
    public int smallestNumber(int n, int t) {
        for(int i=n;i<=100;i++)
        {
            long prod=digit(i);
            if(prod%t==0)return i;
        }
        return n;
    }
    public static long digit(int n)
    {
        long prod=1;
        while(n>0)
        {
            prod*=n%10;
            n/=10;
        }
        return prod;
    }
}