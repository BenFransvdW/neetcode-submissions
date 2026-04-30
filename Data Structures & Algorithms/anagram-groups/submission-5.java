class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] sArr = strs[i].toCharArray();
            Arrays.sort(sArr);
            groups.computeIfAbsent(new String(sArr), k -> new ArrayList<>()).add(strs[i]);
        }
        return new ArrayList<>(groups.values());
    }
}