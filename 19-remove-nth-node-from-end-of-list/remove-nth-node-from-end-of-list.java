class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return null;

        // Calculate the size of the list
        int size = 0;
        ListNode temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }

        // If n is out of range, return head
        if (n > size) return head;

        // Special case: remove the head node
        if (size == n) return head.next;

        // Find the index of the node to remove
        int idx = size - n;

        // Traverse the list to the node before the one to remove
        temp = head;
        for (int i = 0; i < idx - 1; i++) {
            temp = temp.next;
        }

        // Remove the nth node from the end
        temp.next = temp.next.next;

        return head;
    }
}
