class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            if (map.containsKey(key)) {
                map.get(key).add(strs[i]);
            } else {
                List<String> group = new ArrayList<>();
                group.add(strs[i]);
                map.put(key, group);
            }
        }
        return new ArrayList<>(map.values());
    }
}
