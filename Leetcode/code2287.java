class Solution {
    public int rearrangeCharacters(String s, String target) {
        if (s.length() < target.length())
            return 0;
        int count = Integer.MAX_VALUE;
        HashMap<Character, Integer> hs = new HashMap<>();
        HashMap<Character, Integer> hs2 = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (target.indexOf(c) != -1)
                hs.put(c, hs.getOrDefault(c, 0) + 1);
        }
        for (char c : target.toCharArray()) {
            hs2.put(c, hs2.getOrDefault(c, 0) + 1);
        }
        if (hs.size() == hs2.size()) {
            for (char c : hs2.keySet()) {

                count = Math.min(hs.get(c) / hs2.get(c), count);
            }
        }

        return count == Integer.MAX_VALUE ? 0 : count;
    }
}