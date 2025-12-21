import java.util.*;
class odd
{
	public static void main(String[] args)
	{
		int a[]={23, 45, 67, 34, 78};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				sum+=a[i];
			}
		}
		System.out.println(sum);
	}
}