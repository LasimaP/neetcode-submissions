class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> numMap = new HashMap<>();

        for (int num : nums) {
            if (!numMap.containsKey(num)) {
                numMap.put(num, 1);
            } else {
                int value = numMap.get(num);
                numMap.replace(num, value, ++value);
            }
        }

        int flagMax = numMap.size() - k;
        int flagCount = 0;
        while (flagCount < flagMax) {
            flagCount = 0;
            for (int key : numMap.keySet()) {
                int value = numMap.get(key);
                numMap.replace(key, value, --value);
                
                if (numMap.get(key) < 1) {
                    flagCount++;
                }
            }

        }
 
        int[] ans = new int[k];
        int idx = 0;
        for (int key : numMap.keySet()) {
            if (numMap.get(key) > 0) {
                 ans[idx] = key; 
                idx++;
            }
        }
        
        return ans;
    }
}
