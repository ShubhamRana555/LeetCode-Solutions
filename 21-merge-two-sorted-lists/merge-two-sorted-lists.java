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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // if(list1 == null){
        //     return list2;
        // }
        // if(list2 == null){
        //     return list1;
        // }
        // // the head of merged list
        // ListNode head;

        // if(list1.val <= list2.val){
        //     head = list1;
        //     list1 = list1.next;
        // }
        // else{
        //     head = list2;
        //     list2 = list2.next;
        // }
        
        // // initalise node of traversing through merged array
        // ListNode temp = head;

        // while(list1 != null && list2 != null){
        //     if(list1.val <= list2.val){
        //         temp.next = list1;
        //         list1 = list1.next;
        //     }
        //     else{
        //         temp.next = list2;
        //         list2 = list2.next;
        //     }
        //     temp = temp.next;
        // }

        // while(list1 != null){
        //     temp.next = list1;
        //     list1 = list1.next;
        // }
        // while(list2 != null){
        //     temp.next = list2;
        //     list2 = list2.next;
        // }

        // // return head of merged list
        // return head;
        
        
        
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }

        ListNode head; // The head of the merged list

        if (list1.val <= list2.val) {
            head = list1;
            list1 = list1.next;
        } else {
            head = list2;
            list2 = list2.next;
        }

        ListNode current = head; // Current node in the merged list

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next; // Move current to the next node in the merged list
        }

        // If any of the lists is not exhausted, append the remaining nodes
        if (list1 != null) {
            current.next = list1;
        }
        if (list2 != null) {
            current.next = list2;
        }

        return head; // Return the merged list head
    }
}
