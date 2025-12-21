import java.util.*;
class OccurString
{
	public static void main(String[] args)
	{
		String a="abc";
		String b="c";
		int ans=Integer.MAX_VALUE;
		String str1="";
		int d=b.length();
		int c=a.length();
		int e=c-d;
		System.out.println(e);
		for(int i=0;i<=e;i++)
		{
			str1=a.substring(i,i+d);
			if(str1.equals(b))
			{
				if(i<ans)
				{
					ans=i;	
				}
				break;
			}
			
			
		}
		System.out.println(str1);
		if(str1.equals(b))
		{
			System.out.println(ans);
		}
		else
		{
			System.out.println(-1);
		}
	}
}