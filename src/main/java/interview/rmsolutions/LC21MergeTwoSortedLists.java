package interview.rmsolutions;

import interview.model.ListNode;

//https://leetcode.com/problems/merge-two-sorted-lists/
public class LC21MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode resultHead;
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }

        if (l1.val <= l2.val) {
            resultHead = new ListNode(l1.val);
            l1 = l1.next;
        } else {
            resultHead = new ListNode(l2.val);
            l2 = l2.next;
        }

        resultHead.next = mergeTwoLists(l1, l2);
        return resultHead;
    }

    public ListNode mergeTwoLists_iterative(ListNode l1, ListNode l2) {
        ListNode resultHead = new ListNode(0);
        ListNode dummyResHead = resultHead;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                dummyResHead.next = new ListNode(l1.val);
                l1 = l1.next;
            } else {
                dummyResHead.next = new ListNode(l2.val);
                l2 = l2.next;
            }
            dummyResHead = dummyResHead.next;
        }

        if (l1 != null) {
            dummyResHead.next = l1;
        } else {
            dummyResHead.next = l2;
        }

        return resultHead.next;
    }
}
