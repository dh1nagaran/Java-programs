import java.util.*;
class code1732
{
	public static void main(String[] args)
	{
		int nums[]={-4,-3,-2,-1,4,3,2};
		int nums2[]=new int[nums.length+1];
		int prev=0;
		nums2[0]=0;
		for(int i=1;i<nums2.length;i++)
		{
			nums2[i]=prev+nums[i-1];
			prev=nums2[i];
		}
		System.out.println(Arrays.toString(nums2));

	}
}