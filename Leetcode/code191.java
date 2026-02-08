class Solution {
    public int hammingWeight(int n) {
        String data=Integer.toBinaryString(n);
        int sum=0;
        int i=0;
        while(i<data.length())
        {
            if(data.charAt(i++)=='1')
                sum++;

        }
        return sum;
    }
}