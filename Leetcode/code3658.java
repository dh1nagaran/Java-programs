

class Solution {
    public int gcdOfOddEvenSums(int n) {
        int odd=0;
        int even=0;
        int gcd=0;
        for(int i=1;i<=n+n;i++)
        {
            if(i%2==0)even+=i;
            else odd+=i;
        }
        int min=Math.min(odd,even);
        for(int i=1;i<=min;i++)
        {
            if(odd%i==0 && even%i==0)gcd=i;
        }
        return gcd;


        
    }
}