import java.util.*;
class reverse
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the array element:");
		int num=sc.nextInt();
		int a[]=new int[num];
		for(int i=0;i<a.length;i++)
		{
			System.out.print("Enter the value:");
			a[i]=sc.nextInt();	
		}
		int n=a.length-1;
		while(n>=0)
		{
			System.out.println(a[n]);
			n--;
		}
		
	}
}