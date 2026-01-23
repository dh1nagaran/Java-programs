import java.util.*;
class sample

{
	public static void main(String[] args)
	{
		String word1="abcd";
		String word2="pq";
		int max=Math.max(word1.length(),word2.length());
        int i=0;
        String ans="";
        while(i<max)
        {
            if(i<word1.length())
            {
                ans+=word1.charAt(i);
            }
            if(i<word2.length())
            {
                ans+=word2.charAt(i);
            }
            i++;
        }
		System.out.println(ans);
	}
}