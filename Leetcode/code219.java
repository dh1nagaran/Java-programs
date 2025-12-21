import java.util.*;
class code
{
	public static void main(String[] args)
	{
		boolean data=false;
	int nums[]={1,2,3,1,2,3};
	int k=2;
	int i=0;
    int j=i+1;
      while(i<nums.length)
      {
		  System.out.println(i);
		  System.out.println(j);
		 if(j<nums.length)
			{
            if(nums[i]==nums[j] && (j-i)<=k)
            {
                data=true;
            }
            j++;
			}
		
        else
        {
			i++;
            j=i+1;
            
        }
        if(data)
        {
            break;
        }
      }
        System.out.println(data);
}
}