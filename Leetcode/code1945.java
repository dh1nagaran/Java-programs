class Solution {
    public int getLucky(String s, int k) {
        long num=0;
		String t="";
		int i=0;
		for(char c:s.toCharArray())
		{
			t+=(int)c-'a'+1;
		}
        for(char c:t.toCharArray())
        {
            num+=(int)c-'0';
        }
        i++;
		while(i<k)
		{
			int num2=0;
			while(num>0)
			{
				num2+=num%10;
				num/=10;
			}
			num=num2;
			i++;
		}
        return (int)num;
        
    }
}