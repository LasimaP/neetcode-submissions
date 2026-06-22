class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> groupMap = new HashMap<>();
        for (String s : strs) {
            String key = sort(s);
            if (!groupMap.containsKey(key)) {
                List<String> newList = new ArrayList<>();
                newList.add(s);
                groupMap.put(key, newList);
            } else {
                groupMap.get(key).add(s);
            }
        }

        List<List<String>> anagramLists = new ArrayList<>();
        for (String key : groupMap.keySet()) {
            anagramLists.add(groupMap.get(key));
        }

        return anagramLists;
        
    }

    public static String sort(String s) {
        char[] charArr = s.toCharArray();
        Arrays.sort(charArr);
        return Arrays.toString(charArr);
    }
}
