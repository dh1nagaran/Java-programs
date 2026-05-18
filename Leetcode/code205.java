class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> hs = new HashMap<>();
        HashMap<Character, Character> hs2 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            if (hs.containsKey(ch1)) {
                if (hs.get(ch1) != ch2)
                    return false;
            }
            hs.put(ch1, ch2);
        }
        for (int i = 0; i < s.length(); i++) {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            if (hs2.containsKey(ch2)) {
                if (hs2.get(ch2) != ch1)
                    return false;
            }
            hs2.put(ch2, ch1);
        }
        return true;

    }
}