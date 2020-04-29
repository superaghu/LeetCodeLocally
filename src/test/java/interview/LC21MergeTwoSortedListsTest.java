package interview;

import static org.assertj.core.api.Assertions.assertThat;

import interview.rmsolutions.LC21MergeTwoSortedLists;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class LC21MergeTwoSortedListsTest {
    private LC21MergeTwoSortedLists program;

    @BeforeMethod
    public void setUp() {
        program = new LC21MergeTwoSortedLists();
    }

    @Test
    public void testName() {
        LC21MergeTwoSortedLists.ListNode node = program.mergeTwoLists(create(List.of(1, 2, 4)), create(List.of(1, 3, 4)));
        assertThat(node.getVal()).isEqualTo(1);
        node = node.getNext();
        assertThat(node.getVal()).isEqualTo(1);
        node = node.getNext();
        assertThat(node.getVal()).isEqualTo(2);
        node = node.getNext();
        assertThat(node.getVal()).isEqualTo(3);
        node = node.getNext();
        assertThat(node.getVal()).isEqualTo(4);
        node = node.getNext();
        assertThat(node.getVal()).isEqualTo(4);
    }

    private LC21MergeTwoSortedLists.ListNode create(List<Integer> list) {
        LC21MergeTwoSortedLists.ListNode listNode = null;
        for (Integer integer : list) {
            listNode = appendToLast(integer, listNode);
        }
        return listNode;
    }

    private LC21MergeTwoSortedLists.ListNode appendToLast(Integer integer, LC21MergeTwoSortedLists.ListNode listNode) {
        if (listNode == null) {
            listNode = new LC21MergeTwoSortedLists.ListNode(integer);
            return listNode;
        }

        LC21MergeTwoSortedLists.ListNode head = listNode;

        while (listNode.getNext() != null) {
            listNode = listNode.getNext();
        }

        listNode.setNext(new LC21MergeTwoSortedLists.ListNode(integer));
        return head;
    }
}