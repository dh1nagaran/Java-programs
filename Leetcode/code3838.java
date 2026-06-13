class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        String ans = "";
        for (String s : words) {
            int num = 0;
            for (char c : s.toCharArray())
                num += weights[c - 'a'];
            num = 122 - (num % 26);
            ans += (char) num;
        }
        return ans;

    }
}