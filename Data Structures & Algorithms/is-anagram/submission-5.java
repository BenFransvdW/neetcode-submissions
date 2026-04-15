class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        Hashtable<Character, Integer> table = new Hashtable<>();

        for (char c : s.toCharArray()) {
            table.put(c, table.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            if (!table.containsKey(c)) return false;
            table.put(c, table.get(c) - 1);
            if (table.get(c) < 0) return false;
        }
        return true;
    }
    
}
