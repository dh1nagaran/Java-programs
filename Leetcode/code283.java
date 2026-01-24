import java.util.*;
class code{
    public static void main(Strin[] args) {
		int[] nums
        int n=0;
		int d=nums.length-1;
		int b[]=new int[nums.length];
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]!=0)
			{
				b[n++]=nums[i];
			}
			if(nums[i]==0)
			{
				b[d--]=nums[i];
				
			}
		}
		for(int j=0;j<nums.length;j++)
		{
			nums[j]=b[j];
		}
        
    }
}