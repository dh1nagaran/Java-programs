import java.util.*;
class code
{
	public static void main(String[] args)
	{
		int x=1534236469;
		long y=-0;
		int data=x;
		while(x!=0)
		{
			int temp=x%10;
			y=y*10+temp;
			x/=10;
		}
		if (y>Integer.MAX_VALUE||y<Integer.MIN_VALUE)
            System.out.println(0);
		else
		System.out.println((int)y);
	}
}