/* Given a singly linked list, determine if it is a palindrome. */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

class Solution {
    public boolean isPalindrome(ListNode head) {
        
        // declare a slow and fast pointer
        ListNode slow = head;
        ListNode fast = head;
        
        // while fast has not reached the end of the list
        while(fast != null && fast.next != null) {
            
            // move slow to the next node
            slow = slow.next;
            // move fast to the next of the next node
            fast = fast.next.next;
            
        }
        
        // if fast has not reached the end, move slow to the next node
        if(fast != null)
            slow = slow.next;
        
        // reverse the secone half of the list
        slow = reversed(slow);
        
        // reset the fast equal to the head
        fast = head;
        
        // while the end of the list has not been reached, starting from the middle
        while(slow != null) {
            
            // if any of the values dont match, it is not a palindrome
            if(fast.val != slow.val)
                return false;
            
            // move fast and slow to their next respective nodes
            fast = fast.next;
            slow = slow.next;
            
        }
        
        // return true if all of the values are equal
        return true;
    }
    
    public ListNode reversed(ListNode head) {
        
        // declare a previous node
        ListNode previous = null;
        
        // while the end of the list has not been reached
        while(head != null) {
            
            // hold the next node in a variable
            ListNode next = head.next;
            // set the next node equal to the previous node
            current.next = previous;
            // update the previous node to the head node
            previous = head;
            // move head to the next node
            head = next;
            
        }
        
        // return the previous pointer
        return previous;
        
    }
}
