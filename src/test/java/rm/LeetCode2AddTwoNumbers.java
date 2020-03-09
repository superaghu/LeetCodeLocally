package rm;

import static org.assertj.core.api.Assertions.assertThat;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.testng.annotations.Test;

import java.util.List;

public class LeetCode2AddTwoNumbers {

    @Test
    public void testName() {
        final ListNode node = addTwoNumbers(create(List.of(5, 2, 3)), create(List.of(5, 2, 3)));
        assertThat(node.val).isEqualTo(0);
        assertThat(node.next.val).isEqualTo(5);
        assertThat(node.next.next.val).isEqualTo(6);
    }

    @Test
    public void testName2() {
        final ListNode node = addTwoNumbers(create(List.of(5, 2, 3)), create(List.of()));
        assertThat(node.val).isEqualTo(5);
        assertThat(node.next.val).isEqualTo(2);
        assertThat(node.next.next.val).isEqualTo(3);
    }

    @Test
    public void testName3() {
        final ListNode node = addTwoNumbers(create(List.of(9, 9)), create(List.of(1)));
        assertThat(node.val).isEqualTo(0);
        assertThat(node.next.val).isEqualTo(0);
        assertThat(node.next.next.val).isEqualTo(1);
    }

    @RequiredArgsConstructor
    @AllArgsConstructor
    public class ListNode {
        private final int val;
        ListNode next;
    }

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

    private ListNode create(List<Integer> list) {
        ListNode listNode = null;
        for (Integer integer : list) {
            listNode = appendToLast(integer, listNode);
        }
        return listNode;
    }

    private ListNode appendToLast(Integer integer, ListNode listNode) {
        if (listNode == null) {
            listNode = new ListNode(integer);
            return listNode;
        }

        ListNode head = listNode;

        while (listNode.next != null) {
            listNode = listNode.next;
        }

        listNode.next = new ListNode(integer);
        return head;
    }
}
