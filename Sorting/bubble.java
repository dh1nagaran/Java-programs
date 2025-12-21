import java.util.*;
class bubble
{
	public static void main(String[] args)
	{
		int a[]={2,54,78,10,56,29,1,50,34};
		int result[]=bubble(a);
		System.out.println(Arrays.toString(result));
		
	}
	public static int[] bubble(int a[])
	{
		for (int i=0;i<a.length-1 ;i++ )
		{
			for(int j=0;j<a.length-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		return a;	
	}
}