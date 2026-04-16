class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Integer> sOccurrences = new HashMap<>();
        Map<Character, Integer> tOccurrences = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (sOccurrences.keySet().contains(s.charAt(i))) {
                sOccurrences.merge(s.charAt(i), 1, Integer::sum);
            } else {
                sOccurrences.put(s.charAt(i), 0);
            }
            if (tOccurrences.keySet().contains(t.charAt(i))) {
                tOccurrences.merge(t.charAt(i), 1, Integer::sum);
            } else {
                tOccurrences.put(t.charAt(i), 0);
            }
        }
        return sOccurrences.equals(tOccurrences);
    }
}
