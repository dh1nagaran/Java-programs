class Solution {
    public long sumAndMultiply(int n) {
        long sum=0;
        long add=0;
        long sum2=0;
        while(n>0)
        {
            int temp=n%10;
            
            if(temp!=0)
            {
                sum=sum*10+temp;
                add+=temp;
            }
            n/=10;
        }
        while(sum>0)
        {
            sum2=sum2*10+sum%10;
            sum/=10;
        }
        return sum2*add;
        
    }
}