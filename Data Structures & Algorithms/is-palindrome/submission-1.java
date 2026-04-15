class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replace(" ", "");
        String pattern = "[^a-zA-Z0-9]";
        String input = s.replaceAll(pattern, "");
        int left = 0;
        int right = input.length() - 1;

        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}