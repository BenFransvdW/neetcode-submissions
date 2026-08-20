class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;

        List<Character> stack = new ArrayList<>();
        char[] opening = new char[]{'[', '(', '{'};
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '[' || s.charAt(i) == '{' || s.charAt(i) == '(') {
                stack.add(s.charAt(i));
            } else {
                if (stack.size() == 0) return false;
                if (s.charAt(i) == ']') {
                    char c = stack.remove(stack.size() - 1);
                    if (c != '[') return false;
                } else if (s.charAt(i) == '}') {
                    char c = stack.remove(stack.size() - 1);
                    if (c != '{') return false;
                } else if (s.charAt(i) == ')') {
                    char c = stack.remove(stack.size() - 1);
                    if (c != '(') return false;
                }
            }
        }

        return stack.size() == 0;
    }
}
