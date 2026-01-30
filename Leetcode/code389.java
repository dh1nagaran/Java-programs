import java.util.*;
class code389
{
	public static void main(String args[])
	{
		
		String s=" ";
		String t="y";
		char ch[]=s.toCharArray();
		char ch2[]=t.toCharArray();
		Arrays.sort(ch);
		Arrays.sort(ch2);
		char chs=' ';
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!=ch2[i])
				chs=ch[i];
		}
		if(chs==' ')
			chs=ch2[ch2.length-1];
		
		System.out.println(chs);
	}

}