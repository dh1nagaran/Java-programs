class Solution {
    public int maxFreqSum(String s) {
        int[] freq = new int[26];
        String vowel = "aeiou";
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        int maxVowel = 0;
        int maxCons = 0;
        for (int i = 0; i < 26; i++) {
            char c = (char)(i + 'a');
            if (vowel.indexOf(c) != -1) {
                maxVowel = Math.max(maxVowel, freq[i]);
            } else {
                maxCons = Math.max(maxCons, freq[i]);
            }
        }

        return maxVowel + maxCons;
    }
}
