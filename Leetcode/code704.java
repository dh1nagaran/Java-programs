class code704
{
	public static void main(String[] args)
	{
		int nums[]={-1,0,3,5,9,12};
		int target=9;
		int count++;
		for(int n:nums)
		{
			count++;
			if(target==n)
			{
				System.out.println(count);
				break;
			}
		}
	}
}