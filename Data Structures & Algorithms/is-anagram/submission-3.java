class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Integer> charMap1 = stringToMap(s);
        HashMap<Character, Integer> charMap2 = stringToMap(t);

        return charMap1.equals(charMap2);
    }

    public static HashMap<Character, Integer> stringToMap(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char key = s.charAt(i);

            if(map.containsKey(key)) {
                int val = map.get(key);
                map.replace(key, val, val + 1);
            } else {
                map.put(key, 1);
            }
        }

        return map;


    }
}
