package interview;

import static org.assertj.core.api.Assertions.assertThat;

import interview.java.exercises.LC2AddTwoNumbers;
import interview.java.model.ListNode;
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
        final ListNode node = program.addTwoNumbers(ListNode.create(List.of(5, 2, 3)), ListNode.create(List.of(5, 2, 3)));
        assertThat(node.getVal()).isEqualTo(0);
        assertThat(node.getNext().getVal()).isEqualTo(5);
        assertThat(node.getNext().getNext().getVal()).isEqualTo(6);
    }

    @Test
    public void testName2() {
        final ListNode node = program.addTwoNumbers(ListNode.create(List.of(5, 2, 3)), ListNode.create(List.of()));
        assertThat(node.getVal()).isEqualTo(5);
        assertThat(node.getNext().getVal()).isEqualTo(2);
        assertThat(node.getNext().getNext().getVal()).isEqualTo(3);
    }

    @Test
    public void testName3() {
        final ListNode node = program.addTwoNumbers(ListNode.create(List.of(9, 9)), ListNode.create(List.of(1)));
        assertThat(node.getVal()).isEqualTo(0);
        assertThat(node.getNext().getVal()).isEqualTo(0);
        assertThat(node.getNext().getNext().getVal()).isEqualTo(1);
    }
}