class Solution {
    public boolean isValid(String s) {
        List<Character> stack = new ArrayList<>();
        char[] opening = {'(', '{', '['};
        char open;
        char c;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.add(c);
            } else if (c == '}') {
                open = pop(stack);
                if (open != '{') return false;
            } else if (c == ')') {
                open = pop(stack);
                if (open != '(') return false;
            } else if (c == ']') {
                open = pop(stack);
                if (open != '[') return false;
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }

    private Character pop(List<Character> stack) {
        if (stack.isEmpty()) return 's';
        char out = stack.get(stack.size() - 1);
        stack.remove(stack.size() - 1);
        return out;
    }

}
