class Solution {
    public String addBinary(String a, String b) { 
        int c=0;
        StringBuilder ans=new StringBuilder();
        int i=a.length()-1;
        int j=b.length()-1;
        while(i>=0||j>=0||c==1)
        {
            int n1=i>=0?a.charAt(i--)-'0':0;
            int n2=j>=0?b.charAt(j--)-'0':0;
            int sum=n1+n2+c;
            ans.append(sum%2);
            c=sum/2;    
        }
        return ans.reverse().toString();
    }
}