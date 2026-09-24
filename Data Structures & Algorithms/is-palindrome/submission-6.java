class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        String lowerStr = s.replace(" ", "").toLowerCase();
        String regStr = lowerStr.replaceAll("[^A-Za-z0-9]", "");
        int right = right = regStr.length() - 1;
        while (left < right) {
            if (regStr.charAt(left) != regStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
