class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        int flagMax = freqMap.size() - k;
        int flagCount = 0;

        while (flagCount < flagMax) {
            flagCount = 0;

            for (int key : freqMap.keySet()) {
                int value = freqMap.get(key);
                freqMap.replace(key, --value);

                if (freqMap.get(key) < 1) {
                    flagCount++;
                } 
            }
        }

        int[] ans = new int[k];
        int idx = 0;

        for (int key : freqMap.keySet()) {
            if (freqMap.get(key) > 0) {
                ans[idx] = key;
                idx++;
            }
        }

        return ans;
    }
}
