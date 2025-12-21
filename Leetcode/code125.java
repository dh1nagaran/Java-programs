import java.util.*;
class para
{
	public static void main(String[] args)
	{
		String s="0P";
		 String data="";
        String data2="";
        int j=0;
        for(int i=s.length()-1;i>=0;i--)
        {

            if(Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i)))
            {
                data+=s.charAt(i);
            }
             if(Character.isLetter(s.charAt(j)) || Character.isDigit(s.charAt(i)))
            {
                data2+=s.charAt(j);
              
            }
			  j++;
        }
		System.out.println(data2);
		System.out.println(data);
        if(data.equalsIgnoreCase(data2))
            System.out.println(true);
        
		else
			System.out.println(false);
	}
	
}