//code 2264
import java.util.*;
class code
{
	public static void main(String[] args)
	{
		String s="6777133339";
		String ans="";
		String prev=" ";
		for(int i=0;i<s.length()-2;i++)
		{
			ans=s.substring(i,i+3);
			if((ans.charAt(0)==ans.charAt(1) && ans.charAt(1)==ans.charAt(2)) && (prev.charAt(0)<ans.charAt(0)))
			{
				prev=ans;
			}
			else
			{
				ans="";
			}
			
		}
		// Leet code : return prev.length()==1?"":prev;
		System.out.println(prev);
	}
}