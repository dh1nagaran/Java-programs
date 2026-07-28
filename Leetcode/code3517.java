class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length();
        int m = n / 2;
        if (n <= 2)
            return s;
        char f[] = s.substring(0, m).toCharArray();
        Arrays.sort(f);
        String t = new String(f);
        StringBuilder k = new StringBuilder(t).reverse();
        if (n % 2 == 1)
            t += s.charAt(m);
        return t + k.toString();
    }
}