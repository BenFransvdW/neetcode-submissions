class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] c = strs[i].toCharArray();
            Arrays.sort(c);
            String cStr = new String(c);
            List<String> strList = new ArrayList<>();
            strList.add(strs[i]);
            if (map.keySet().contains(cStr)) {
                map.get(cStr).add(strs[i]);
            } else {
                map.put(cStr, strList);
            }
        }

        return new ArrayList<>(map.values());
    }
}
