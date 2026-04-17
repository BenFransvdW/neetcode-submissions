class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] keyChars = strs[i].toCharArray();
            Arrays.sort(keyChars);
            String key = new String(keyChars);
            groups.computeIfAbsent(key, k -> new ArrayList()).add(strs[i]);
        }
        return new ArrayList(groups.values());
    }
}