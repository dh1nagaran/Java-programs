import java.util.*;
class sample
{
	public static void main(String[] args)
	{
		String s="a good   example";
		s=s.trim();
		String a[]=s.split(" ");
		int i=a.length-1;
		System.out.println(Arrays.toString(a));
		s="";
		while(i>=0)
		{
			if(!(a[i].isEmpty()) && i>0)
			{
				s+=a[i]+" ";
			}
			else if(i==0)
			{
				s+=a[i];
			}
			i--;
		}
		System.out.println(s);
	}
}