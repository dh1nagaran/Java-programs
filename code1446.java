import java.util.*;
class code
{
	public static void main(String[] args)
	{
		String s="cc";
		int count=1;
		int max=0;
		for(int i=0;i<s.length()-1;i++)
		{
			if(s.charAt(i)==s.charAt(i+1))
				count++;
			else
			{
				if(max<count)
				{
					max=count;
				}
				count=1;
			}
		}
		if(max<count)
			max=count;
		System.out.println(max);
	}
}