class code908
{
	public static void main(String args[])
	{
		int nums[]={0,10};
		int k=2;
		
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		for(int n:nums)
		{
			min=Math.min(min,n);
			max=Math.max(max,n);
		}
		int ans=Math.max(0,(max-min)-2*k);
		System.out.println(ans);
	
	}
}