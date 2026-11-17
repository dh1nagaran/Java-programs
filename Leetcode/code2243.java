class Solution {
    public String digitSum(String s, int k) {
        int n=s.length();
        while(n>k){
            s=round(k,s);
            n=s.length();
        }
        return s;   
    }
    String round(int k,String s){
        int count=0;
        StringBuilder ans=new StringBuilder();
        int add=0;
        for(int i=0;i<s.length();i++){
            count++;
            add+=(int)s.charAt(i)-'0';
            if(count==k){
                ans.append(String.valueOf(add));
                count=0;
                add=0;
            }
        }
        if(count>0) ans.append(String.valueOf(add));
        return String.valueOf(ans);
    }
}