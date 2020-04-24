package interview;

import static org.assertj.core.api.Assertions.assertThat;

import interview.exercises.LC2AddTwoNumbers;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class LC2AddTwoNumbersTest {
    private LC2AddTwoNumbers program;

    @BeforeMethod
    public void setUp() {
        program = new LC2AddTwoNumbers();
    }

    @Test
    public void testName() {
        final LC2AddTwoNumbers.ListNode node = program.addTwoNumbers(create(List.of(5, 2, 3)), create(List.of(5, 2, 3)));
        assertThat(node.getVal()).isEqualTo(0);
        assertThat(node.getNext().getVal()).isEqualTo(5);
        assertThat(node.getNext().getNext().getVal()).isEqualTo(6);
    }

    @Test
    public void testName2() {
        final LC2AddTwoNumbers.ListNode node = program.addTwoNumbers(create(List.of(5, 2, 3)), create(List.of()));
        assertThat(node.getVal()).isEqualTo(5);
        assertThat(node.getNext().getVal()).isEqualTo(2);
        assertThat(node.getNext().getNext().getVal()).isEqualTo(3);
    }

    @Test
    public void testName3() {
        final LC2AddTwoNumbers.ListNode node = program.addTwoNumbers(create(List.of(9, 9)), create(List.of(1)));
        assertThat(node.getVal()).isEqualTo(0);
        assertThat(node.getNext().getVal()).isEqualTo(0);
        assertThat(node.getNext().getNext().getVal()).isEqualTo(1);
    }

    public LC2AddTwoNumbers.ListNode create(List<Integer> list) {
        LC2AddTwoNumbers.ListNode listNode = null;
        for (Integer integer : list) {
            listNode = appendToLast(integer, listNode);
        }
        return listNode;
    }

    private LC2AddTwoNumbers.ListNode appendToLast(Integer integer, LC2AddTwoNumbers.ListNode listNode) {
        if (listNode == null) {
            listNode = new LC2AddTwoNumbers.ListNode(integer);
            return listNode;
        }

        LC2AddTwoNumbers.ListNode head = listNode;

        while (listNode.getNext() != null) {
            listNode = listNode.getNext();
        }

        listNode.setNext(new LC2AddTwoNumbers.ListNode(integer));
        return head;
    }
}