import java.util.*;
class binary
{
	public static void main(String[] args)
	{
		int a[]={10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		Scanner sc=new Scanner(System.in);
		System.out.println(Arrays.toString(a));
		System.out.print("Enter the number:");
		int num=sc.nextInt();
		int low=0;
		int high=a.length;
		int pos=solve(a,num,low,high);
		if(pos==-1)
		{
			System.out.println("Item Not Found");
		}
		System.out.println("Item Found at "+ pos +" Position");
		
	}
	public static int solve(int a[],int pos,int low,int high)
	{
		int mid=low+(high-low)/2;
		if(high>=low)
		{
			if(a[mid]==pos)
				return mid;
			if(a[mid]>pos)
				return solve(a,pos,low,mid-1);
			
			
			return solve(a,pos,mid+1,high);
		}
		return -1;
	}
}