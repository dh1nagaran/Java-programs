import java.util.*;
class code
{
	public static void main(String[] args)
	{
		int n=20;
		int prev=0;
		int count=0;
		int dum=1;
		int temp=1;
		for(int i=1;i<=n;i++)
		{
			count++;
			prev+=dum;
			dum++;
			if(count==7)
			{
				count=0;
				temp=temp+1;
				dum=temp;
			}
		}
		System.out.println(prev);
	}
	
}