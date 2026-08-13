class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer>ls=new ArrayList<>();
        for(int i=left;i<=right;i++)
        {
            int num=i;
            boolean data=true;
            while(num>0)
            {
                int temp=num%10;
                if(temp==0 || i%temp!=0)
                {
                    data=false;
                    break;
                }
                num/=10;
            }
            if(data)ls.add(i);
        }
        return ls;
        
    }
}