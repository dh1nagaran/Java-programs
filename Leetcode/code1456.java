import java.util.*;
class code1456
{
	public static void main(String[] args)
	{
		String s="tryhard";
		int k=4;
		int i=0;
		int j=k;
		String data=s.substring(i,j);
		String vowel="aeiou";
		int count=0;
		int ans=0;
		for(char c:data.toCharArray())
		{
			if(vowel.indexOf(c)!=-1)
			count++;	
		}
		i++;
		j++;
		ans=count;
		System.out.println(ans);
		 for (i = k; i < s.length(); i++) {
            if (vowel.indexOf(s.charAt(i - k)) != -1) {
                count--;
            }
            if (vowel.indexOf(s.charAt(i)) != -1) {
                count++;
            }
            ans = Math.max(ans, count);
        }
		System.out.println(ans);
		
	}
}