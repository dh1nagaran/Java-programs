import java.util.*;
class code796
{
	public static void main(String[]args)
	{
		String s="abcde";
		String goal="cdeab";
		int n=goal.length()-1;
		int i=0;
		while(i<s.length())
		{
			goal=goal.charAt(n)+goal.substring(0,n);
			if(s.equals(goal))
				break;
			i++;
		}
		System.out.println(goal);
		
	}
}