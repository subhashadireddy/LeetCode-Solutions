class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode f = head;
        ListNode s = head;
        // Move fast pointer n steps ahead
        for (int i = 0; i < n; i++) {
            f = f.next;
        }
        if (f == null) {
            return head.next;
        }
        while (f.next != null) {
            f = f.next;
            s = s.next;
        }
        s.next = s.next.next;

        return head;
    }
}
