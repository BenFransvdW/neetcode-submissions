class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            char[] cArr = strs[i].toCharArray();
            Arrays.sort(cArr);
            String cStr = new String(cArr);
            List<String> key = new ArrayList<>();
            key.add(strs[i]);
            if (map.containsKey(cStr)) {
                map.get(cStr).add(strs[i]);
            } else {
                map.put(cStr, key);
            }
        }

        return new ArrayList<>(map.values());
    }
}
