import java.util.*;
class code2000
{
	public static void main(String[] args)
	{ 
	 String s="abcdefd";
	 char ch='d';
	  int val=s.indexOf(ch);
      if(val==-1)
        return s;

    StringBuilder ans=new StringBuilder();
    ans.append(s.substring(0,val+1));
    ans.reverse();
    ans.append(s.substring(val+1,s.length()));
    return ans.toString(); 
	}
}