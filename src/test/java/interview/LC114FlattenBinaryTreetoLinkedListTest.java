package interview;

import static org.assertj.core.api.Assertions.assertThat;

import interview.exercises.LC114FlattenBinaryTreetoLinkedList;
import interview.model.TreeNode;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class LC114FlattenBinaryTreetoLinkedListTest {
    private LC114FlattenBinaryTreetoLinkedList program;

    @BeforeMethod
    public void setUp() {
        program = new LC114FlattenBinaryTreetoLinkedList();
    }

    @Test
    public void testGenerate() {
        TreeNode leftTree = new TreeNode(2, new TreeNode(3), new TreeNode(4));
        TreeNode rightTree = new TreeNode(5, null, new TreeNode(6));
        TreeNode toFlatten = new TreeNode(1, leftTree, rightTree);
        program.flatten(toFlatten);
        assertThat(toFlatten).isEqualTo(TreeNode.createBinarySearchTree(List.of(1, 2, 3, 4, 5, 6)));
    }
}