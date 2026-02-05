package Exception;
import java.util.*;

public class stacks {

	public static void main(String[] args) {
		String s="leet**cod*e";
		String ans="";
		Stack <Character>ss=new Stack<>();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='*')
				ss.pop();
			else
			ss.push(s.charAt(i));
			
		}
		System.out.print(ss);
		for(char b : ss){
			ans+=b;	
		}
		System.out.println(ans);
		
		

	}

}
