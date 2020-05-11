package interview;

import static interview.java.model.ListNode.create;
import static org.assertj.core.api.Assertions.assertThat;

import interview.java.exercises.LC21MergeTwoSortedLists;
import interview.java.model.ListNode;
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
        ListNode node = program.mergeTwoLists(create(List.of(1, 2, 4)), create(List.of(1, 3, 4)));
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
}