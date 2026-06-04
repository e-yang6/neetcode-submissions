class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] output = new int[nums.length];

        for(int i = 0; i < output.length; i++) {
            output[i] = nums[i] * nums[i];
        }

        Arrays.sort(output);

        return output;
    }
}