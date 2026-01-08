import java.util.*;
class code
{
	public static void main(String[] args)
	{
		int a[]={1};
		int k=0;
		int count=-1;
		int n=0;
		while(n<a.length)
		{
			if(k==a[n])
			{
				count=n;
			}
			n++;
		}
		System.out.println(count);
	}
}