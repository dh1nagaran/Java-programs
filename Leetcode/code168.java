class sample
{
	public static void main(String args[])
	{
		int num=2147483647;
		String ans="";
		StringBuilder ans = new StringBuilder();
		
		 while (num > 0) 
		{
            num--;                         
            int rem = num % 26;            
            ans.append((char)(rem + 'A')); 
            num /= 26;                 
        }
		System.out.println(ans);
	}
}