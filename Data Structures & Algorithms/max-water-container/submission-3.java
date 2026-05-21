class Solution {
    public int maxArea(int[] heights) {
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < heights.length; i++) {
            int l = i;
            int r = heights.length - 1;

            while(l < r) {

                int area = Math.min(heights[l], heights[r]) * (r - l);

                max = Math.max(area, max);
                if(heights[l] < heights[r]) {
                    l++;
                } else {
                    r--;
                }
            }
        }

        return max;
    }
}
