class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            sMap.merge(s.charAt(i), 1, Integer::sum);
            tMap.merge(t.charAt(i), 1, Integer::sum);
        }

        for (int i = 0; i < s.length(); i++) {
            if (!sMap.get(s.charAt(i)).equals(tMap.get(s.charAt(i)))) {
                return false;
            }
            if (!tMap.get(t.charAt(i)).equals(sMap.get(t.charAt(i)))) {
                return false;
            }
        }
        return true;
    }
}
