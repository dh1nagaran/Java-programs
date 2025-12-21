import java.util.*;
class move
{
	public static void main(String[] args)
	{
		int a[]={1,0,45,34,0,67,2,0,6,67,45,2,0,10};
		int n=0;
		int d=a.length-1;
		int b[]=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
			{
				b[n++]=a[i];
			}
			if(a[i]==0)
			{
				b[d--]=a[i];
				
			}
		}
		for(int j=0;j<a.length;j++)
		{
			a[j]=b[j];
		}
		System.out.println(Arrays.toString(a));
	}
}