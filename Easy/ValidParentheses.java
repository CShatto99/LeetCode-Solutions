/* Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

    Open brackets must be closed by the same type of brackets.
    Open brackets must be closed in the correct order.

Note that an empty string is also considered valid. */

class Solution {
    
    // declare a hashmap to store each character
    private HashMap<Character, Character> mappings;
    
    // use constructor to initialize and fill the hashmap
    public Solution() {
        this.mappings = new HashMap<Character, Character>();
        this.mappings.put(')', '(');
        this.mappings.put(']', '[');
        this.mappings.put('}', '{');
    }
    
    
    public boolean isValid(String s) {
        
        // initialize a stack to temporarily store characters
        Stack<Character> stack = new Stack<Character>();
        
        // for every character in the given string
        for(int i = 0; i < s.length(); i++) {
            
            // get the current character
            char c = s.charAt(i);
            
            // is the hashmap contains a key corresponding to 'c'
            if(this.mappings.containsKey(c)) {
                
                // store the top of the stack in a variable (# if stack is empty)
                char top = stack.isEmpty() ? '#' : stack.pop();
                // if top does not have matching character
                if(top != this.mappings.get(c)) return false;
                
            }
            
            // otherwise, push the character to the stack
            else
                stack.push(c);
            
        }
        
        // return true if the stack is empty
        return stack.isEmpty();
    }
}
