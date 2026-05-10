import java.math.BigInteger;
class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        int n = nums.length;
       BigInteger[] m = new BigInteger[n];
        for (int i = 0; i < n; i++)
            m[i] =new BigInteger(nums[i]); 
        Arrays.sort(m);
        return String.valueOf(m[n - k]);
    }
}