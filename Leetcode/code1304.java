import java.util.*;
class sample
{
	public static void main(String[] args)
	{
		int n=2;
		int a[]=new int[n];
		int mid=a.length/2;
		a[mid]=0;
		int temp=n;
		int temp2=n;
		for(int i=0;i<a.length;i++)
		{
			if(i<mid)
			{
				a[i]=-temp;
				temp++;
			}	
			else if(i==mid && n%2!=0)
				a[i]=0;
			else
			{
				a[i]=temp2;
				temp2++;
			}
			
		}
		System.out.println(Arrays.toString(a));
	}
}