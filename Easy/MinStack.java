/* 
Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
getMin() -- Retrieve the minimum element in the stack.
*/

class MinStack {
    // variables for the stack and minimum element
    Stack<Integer> stack;
    int min;
    
    /** initialize your data structure here. */
    public MinStack() {
        stack = new Stack<Integer>();
        min = Integer.MAX_VALUE;
    }
    
    public void push(int x) {
        
        // if the given val is less than or equal to the current minimum element
        if(x <= min) {
            // add min to the stack and update the minimum element
            stack.push(min);
            min = x;
        }
        
        // add the input to the stack
        stack.push(x);
    }
    
    public void pop() {
        // if the top element is equal to the minimum element, remove the top element and update min
        // this is used to keep track of the minimum element after popping the top
        if(stack.pop() == min) min = stack.pop();
    }
    
    public int top() {
        // return a copy of the top of the stack
        return stack.peek();
    }
    
    public int getMin() {
        // return the minimum element in the stack
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
