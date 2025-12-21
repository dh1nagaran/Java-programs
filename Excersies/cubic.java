import java.util.*;
class cubic
{
	public static void main(String[] args)
	{
		int a[]={1, 2, 3, 4, 5};
		int product=1;
		for(int i=0;i<a.length;i++)
		{
			for(int j=3;j>0;j--)
			{
				product*=a[i];
				
			}
			System.out.println(a[i]+":"+product);
		 product=1;
		}
	}
}