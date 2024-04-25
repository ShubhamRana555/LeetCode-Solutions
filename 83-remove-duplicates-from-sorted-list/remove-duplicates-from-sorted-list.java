/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;
        while(curr!=null && curr.next!=null){
            if(curr.val == curr.next.val){
                // don't increment from current pointer until duplicates are found
                curr.next = curr.next.next;
            }
            else{
                // increment pointer as curr and curr.next are unique
                curr = curr.next;
            }
        }
        return head;
    }
}