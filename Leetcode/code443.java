class Solution {
    public int compress(char[] chars) {
        int count = 1;
        int i = 0;
        int prev = 0;
        int m = 0;
        String s = "";
        for (i = 1; i < chars.length; i++) {
            if (chars[i] != chars[i - 1]) {
                chars[m++] = chars[i - 1];
                prev++;
                if (count > 1) {
                    s = String.valueOf(count);
                    prev += s.length();
                    for (int j = 0; j < s.length(); j++) {
                        chars[m++] = s.charAt(j);
                    }
                }
                count = 1;
                s = "";
            } else
                count++;
        }
        s += chars[i - 1];
        prev++;
        chars[m++] = chars[i - 1];
        if (count > 1) {
            s = String.valueOf(count);
            prev += s.length();
            for (int j = 0; j < s.length(); j++) {
                chars[m++] = s.charAt(j);
            }
        }
        return prev;

    }
}