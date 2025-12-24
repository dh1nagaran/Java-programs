import java.util.*;
class code
{
	public static void main(String[] args)
	{
		int nums[]={1,0,0,0,1,0,0,1};
		int k=2;
		 int prev = -1; 
        boolean result = true;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                if (prev != -1 && i - prev - 1 < k) {
                    result = false;
                    break;
                }
                prev = i;
            }
        }
        System.out.println(result);
	}
}