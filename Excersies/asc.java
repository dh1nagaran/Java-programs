import java.util.*;
class asc
{
	public static void main(String args[])
	{
		int  nums[]= {23, 5, 67, 20, 3, 30, 79, 3, 70, 2};
		for(int i=0;i<nums.length;i++)
		{
			int s=i;
			for(int j=i;j<nums.length;j++)
			{
				if(nums[s]>nums[j])
				{
					s=j;
				}
			}
			int temp=nums[i];
			nums[i]=nums[s];
			nums[s]=temp;
			
		}
		
		System.out.println(Arrays.toString(nums));
	}
}