class MyQueue {
    Stack stack = new Stack();
    Stack temp = new Stack();
    
    // Push element x to the back of queue.
    public void push(int x) {
        stack.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
        temp.clear();
        while(!stack.isEmpty()){
            temp.push(stack.pop());
        }
        temp.pop();
        while(!temp.isEmpty()){
            stack.push(temp.pop());
        }
    }

    // Get the front element.
    public int peek() {
        temp.clear();
        while(!stack.isEmpty()){
            temp.push(stack.pop());
        }
        Object peek = temp.peek();
        while(!temp.isEmpty()){
            stack.push(temp.pop());
        }
        return (int)peek;
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return stack.isEmpty();
    }
}
