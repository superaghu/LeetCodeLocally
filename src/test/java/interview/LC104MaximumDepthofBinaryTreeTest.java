package interview;

import static interview.java.model.TreeNode.createBinarySearchTree;
import static org.assertj.core.api.Assertions.assertThat;

import interview.java.exercises.LC104MaximumDepthofBinaryTree;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

@Test(enabled = false)
public class LC104MaximumDepthofBinaryTreeTest {
    private LC104MaximumDepthofBinaryTree program;

    @BeforeMethod
    public void setUp() {
        program = new LC104MaximumDepthofBinaryTree();
    }

    @Test(enabled = false)
    public void mergeTrees() {
        assertThat(program.maxDepth(createBinarySearchTree(List.of(1)))).isEqualTo(1);
        assertThat(program.maxDepth(createBinarySearchTree(List.of(1, 2)))).isEqualTo(2);
        assertThat(program.maxDepth(createBinarySearchTree(List.of(1, 2, 3)))).isEqualTo(3);
        assertThat(program.maxDepth(createBinarySearchTree(List.of(2, 1, 3)))).isEqualTo(2);
        assertThat(program.maxDepth(createBinarySearchTree(List.of(2, 1, 3, 4)))).isEqualTo(3);
    }
}
