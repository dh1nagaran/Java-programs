import java.util.*;
class del
{
	public static void main(String[] args)
	{
		int a[]= {10, 10, 20, 20, 30};
		int res[]=solve(a);
		System.out.println(Arrays.toString(res));
	}
	public static int[] solve(int a[])
	{
		int b[]=new int[a.length];
		int count2=0;
		
		for(int i=0;i<a.length;i++)
		{
			int count=0;	
			for(int j=i;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}	
			}
			if(count==1)
			{
				System.out.println(a[i]);
				b[count2++]=a[i];
			}
			
		}
		return b;
		
	}
}