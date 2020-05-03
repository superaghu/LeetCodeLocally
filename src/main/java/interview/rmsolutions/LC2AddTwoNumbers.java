package interview.rmsolutions;

import interview.model.ListNode;

public class LC2AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode prev = new ListNode(0);
        ListNode head = prev;

        int carry = 0;
        while ((l1 != null) || (l2 != null) || (carry > 0)) {
            int total = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + carry;
            int val = total % 10;
            carry = total / 10;

            ListNode curr = new ListNode(val);

            prev.next = curr;
            prev = curr;

            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }

        return head.next;
    }

    public ListNode addTwoNumbers_orig(ListNode l1, ListNode l2) {
        ListNode current = null;
        ListNode head = null;
        ListNode prev = null;
        int carry = 0;
        while (l1 != null && l2 != null) {
            final int val = carry + l1.val + l2.val;
            current = new ListNode(val % 10);
            carry = val / 10;
            l1 = l1.next;
            l2 = l2.next;

            if (head == null) {
                head = current;
            }
            if (prev != null) {
                prev.next = current;
            }
            prev = current;
        }

        return head;
    }
}
