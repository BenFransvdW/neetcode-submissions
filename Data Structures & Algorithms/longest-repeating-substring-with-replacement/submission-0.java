class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0; 
        int maxFreq = 0;
        int maxLength = 0;
        Map<Character, Integer> map = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            map.merge(c, 1, Integer::sum);

            maxFreq = Math.max(map.get(c), maxFreq);

            while ((right - left + 1) - maxFreq > k) {
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}
