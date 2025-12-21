import java.util.*;
class thirdarr
{
	public static void main(String[] args)
	{
		int arr1[]= {1, 2, 3, 4, 5};
		int arr2[]={6, 7, 8, 9, 10};
		int b[]=new int[arr1.length];
		int count=0;
		int c[]=new int[arr2.length];
		int count2=0;
		
		System.out.println("array 1:"+Arrays.toString(arr1)); 
		System.out.println("array 2:"+Arrays.toString(arr2));
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i]%2==0)
			{
			b[count++]=arr1[i];
				
			}	
			else
			{
				c[count2++]=arr1[i];
			}
		}
		for(int j=0;j<arr2.length;j++)
		{
			if(arr2[j]%2==0)
			{
				b[count++]=arr2[j];	
			}
			else
			{
				c[count2++]=arr2[j];
			}
			
		}
		System.out.println("Even elements between two array:"+Arrays.toString(b));
		System.out.println("Odd elements between two array:"+Arrays.toString(c));
	}
}