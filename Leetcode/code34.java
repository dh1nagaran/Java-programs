import java.util.*;
class code
{
	public static void main(String[] args)
	{
		int a[]={1,3};
		int b[]={-1,-1};
		int k=1;
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==k && count==0)
			{
				b[0]=i;
				b[1]=i;
				count++;
			}
			if(a[i]==k && count>0)
			{
				b[1]=i;
			}
		}
		System.out.println(Arrays.toString(b));
	}
}