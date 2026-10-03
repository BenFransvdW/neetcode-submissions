class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int max = 0;
        for (int num : nums) {
            set.add(num);
        }

        for (int val : nums) {
            if (set.contains(val) && !set.contains(val-1)) {
                int curr = val;
                int count = 0;

                while (set.contains(curr)) {
                    curr++;
                    count++;
                }
                max = Math.max(count, max);
            }
        }
        return max;
    }
}
