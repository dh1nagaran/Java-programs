class Solution {
    public boolean hasAlternatingBits(int n) {
        String data=Integer.toBinaryString(n);
        for(int i=1;i<data.length();i++)
        {
            if(data.charAt(i)==data.charAt(i-1))
                return false;
        }
        return true;
        
    }
}