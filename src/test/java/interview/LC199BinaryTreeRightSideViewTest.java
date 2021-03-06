package interview;

import static interview.java.model.TreeNode.display;
import static org.assertj.core.api.Assertions.assertThat;

import interview.java.exercises.LC199BinaryTreeRightSideView;
import interview.java.model.TreeNode;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.vavr.collection.List;

@Test(enabled = false)
public class LC199BinaryTreeRightSideViewTest {

    private LC199BinaryTreeRightSideView program;

    @BeforeMethod
    public void setUp() {
        program = new LC199BinaryTreeRightSideView();
    }

    @Test(enabled = false)
    public void testGenerate() {
        TreeNode leftTree = new TreeNode(2, new TreeNode(3), new TreeNode(4));
        TreeNode rightTree = new TreeNode(5, null, new TreeNode(6));
        TreeNode toFlatten = new TreeNode(1, leftTree, rightTree);
        display(toFlatten);
        final java.util.List<Integer> integers = program.rightSideView(toFlatten);
        display(toFlatten);
        assertThat(integers).isEqualTo(List.of(1, 5, 6));
    }
}