class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    
        List<List<String>> anagrams = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            String key = stringSort(strs[i]);

            if (!map.containsKey(key)) {
                int value = map.size();
                map.put(key, value);
                
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                anagrams.add(list);
            } else {
                int idx = map.get(key);
                anagrams.get(idx).add(strs[i]);
            }

        }

        return anagrams;

    }

    public static String stringSort(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        
        return String.valueOf(arr);
    }
}
