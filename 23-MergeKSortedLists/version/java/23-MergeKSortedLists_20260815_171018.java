// Last updated: 15/8/2026, 5:10:18 pm
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode res = new ListNode(0);
        ListNode curr = res;
        boolean flag = true;

        while (flag) {
            flag = false;
            int smallestIndex = -1; // Reset per iteration

            for (int i = 0; i < lists.length; i++) {
                // Check if current list is valid, then pick or compare
                if (lists[i] != null && (smallestIndex == -1 || lists[i].val < lists[smallestIndex].val)) {
                    smallestIndex = i;
                    flag = true;
                }
            }

            if (flag) {
                curr.next = lists[smallestIndex];
                curr = curr.next;
                lists[smallestIndex] = lists[smallestIndex].next;
            }
        }

        return res.next;
    }
}