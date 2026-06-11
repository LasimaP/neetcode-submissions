class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> charMap1 = stringToMap(s);
        HashMap<Character, Integer> charMap2 = stringToMap(t);

        return charMap1.entrySet().equals(charMap2.entrySet());
    }

    public static HashMap<Character, Integer> stringToMap(String s) {
        HashMap<Character, Integer> charMap = new HashMap<>();

        for (char c : s.toCharArray()) {
            charMap.put(c, charMap.getOrDefault(c, 0) + 1);
        }
        
        return charMap;
    }
}
