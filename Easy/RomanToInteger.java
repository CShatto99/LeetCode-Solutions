class Solution {
    
    // declare a hashmap for the roman letters
    private HashMap<Character, Integer> romanToInt;
    
    // use construtor to fill hashmap
    public Solution() {
        
        // initialize the new hashmap
        this.romanToInt = new HashMap<Character, Integer>();
        
        // put each roman letter-integer translation in the hashmap
        this.romanToInt.put('I', 1);
        this.romanToInt.put('V', 5);
        this.romanToInt.put('X', 10);
        this.romanToInt.put('L', 50);
        this.romanToInt.put('C', 100);
        this.romanToInt.put('D', 500);
        this.romanToInt.put('M', 1000);
        
    }
    
    public int romanToInt(String s) {
        
        // convert the given string to a character array
        char sArray[] = s.toCharArray();
        
        // declare and initialize a result and previous variable
        int result = 0, previous = 0;
        
        // for every letter in the char array
        for(char letter : sArray) {
            
            // get the value of the letter
            int value = romanToInt.get(letter);
            
            // this checks for the special cases of: "IV", "IX", "XL", "XC", "CD", "CM"
            // if the previous value is less than the current value
            if(previous < value) {
                
                // substract the value of previous from result
                result -= previous;
                
                // subtract the value of previous from value
                value -= previous;
                
            }
            
            // add value to the result
            result += value;
            // set previous equal to value
            previous = value;
        }
        
        // return the final result
        return result;
    }
}
