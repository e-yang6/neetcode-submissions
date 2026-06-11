class Solution {
    public int missingNumber(int[] nums) {
        HashSet<Integer> missing = new HashSet<>();

        for(int i = 0; i < nums.length; i++) {
            missing.add(nums[i]);
        }

        for(int i = 0; i <= nums.length; i++) {
            if(!missing.contains(i)) {
                return i;
            }
        }

        return -1;
    }
}
