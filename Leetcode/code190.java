import java.util.*;
class code
{
		
	public static void main(String[] args)
	{
		int n=43261596;
		System.out.println(Integer.toBinaryString(n));
		String data=Integer.toBinaryString(n);
		String data2=String.format("%32s", data).replaceAll(" ", "0");
		System.out.println(data);
		String neww="";
		int i=data2.length()-1;
		while(i>=0)
		{
			neww+=data2.charAt(i);
			i--;
		}
		int num=Integer.parseInt(neww,2);
		System.out.println(num);
	}

}
