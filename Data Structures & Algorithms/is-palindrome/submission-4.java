class Solution {
    public boolean isPalindrome(String s) {
        String str = s.replace(" ", "").toLowerCase();
        String pattern = str.replaceAll("[^A-Za-z0-9]", "");
        int left = 0;
        int right = pattern.length() - 1;

        while (left < right) {
            if (pattern.charAt(left) != pattern.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
