class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] str = strs[i].toCharArray();
            Arrays.sort(str);
            groups.computeIfAbsent(new String(str), k-> new ArrayList<>()).add(strs[i]);
        }

        return new ArrayList<>(groups.values());
    }
}
