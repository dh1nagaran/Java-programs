import java.util.*;
class code5
{
	public static void main(String[] args)
	{
		int i=0;
		int j=0;
		String s="a";
		String data="";
		String ans="";
		while(i<s.length()-1)
		{
			data=s.substring(i,j+1);
			if((data.charAt(0)==data.charAt(data.length()-1)))
			{
				if(check(data))
				{
					ans=ans.length()<data.length()?data:ans;
				}
				
			}
		
			if(j==s.length()-1)
			{
				i++;
				j=i-1;
				data="";
			}
				j++;
			
		}
		System.out.println(ans);
	}
	public static boolean check(String data)
	{
		int i=0;
		int j=data.length()-1;
		while(i<j)
		{
			if(data.charAt(i)!=data.charAt(j))
				return false;
			i++;
			j--;
		}
		
		return true;
	}
}