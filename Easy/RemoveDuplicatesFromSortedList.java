/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        
        // if the list is empty, return null
        if(head == null) return null;
        
        // create a copy of head to traverse the list
        ListNode current = head;
        
        // while the current node and the next node exists
        while(current != null & current.next != null) {
            
            // if the current value equals the next value (duplicate)
            if(current.val == current.next.val)
                // move the next node to its next node
                current.next = current.next.next;

            // otherwise, move the current node to the next position
            else
                current = current.next;
            
        }
        
        // return the modified version of the original list
        return head;
        
    }
}
