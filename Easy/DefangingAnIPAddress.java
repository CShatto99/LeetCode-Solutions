/* Given a valid (IPv4) IP address, return a defanged version of that IP address.

A defanged IP address replaces every period "." with "[.]". */

class Solution {
    public String defangIPaddr(String address) {
        
        // declare variable to hold the number of brackets
        int numBrackets = 0;
        
        // for every char in the address
        for(int i = 0; i < address.length(); i++)
            // if the current char is a period, add two to the bracket counter
            if(address.charAt(i) == '.')
                numBrackets+=2;
        
        // declare a new defanged char array with the address length plus the new brackets
        char[] defanged = new char[address.length() + numBrackets];
        int defangedIndex = 0;
        
        // for every char in the address
        for(int i = 0; i < address.length(); i++) {
            
            // if the current char is a period
            if(address.charAt(i) == '.') {
                
                // add the following three chars to the defanged array
                defanged[defangedIndex++] = '[';
                defanged[defangedIndex++] = '.';
                defanged[defangedIndex++] = ']'; 
                // increment the looping variable
                i++;
                
            }
            
            // if the current char is not a period, just add it to the defanged array
            defanged[defangedIndex++] = address.charAt(i);
            
        }
        
        // return the string conversion of the defanged char array
        return new String(defanged);
        
    }
}
