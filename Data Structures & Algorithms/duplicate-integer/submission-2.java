class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> removeDuplicates = new HashSet<>();

        for(int i = 0; i < nums.length; i++) {
            removeDuplicates.add(nums[i]);
        }

        int ogLen = nums.length;
        int newLen = removeDuplicates.size();

        if(ogLen == newLen) {
            return false;
        } else {
            return true;
        }
    }
}