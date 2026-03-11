class Solution {
    public int bitwiseComplement(int n) {
        StringBuilder d=new StringBuilder(Integer.toBinaryString(n));
        for(int i=0;i<d.length();i++)
        {
            if(d.charAt(i)=='1')
            d.setCharAt(i,'0');
            else
            d.setCharAt(i,'1');
        }
        return (int)Integer.parseInt(d.toString(),2);
    }
}