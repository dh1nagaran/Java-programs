import java.util.*;
class  selection
{
	public static void main(String[] args) 
	{
		int a[]={2,67,89,333,0,32,35,1,36,4};
		int result[]=select(a);
		System.out.println(Arrays.toString(result));
	}
	public static int[] select(int a[])
	{
		int n=a.length;
		for(int i=0;i<n;i++)
		{
			int s=i;
			for(int j=i;j<n;j++)
			{
				if(a[j]<a[s])
				{
					s=j;
				}
				
			}
			int temp=a[i];
			a[i]=a[s];
			a[s]=temp;
		}
		return a;
		
	}
	
}
