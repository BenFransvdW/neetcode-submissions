class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            char[] cArr = strs[i].toCharArray();
            Arrays.sort(cArr);
            String key = new String(cArr);
            if (map.containsKey(key)) {
                map.get(key).add(strs[i]);
            } else {
                List<String> value = new ArrayList<>();
                value.add(strs[i]);
                map.put(key, value);
            }
        }
        return new ArrayList<>(map.values());
    }
}
