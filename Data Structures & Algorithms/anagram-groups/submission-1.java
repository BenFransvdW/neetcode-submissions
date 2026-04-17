class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] keys = strs[i].toCharArray();
            Arrays.sort(keys);
            String key = new String(keys);
            groups.computeIfAbsent(key, k->new ArrayList<>()).add(strs[i]);
        }
        return new ArrayList(groups.values());
    }
}