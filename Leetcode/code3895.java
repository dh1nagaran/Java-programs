class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int count=0;
        for(int i:nums)
        {
            int num=i;
            while(num>0)
            {
                int temp=num%10;
                if(temp==digit) count++;
                num/=10;
            }
        }
        return count;
    }
}