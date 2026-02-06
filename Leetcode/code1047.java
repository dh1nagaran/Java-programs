 import java.util.*;
 code 1041{
	public statuc void main(String[] args)
	 {
		String ans="";
        Stack<Character> ss=new Stack<Character>();
        ss.push(s.charAt(0));
        for(int i=1;i<s.length();i++)
        {
            ss.push(s.charAt(i));
            if(ss.size()>=2 &&(ss.get(ss.size()-2)==ss.get(ss.size()-1)))
            {
                ss.pop();
                ss.pop();
            }
        }
        for(char a:ss)
        {
            ans+=a;
        }
	 }
 }