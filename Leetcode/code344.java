
import java.util.*;
class code
{
	public static void main(String[] args)
	{
		char ch[]={'h','e','e','n','a','H'};
		int mid=ch.length/2;
		int i=0;
		int j=ch.length-1;
		while(i<mid)
		{
			char temp=ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
			i++;
			j--;
		}
		System.out.println(Arrays.toString(ch));
	}
}