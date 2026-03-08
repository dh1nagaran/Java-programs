class Solution {
    public int minOperations(String s) {
        int count=0;
		int count2=0;
		String temp=String.valueOf('0');
		String temp2=String.valueOf('1');
		for(int i=1;i<s.length();i++)
		{
			if(temp.charAt(i-1)=='1')
				temp+=String.valueOf('0');
			else
				temp+=String.valueOf('1');
			
			if(temp2.charAt(i-1)=='1')
				temp2+=String.valueOf('0');
			else
				temp2+=String.valueOf('1');
			
		}
		System.out.println(temp);
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=temp.charAt(i))
				count++;
			if(s.charAt(i)!=temp2.charAt(i))
				count2++;
		}
        return Math.min(count,count2);
        
    }
}