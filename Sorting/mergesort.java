import java.util.*;
class merge
{
	public static void main(String[] args)
	{
		int a[]={5, 2, 9, 1, 5, 6};
		int first=0;
		int last=a.length-1;
		a=msort(a,first,last);
		System.out.println(Arrays.toString(a));
		
	}
	public static int[] msort(int a[],int first,int last)
	{
		if(first>=last)
			return a;
		
		int mid=(first+last)/2;
		msort(a,first,mid);
		msort(a,mid+1,last);
		a=mergeSort(a,first,mid,last);
		return a;
	}
	public static int[] mergeSort(int a[],int first,int mid,int last)
	{
		int i=first;
		int k=0;
		int j=mid+1;
		int c[]=new int[last-first+1];
		while(i<=mid && j<=last )
		{
			if(a[i]<a[j])
			{
				c[k++]=a[i++];
			}
			else
			{
				c[k++]=a[j++];
			}
		}
		while(i<=mid)
		{
			c[k++]=a[i++];
		}
		while(j<=last)
		{
			c[k++]=a[j++];
		}
		for(int m=0;m<c.length;m++)
		{
			a[first+m]=c[m];
		}
		return a;
		
	}
}