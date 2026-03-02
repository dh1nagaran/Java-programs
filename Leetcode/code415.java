class Solution {
    public String addStrings(String num1, String num2) {
        int i=num1.length()-1;
        int j=num2.length()-1;
        StringBuilder sb=new StringBuilder();
        int carry=0;
        while(i>=0||j>=0 || carry!=0)
        {
            int num3=(i>=0)?num1.charAt(i)-'0':0;
            int num4=(j>=0)?num2.charAt(j)-'0':0;
            int sum=num3+num4+carry;
            carry=sum/10;
            sb.append(sum%10);
            i--;
            j--;
        }
        return sb.reverse().toString();
        
    }
}