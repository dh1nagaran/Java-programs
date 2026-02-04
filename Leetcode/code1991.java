class 1991 {
    public static void main (String[] args) {
		
		int nums[]={2,3,-1,8,4};
        for(int i=0;i<nums.length;i++)
        {
            int num1=0;
            int num2=0;
            for(int j=0;j<nums.length;j++)
            {
                if(i<j)
                {
                    num1+=nums[j];
                }
                else if(i>j)
                {
                    num2+=nums[j];
                }
            }
            if(num1==num2)
              return i;
        }

        return -1;
 
    }
}