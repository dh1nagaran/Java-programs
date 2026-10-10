class Solution {
    public int subtractProductAndSum(int n) {
        int prod=1;
        int sum=0;
        int temp=n;
        while(temp>0)
        {
            sum+=temp%10;
            prod*=temp%10;
            temp/=10;
        }
        return prod-sum;
    }
}