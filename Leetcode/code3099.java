class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int temp=0;
        int n=x;
        while(n>0)
        {
            temp+=n%10;
            n/=10;
        }
        int ans=x%temp;
       return ans==0?temp:-1;
    }
}