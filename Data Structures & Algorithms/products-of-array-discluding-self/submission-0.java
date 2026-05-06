class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] results = new int[nums.length];
        for (int i = 0; i < results.length; i++) {
            results[i] = 1;
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (j != i) {
                    results[i] = results[i] * nums[j];
                }
            }
        }
        return results;
    }
}  
