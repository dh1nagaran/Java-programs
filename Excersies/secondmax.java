import java.util.*;
class secondmax
{
	public static void main(String[] args)
	{
		int a[]={10, 20, 30, 40, 50};
		int max=a[0];
		int second=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];	
			}
		}
		for(int j=0;j<a.length;j++){
		
			if(a[j]>second && max>a[j])
			{
				second=a[j];
			}
		}
		System.out.println(second);
	}
}