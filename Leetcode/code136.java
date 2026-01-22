import java.util.*;
class sample
{
	public static void main(String[] args)
	{
		int nums[]={4,1,2,1,2};
		if(nums.length==1)
            return nums[0];
       int i=1;
       Arrays.sort(nums);
       while(i<nums.length-1)
       {
            if(nums[i]!=nums[i+1] && nums[i]!=nums[i-1])
                return nums[i];
            i++;
                
       }
       if(nums[0]!=nums[1])
            return nums[0];

        return nums[nums.length-1]; 
	}
}