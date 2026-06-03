class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> anagrams = new ArrayList<>();
        HashMap<List<Integer>, List<String>> freqMap = new HashMap<>();

        for (String s : strs) {
            List<Integer> key = stringToFreqList(s);
            if (!freqMap.containsKey(key)) {
                freqMap.put(key, new ArrayList<>());
            }

            freqMap.get(key).add(s);
        }

        for (List<Integer> key : freqMap.keySet()) {
            // System.out.println(freqMap.get(key));
            anagrams.add(freqMap.get(key));
        }
        return anagrams;
    }

    public static List<Integer> stringToFreqList(String s) {
        int[] freq = new int[26];
        
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        return Arrays.stream(freq)
                 .boxed()
                 .collect(Collectors.toList());
    }
}
