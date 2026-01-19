import java.util.*;
class code	
{
	public static void main(String[] args)
	{
		String d="Let's taks LeetCode contenst";
		String s[]=d.split(" ");
		String ans="";
		int j=0;
		System.out.println(Arrays.toString(s));	
		while(j<s.length)
		{
			String word=s[j];
			String rev="";
			for(int i=word.length()-1;i>=0;i--)
			{
				rev+=word.charAt(i);
			}
			ans+=rev+" ";
			j++;
			
		}
		System.out.println(ans);
	}
}