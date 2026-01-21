import java.util.*;
class sample
{
	public static void main(String[] args)
	{
		int n=368349;
		int count=0;
		boolean prime[]=new boolean[n];
		prime[0]=false;
		prime[1]=false;
		for(int i=2;i<n;i++)
		{
			prime[i]=true;
		}
		for(int p=2;p*p<n;i++)
		{
			if(prime[j]){
				for(int j=p*p;j<n;j+=p)
				{
					prime[j]=false;
				}
			}
		}
		for(boolean isPrime:prime)
		{
			if(isPrime)
				count++;
		}
		System.out.println(count);
	}
}