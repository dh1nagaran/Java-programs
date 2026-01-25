import java.util.*;
class sample
{
	public static void main(String[] args)
	{
		int nums[]={1,0,1,0,1,0,1};
		int n=1;
		boolean data=false;
		int i=1;
		int count=0;
		if(nums.length==1)
		{
			if(nums[0]==1 && n==1)
				n--;
		}
		
		if(nums[1]!=1 && nums[0]!=1 && n!=0)
		{
			nums[0]=1;
			n--;
		}
			
		while(i<nums.length-1 && n!=0)
		{
			if(nums[i-1]!=1 && nums[i+1]!=1 && nums[i]!=1)
			{
				nums[i]=1;
				n--;
			}
			i++;
		}
		if(nums[nums.length-2]!=1 && nums[nums.length-1]!=1)
		{
			nums[nums.length-1]=1;
			n--;
		}
		
		if(n<=0)
			data=true;
		
		System.out.println(data);
	}
}