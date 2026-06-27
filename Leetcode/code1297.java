class Solution {
    public int maxFreq(String s, int maxLetters, int minSize, int maxSize) {
        int count = 0;
        HashMap<String, Integer> hs = new HashMap<>();
        for (int i = 0; i <= s.length() - minSize; i++) {
            String t = s.substring(i, i + minSize);
            HashSet<Character> hs2 = new HashSet<>();
            for (char c : t.toCharArray()) hs2.add(c);
            if (hs2.size() <= maxLetters) hs.put(t, hs.getOrDefault(t, 0) + 1);
        }
        for(String n:hs.keySet()) count=Math.max(count,hs.get(n));
        return count;
    }
}