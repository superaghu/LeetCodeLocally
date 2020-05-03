package interview.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;

@RequiredArgsConstructor
@AllArgsConstructor
@Getter
public class ListNode {
    public final int val;
    @Setter
    public ListNode next;


    public static ListNode create(List<Integer> list) {
        ListNode listNode = null;
        for (Integer integer : list) {
            listNode = appendToLast(integer, listNode);
        }
        return listNode;
    }

    private static ListNode appendToLast(Integer integer, ListNode listNode) {
        if (listNode == null) {
            listNode = new ListNode(integer);
            return listNode;
        }

        ListNode head = listNode;

        while (listNode.getNext() != null) {
            listNode = listNode.getNext();
        }

        listNode.setNext(new ListNode(integer));
        return head;
    }
}