class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Integer> map1 = stringToFreqMap(s);
        HashMap<Character, Integer> map2 = stringToFreqMap(t);

        for (int i = 0; i < s.length(); i++) {
            char key = s.charAt(i);
            if (!map1.getOrDefault(key, 0).equals(map2.getOrDefault(key, 0))) {
                return false;
            }
        }

        return true;
    }

    public static HashMap<Character, Integer> stringToFreqMap(String s) {
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