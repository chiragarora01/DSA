// Last updated: 15/8/2026, 5:48:14 pm
// Must do again
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;

        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;

            even.next = odd.next;
            even = even.next;
        }

        // Link the end of the odd list to the head of the even list
        odd.next = evenHead;

        return head;
    }
}