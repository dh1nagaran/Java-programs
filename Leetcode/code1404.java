import java.math.BigInteger;

class Solution {
    public int numSteps(String s) {
        int count = 0;
        BigInteger num = new BigInteger(s, 2);
        BigInteger one = BigInteger.ONE;
        while (num.compareTo(one) > 0) {
            if (num.mod(BigInteger.TWO).equals(BigInteger.ZERO))
                num=num.divide(BigInteger.TWO);
            else
                num=num.add(BigInteger.ONE);
            count++;
        }
        return count;
    }
}