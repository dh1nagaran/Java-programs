class Solution {
    public int[] diStringMatch(String s) {
        int n=s.length();
        int m=n;
        int n2=0;
        int num[]=new int[n+1];
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='I')num[i]=n2++;
            else num[i]=n--;
        }
        num[m]=n;
        return num;
        
    }
}