class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            int complement = target - n;

            if (map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }
            if (!map.containsKey(n)) {
                map.put(n, i);
            }
        }

        return new int[2];
    }
}
