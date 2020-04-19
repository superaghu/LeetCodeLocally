package interview;

import static org.assertj.core.api.Assertions.assertThat;

import interview.rmsolutions.LeetCode2AddTwoNumbers;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class LeetCode2AddTwoNumbersTest {
    private LeetCode2AddTwoNumbers program;

    @BeforeMethod
    public void setUp() {
        program = new LeetCode2AddTwoNumbers();
    }

    @Test
    public void testName() {
        final LeetCode2AddTwoNumbers.ListNode node = program.addTwoNumbers(create(List.of(5, 2, 3)), create(List.of(5, 2, 3)));
        assertThat(node.getVal()).isEqualTo(0);
        assertThat(node.getNext().getVal()).isEqualTo(5);
        assertThat(node.getNext().getNext().getVal()).isEqualTo(6);
    }

    @Test
    public void testName2() {
        final LeetCode2AddTwoNumbers.ListNode node = program.addTwoNumbers(create(List.of(5, 2, 3)), create(List.of()));
        assertThat(node.getVal()).isEqualTo(5);
        assertThat(node.getNext().getVal()).isEqualTo(2);
        assertThat(node.getNext().getNext().getVal()).isEqualTo(3);
    }

    @Test
    public void testName3() {
        final LeetCode2AddTwoNumbers.ListNode node = program.addTwoNumbers(create(List.of(9, 9)), create(List.of(1)));
        assertThat(node.getVal()).isEqualTo(0);
        assertThat(node.getNext().getVal()).isEqualTo(0);
        assertThat(node.getNext().getNext().getVal()).isEqualTo(1);
    }

    public LeetCode2AddTwoNumbers.ListNode create(List<Integer> list) {
        LeetCode2AddTwoNumbers.ListNode listNode = null;
        for (Integer integer : list) {
            listNode = appendToLast(integer, listNode);
        }
        return listNode;
    }

    private LeetCode2AddTwoNumbers.ListNode appendToLast(Integer integer, LeetCode2AddTwoNumbers.ListNode listNode) {
        if (listNode == null) {
            listNode = new LeetCode2AddTwoNumbers.ListNode(integer);
            return listNode;
        }

        LeetCode2AddTwoNumbers.ListNode head = listNode;

        while (listNode.getNext() != null) {
            listNode = listNode.getNext();
        }

        listNode.setNext(new LeetCode2AddTwoNumbers.ListNode(integer));
        return head;
    }
}