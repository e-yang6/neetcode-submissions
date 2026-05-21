class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> res = new HashSet<>();

        for(int n : nums) {
            res.add(n);
        }

        int longest = 0;

        for(int num : res) {
            if(!res.contains(num - 1)) {
                int length = 1;
                while(res.contains(num + length)) {
                    length++;
                }

                longest = Math.max(longest, length);
            }
        }

        return longest;
    }
}
