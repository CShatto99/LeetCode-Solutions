/* Given head which is a reference node to a singly-linked list. The value of each node in the linked list is either 0 or 1. The linked list holds the binary representation of a number.

Return the decimal value of the number in the linked list. */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
        
        // declare variables for the decimal value and the number of bits
        int decimalVal = 0, binDigits = -1;
        
        // declare a pointer to the head node
        ListNode current = head;
        
        // while the end of the list has not been reached
        while(current != null) {
            
            // increment the number of bits
            binDigits++;
            // move to the next node
            current = current.next;
            
        }
        
        // reset the current node to the head node
        current = head;
        
        // while the end of the list has not been reached
        while(current != null) {
            
            // if the value of the current node is 1, add 2^binDigits to the final decimal value
            if(current.val == 1)
                decimalVal += Math.pow(2, binDigits);
            
            // decrement the number of bits left
            binDigits--;
            // move to the next node
            current = current.next;
            
        }
        
        // return the final decimal value
        return decimalVal;
        
    }
}
