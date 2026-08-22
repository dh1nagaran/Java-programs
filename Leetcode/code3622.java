class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int prod=1;
        int temp=n;
        while(temp>0)
        {
            int dup=temp%10;
            sum+=dup;
            prod*=dup;
            temp/=10;
        }
        return n%(sum+prod)==0;
    }
}