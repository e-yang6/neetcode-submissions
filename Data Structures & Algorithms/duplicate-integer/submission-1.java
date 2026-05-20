class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> removeDuplicates = new HashSet<>();
        for (int num : nums) {
            removeDuplicates.add(num);
        }
        
        int ogLen = nums.length;
        int newLen = removeDuplicates.size();

        if(newLen == ogLen) {
            return false;
        } else {
            return true;
        }
    }
}