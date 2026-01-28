class code1295 {
    public static void main(String[] args) {
        int count=0;
        int i=0;
        while(i<nums.length)
        {
            if(check(nums[i]))
            {
                count++;
            }
            i++;
        }
        return count;  
    }
    public static boolean check(int n)
    {
        int count=0;
        while(n>0)
        {
            count++;
            n=n/10;
        }
        return count%2==0;
    }
}