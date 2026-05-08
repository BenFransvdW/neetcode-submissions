class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] sCharr = strs[i].toCharArray();
            Arrays.sort(sCharr);
            groups.computeIfAbsent(new String(sCharr), k -> new ArrayList<>()).add(strs[i]);
        }
        List<List<String>> result = new ArrayList<>(groups.values());
        return result;
    }
}