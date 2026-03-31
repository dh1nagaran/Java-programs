class Solution {
    public int addDigits(int num) {
        while(num>9)
        {
            num=solve(num);
        }
        return num;
    }
    public static int solve(int num)
    {
        int sum=0;
        while(num>0)
        {
            int temp=num%10;
            sum+=temp;
            num/=10;
        }
        return sum;

    }
}