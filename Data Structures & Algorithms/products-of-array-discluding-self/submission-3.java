class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];

        int product = 1;
        int zeroCount = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                zeroCount++;
            } else {
                product *= nums[i];
            }
        }

        for(int i = 0; i < nums.length; i++) {
            if(zeroCount != 0) {
                if(nums[i] != 0) {
                    output[i] = 0;
                } else if(zeroCount > 1) {
                    output[i] = 0;   
                } else {
                    output[i] = product;
                }
            } else {
                output[i] = product / nums[i];
            }
            
        }

        return output;
    }
}  
