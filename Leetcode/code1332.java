import java.util.*;
class code
{
	public static void main(String[] args)
	{
		String s="baabb";
		int left = 0;
		int right = s.length() - 1;
		while (left < right) {
            if (s.charAt(left) != s.charAt(right)) 
				return 2;
            left++;
            right--;
        }
        System.out.println(1);
		
	}
}