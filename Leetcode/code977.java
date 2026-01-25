import java.util.*;
class sample
{
	public static void main(String[] args)
	{
		int nums[]={-4,-1,0,3,10};
		int i=0;
		while(i<nums.length)
		{
			nums[i]=nums[i]*nums[i];
			i++;
		}
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		
	}
}