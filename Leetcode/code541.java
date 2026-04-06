class Solution {
    public String reverseStr(String s, int k) {
        int i = 0;
        int m = k;
        StringBuilder t = new StringBuilder();
        String ans = "";
        int n = s.length();
        while (i < s.length()) {
            int end = Math.min(i + k, n);
            t.append(s.substring(i, end));
            ans += t.reverse();
            i += k;
            t.delete(0, t.length());

            if(i>=n)break;
            end = Math.min(i + k, n);
            ans +=s.substring(i,end);
            i+=k;
        }
        return ans;

    }
}