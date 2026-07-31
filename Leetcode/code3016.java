
class Solution {
    public int minimumPushes(String word) {
        int ans = 0;
        HashMap<Character, Integer> words = new HashMap<>();
        HashMap<Character, Integer> count = new HashMap<>();
        int i = 0;
        for (char c : word.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        }
        Map<Character, Integer> sortedMap = count.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue,
                        LinkedHashMap::new));
        for (char c : sortedMap.keySet()) {
            int f = (int) Math.floor(i / 8) + 1;
            words.put(c, f);
            i++;
        }
        for (char c : words.keySet())
            ans += words.get(c) * count.get(c);
        return ans;

    }
}