package Exception;
import java.util.*;
public class code2578 {

	public static void main(String[] args) {
		int num=999999999;
		String num1="";
		String num2="";
		int count=0;
		ArrayList a1=new ArrayList<>();
		while(num>0)
		{
			int temp=num%10;
			a1.add(count,temp);
			count++;
			num/=10;
		}
		System.out.println(a1);
		Collections.sort(a1);
		System.out.println(a1);
		int mid=a1.size()/2;
		for(int i=0;i<a1.size();i++)
		{
			if(i<mid)
				num1+=String.valueOf(a1.get(i));
			else
				num2+=String.valueOf(a1.get(i));
		}
		System.out.println(Integer.parseInt(num1)+Integer.parseInt(num2));

	}

}
