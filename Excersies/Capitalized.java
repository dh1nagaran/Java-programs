import java.util.*;
class Capitalized
{
	public static void main(String[] args)
	{
		String str="tuTor joes coMputer education";
		String ans="";
		for(int i=0;i<str.length();i++)
		{
			if(i==0)
			{
				int res=str.charAt(i)-32;
				ans+=(char)res;
				
			}
			else if(str.charAt(i) == ' ' )
			{
				int res=str.charAt(i+1)-32;
				ans+=str.charAt(i);
				ans+=(char)res;
				i++;
			}
			else
			{
				int res=str.charAt(i);
				if(res>=65 && res<=90)
				{
					res+=32;
					ans+=(char)res;
					
				}
				else
				{
					ans+=(char)res;
				}
				
			}
		}
		System.out.println(ans);
	}
}