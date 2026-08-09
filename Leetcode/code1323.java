class Solution {
    public int maximum69Number (int num) {
        ArrayList<Integer>ts=new ArrayList<>();
        while(num>0)
        {
            ts.add(num%10);
            num/=10;
        }
        Collections.reverse(ts);
        int  reversed=0;
        int count=0;
        for(int n:ts)
        {
            if(count==0 && n==6) {
                reversed=reversed*10+9;
                count++;
            }
            else reversed=reversed*10+n;
        }
        return reversed;
        
    }
}