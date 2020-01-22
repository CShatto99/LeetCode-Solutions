/* Write a program that outputs the string representation of numbers from 1 to n.

But for multiples of three it should output “Fizz” instead of the number and for the multiples of five output “Buzz”. For numbers which are multiples of both three and five output “FizzBuzz”. */

class Solution {
    public List<String> fizzBuzz(int n) {
        
        // declare a list of strings to be returned
        List<String> output = new ArrayList();
        
        // for every number from 1 to n
        for(int i = 1; i <= n; i++) {
            
            // if the num is a mutliple of 3 AND 5, replace it with "FizzBuzz"
            if(i % 3 == 0 && i % 5 == 0)
                output.add("FizzBuzz");
            
            // if the num is only a multiple of 3, replace it with "Fizz"
            else if(i % 3 == 0)
                output.add("Fizz");
            
            // if the num is only a multiple of 5, replace it with "Buzz"
            else if(i % 5 == 0)
                output.add("Buzz");
            
            // if the num is a neither a mutliple of 3 or 5, insert the num itself as a string
            else
                output.add(String.valueOf(i));
            
        }
        
        // return the final output
        return output;
        
    }
}
