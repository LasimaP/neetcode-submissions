class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Integer> charMap = new HashMap<>();

        for (char c : s.toCharArray()) {
            charMap.put(c, charMap.getOrDefault(c, 0) + 1);
        }

        HashMap<Character, Integer> charMap2 = new HashMap<>();

        for (char c : t.toCharArray()) {
            charMap2.put(c, charMap2.getOrDefault(c, 0) + 1);
        }

        return charMap.equals(charMap2);

    }
}
