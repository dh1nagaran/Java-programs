import java.util.*;
class sample
{
	public static void main(String args[])
	{
		int n=19;
		int a[]=new int[2];
		int j=n;
		for(int i=1;i<n;i++)
		{
			j=n-i;
				if(check(i) && check(j))
				{
					a[0]=i;
					a[1]=j;
					break;
				}
		}
		System.out.println(Arrays.toString(a));
	}
	public static boolean check(int i)
	{
		while(i>0)
		{
			int temp1=i%10;
			if(temp1==0)
				return false;
			
			i=i/10;
		}
		return true;
	}
	
}