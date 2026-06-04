class Solution {
    public int[] sortedSquares(int[] nums) {
        int i = 0;
        int j = nums.length - 1;

        int[] result = new int[nums.length];

        for(int k = nums.length - 1; k >= 0; k--) {
            int square;
            if(Math.abs(nums[i]) < Math.abs(nums[j])) {
                square = nums[j];
                j--;
            } else {
                square = nums[i];
                i++;
            }
            result[k] = square * square;
        }

        return result;
    }
}