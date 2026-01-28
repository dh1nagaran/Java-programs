import java.util.*;
class code
{
	public static void main(String[]args)
	{
		int a[]={2,21,43,38,0,42,33,7,24,13,12,27,12,24,5,23,29,48,30,31};
		int b[]={2,42,38,0,43,21};
		int k=0;
		int j=0;
		int neww[]=new int[a.length];
		while(j<b.length)
		{
			for(int i=0;i<a.length;i++)
			{
				if(b[j]==a[i])
				{
					neww[k++]=a[i];
					a[i]=-1;
				}
			}
			j++;
		}
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		j=0;
		while(j<a.length)
		{
			if(a[j]!=-1 && j>=k)
				neww[k++]=a[j];
			j++;
		}

		System.out.println(Arrays.toString(neww));
		
	}
}