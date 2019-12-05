/* Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists. */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        // declare a newlist to be modified
        ListNode newList = new ListNode(0);
        // delare a copy of the new list to be returned
        ListNode merged = newList;
        
        // if both lists are empty return null
        if(l1 == null && l2 == null) return null;
        
        // if list 1 is empty return list 2
        if(l1 == null) return l2;
        
        // if list 2 is empty return list 1
        if(l2 == null) return l1;
        
        // while the end of both lists have not been reached
        while(l1 != null && l2 != null) {
            
            // if the value of the node in list 1 is less than the value of the node is list 2
            if(l1.val < l2.val) {
                
                // set the next node in the new list to the node containing the smaller value
                newList.next = l1;
                
                // update the new list node to the next position
                newList = newList.next;
                // move to the next node in list 1
                l1 = l1.next;
                
            }
            
            // if the value of the node in list 2 is less than the value of the node in list 1
            else {
                
                // set the next node in the new list to the node containing the smaller value
                newList.next = l2;
                
                // update the new list node to the next position
                newList = newList.next;
                // move to the next node in list 1
                l2 = l2.next;
                
            }
            
        }
        
        // is the end of list 2 is reached
        if(l2 == null) {
            
            // while the end of list 1 is not reached
            while(l1 != null) {
                
                // set the next node in the new list to the current node in list 1
                newList.next = l1;
                
                // update the new list node to the next position
                newList = newList.next;
                // move to the next node in list 1
                l1 = l1.next;
                
            }
            
        }
        
        // if the end of list 1 has been reached
        if(l1 == null) {
            
            // while the end of list 2 has not been reached
            while(l2 != null) {
                
                // set the next node in the new list to the current node in list 2
                newList.next = l2;
                
                // update the new list node to the next position
                newList = newList.next;
                // move to the next node in list 2
                l2 = l2.next;
                
            }
            
        }
        
        // return the list minus the head
        return merged.next;
    }
}
