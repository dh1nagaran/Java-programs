import java.util.*;
class code
{
	public static void main(String[] args)
	{
		char data[]={'c','f','j'};
		char target='j';
		char ans=data[data.length-1]; 
		for(int i=0;i<data.length;i++)
		{
			if(target<data[i] && ans>data[i])
			{
				ans=data[i];
			}
		}
		if(ans<=target)
		{
			ans=data[0];
		}
		System.out.println(ans);
		
	}
}