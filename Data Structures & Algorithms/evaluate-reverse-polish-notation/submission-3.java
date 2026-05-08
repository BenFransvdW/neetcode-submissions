class Solution {
    public int evalRPN(String[] tokens) {
        List<Integer> stack = new ArrayList<>();
        for (int i = 0; i < tokens.length; i++) {
            if (isDigit(tokens[i])) {
                stack.add(Integer.parseInt((tokens[i])));
            } else if (tokens[i].equals("+")) {
                stack.add(pop(stack) + pop(stack));
            } else if (tokens[i].equals("-")) {
                int b = pop(stack);
                int a = pop(stack);
                stack.add(a - b);
            } else if (tokens[i].equals("*")) {
                stack.add(pop(stack) * pop(stack));
            } else {
                int b = pop(stack);
                int a = pop(stack);
                stack.add(a / b);
            }
        }
        return pop(stack);
    }

    public int pop(List<Integer> stack) {
        int result = stack.get(stack.size() - 1);
        stack.remove(stack.size() - 1);
        return result;
    }

    public boolean isDigit(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException er) {
            return false;
        }
    }
}