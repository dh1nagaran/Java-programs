import java.util.*;
class code
{
	public static void main(String[] args)
	{
		 String  s = "ab", t= "baab"; 
		 StringBuilder t1=new StringBuilder(t);
        int i=0;
        int index=0;
		boolean data=true;
        while(i<s.length())
        {
            if(t1.indexOf(String.valueOf(s.charAt(i)))!=-1)
            {
                index=t1.indexOf(String.valueOf(s.charAt(i)));
                t1.replace(index,index+1," ");
				t1=new StringBuilder(t1.substring(index+1,t1.length()));
            }
            else
            {
				data=false;
                 break;
            }
            i++;
        }
		
		System.out.println(data);
	}
}