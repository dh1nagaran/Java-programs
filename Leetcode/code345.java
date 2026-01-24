import java.util.*;
class code

{
	public static void main(String[] args)
	{
		String s="IceCreAm";
		String ans="";	
		int i=0;
		int j=0;
		String data="";
		while(i<s.length())
		{
			if(s.charAt(i)=='A' || s.charAt(i)=='E'||s.charAt(i)=='O'||s.charAt(i)=='I'||s.charAt(i)=='U'||s.charAt(i)=='a'||s.charAt(i)=='e' ||s.charAt(i)=='i' ||s.charAt(i)=='o' ||s.charAt(i)=='u')
			{
				ans+=s.charAt(i);
			}
			i++;	
		}
		i=0;
		j=ans.length()-1;
		while(i<s.length())
		{
			if(s.charAt(i)=='A' || s.charAt(i)=='E'||s.charAt(i)=='O'||s.charAt(i)=='I'||s.charAt(i)=='U'||s.charAt(i)=='a'||s.charAt(i)=='e' ||s.charAt(i)=='i' ||s.charAt(i)=='o' ||s.charAt(i)=='u')
			{
				data+=ans.charAt(j--);
			}
			else
			{
				data+=s.charAt(i);
			}
			i++;
		}
		System.out.println(data);
	}
}