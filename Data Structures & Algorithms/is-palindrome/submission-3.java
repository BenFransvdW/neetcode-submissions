class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        String stripped = s.replace(" ", "");
        String stripRegex = stripped.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        int right = stripRegex.length() - 1;

        while (left < right) {
            if (stripRegex.charAt(left) != stripRegex.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
