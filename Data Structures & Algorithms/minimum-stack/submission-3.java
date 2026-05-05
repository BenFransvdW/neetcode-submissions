class MinStack {
    List<Integer> stack;
    List<Integer> minStack;

    public MinStack() {
        this.stack = new ArrayList<>();
        this.minStack = new ArrayList<>();
    }
    
    public void push(int val) {
        stack.add(val);
        if (minStack.isEmpty()) {
            minStack.add(val);
        } else  {
            int currentMin = minStack.get(minStack.size() - 1);
            minStack.add(Math.min(currentMin, val));
        }
    }
    
    public void pop() {
        stack.remove(stack.size() - 1);
        minStack.remove(minStack.size() - 1);
    }
    
    public int top() {
        return stack.get(stack.size() - 1);
    }
    
    public int getMin() {
        return this.minStack.get(minStack.size() - 1);
    }
}
