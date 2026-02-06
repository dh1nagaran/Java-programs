import java.util.*;
class sample
{
	public static void main(String[] args)
	{ 
	   Stack<Character> ss=new Stack<Character>();
       ss.push(s.charAt(0));
       for(int i=1;i<s.length();i++)
       {
            ss.push(s.charAt(i));
            int num=0;
            if(ss.size()>=2)
                 num=ss.get(ss.size()-1)-ss.get(ss.size()-2);
            if(num==1 || num==2 && ss.size()>=2)
            {
                ss.pop();
                ss.pop();
            }
       }
        if(ss.size()>0)
            return false;
        return true;
	}
}