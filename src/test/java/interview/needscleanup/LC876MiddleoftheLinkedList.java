package interview.needscleanup;

import static org.assertj.core.api.Assertions.assertThat;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.testng.annotations.Test;

import java.util.List;

//https://leetcode.com/problems/middle-of-the-linked-list/
@Test(enabled = false)
public class LC876MiddleoftheLinkedList {

    @RequiredArgsConstructor
    @AllArgsConstructor
    public class ListNode {
        private final int val;
        ListNode next;
    }

    @Test(enabled = false)
    public void testName() {
        assertThat(create(List.of(1, 2, 3)).val).isEqualTo(1);
        assertThat(middleNode(create(List.of(1, 2, 3))).val).isEqualTo(2);
        assertThat(middleNode(create(List.of(1, 2, 3, 4))).val).isEqualTo(3);
        assertThat(middleNode(create(List.of(1, 2, 3, 4, 5))).val).isEqualTo(3);
        assertThat(middleNode(create(List.of(1, 2, 3, 4, 5, 6))).val).isEqualTo(4);
    }

    public ListNode middleNode1(ListNode head) {
        ListNode curr = head;
        ListNode next = head;

        while (next.next != null) {
            curr = curr.next;
            if (next.next.next != null) {
                next = next.next.next;
            } else {
                next = next.next;
            }
        }
        return curr;
    }

    public ListNode middleNode(ListNode head) {
        ListNode curr = head;
        ListNode next = head;

        while (next != null && next.next != null) {
            curr = curr.next;
            next = next.next.next;
        }
        return curr;
    }

    private ListNode create(List<Integer> list) {
//        ListNode current = null;
//        ListNode prev = current;
//        ListNode head = current;
//        for (Integer integer : list) {
//            current = new ListNode(integer);
//            if(head == null){
//                head = current;
//            }
//            prev = current;
//            current = current.next;
//            prev.next = current;
//        }
//        return head;

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
