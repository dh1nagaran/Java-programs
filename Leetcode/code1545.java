class Solution {
    public char findKthBit(int n, int k) {
        String ans="0";
        for(int i=1;i<n;i++)
        {
            String n2=ans;
            n2=n2.replaceAll("0","x");
            n2=n2.replaceAll("1","0");
            n2=n2.replaceAll("x","1");
            StringBuilder s=new StringBuilder(n2);
            ans=ans+'1'+s.reverse().toString();
        }
        System.out.println(ans);
        return ans.charAt(k-1); 
    }
}