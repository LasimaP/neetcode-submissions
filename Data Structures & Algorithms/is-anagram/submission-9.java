class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Integer> charMap = new HashMap<>();

        for (char c : s.toCharArray()) {
            charMap.put(c, (charMap.getOrDefault(c, 0) + 1));
        }

        for (char c : t.toCharArray()) {
            charMap.put(c, (charMap.getOrDefault(c, 0) - 1));
        }

        for (char c : charMap.keySet()) {
            if (charMap.get(c) > 0) {
                return false;
            }
        }

        return true;
    }
}
