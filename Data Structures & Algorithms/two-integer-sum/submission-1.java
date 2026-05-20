class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> indices = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            indices.put(nums[i], i);
        }

        for(int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];

            if(indices.containsKey(diff) && indices.get(diff) != i) {
                int[] output = {i, indices.get(diff)};
                return output;
            }
        }

        int[] random = new int[0];

        return random;
    }
}
