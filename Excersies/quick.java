import java.util.*;
class quick
{
	public static void main(String[] args)
	{
		int a[]={2,1,65, 23, 13, 18, 30, 46, 17, 52, 78};
		int pivot=a.length-1;
		int n=pivot;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(a[j]>a[n])
				{		
					a[n]=a[j];
					break;
				}
			}s
			if(a[i]>a[n])
			{
			int temp=a[n];
			a[i]=a[n];
			a[n]=temp;
			}
			n--;
		}
		System.out.println(Arrays.toString(a));
	}
}