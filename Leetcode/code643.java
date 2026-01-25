import java.util.*;
class sample
{
	public static void main(String[] args)
	{
		int nums[]={1,2,3,4,5,6,7,8,9};
		int k=4;
		int sum=0;
		System.out.println(nums.length);
		   int sum = 0;
    for (int i = 0; i < k; i++) sum += nums[i];
    
    int maxSum = sum;

    for (int i = k; i < nums.length; i++) {
        sum += nums[i] - nums[i - k];
        maxSum = Math.max(maxSum, sum);
    }
		System.out.println((double)maxSum/(double)k);
	}
}


//     int i=0;
    //     int j=i;
    //     int count=0;
    //     double average=0d;
    //     double ans=0d;
    //     int sum=0;
    //     while(i<=(nums.length-k))
    //     {
    //         if(j<nums.length)
    //         {
    //             sum+=nums[j++];
    //             count++;
    //         }
    //         if(count==k)
    //         {
    //             average=(double)sum/(double)k;
    //             i++;
    //             j=i;
    //             count=0;
    //             sum=0;
    //         }
    //         if(average>=ans)
    //         {
    //             ans=average;
    //         }

    //     }
    //     return ans;
        
    // }