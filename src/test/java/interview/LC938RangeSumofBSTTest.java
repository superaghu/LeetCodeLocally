package interview;

import static interview.java.model.TreeNode.createBinarySearchTree;
import static org.assertj.core.api.Assertions.assertThat;

import interview.java.exercises.LC938RangeSumofBST;
import interview.java.model.TreeNode;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class LC938RangeSumofBSTTest {
    private LC938RangeSumofBST program;

    @BeforeMethod
    public void setUp() {
        program = new LC938RangeSumofBST();
    }

    @Test
    public void testName() {
        final TreeNode treeNode = createBinarySearchTree(List.of(1, 2, 3, 5, 4));
        assertThat(program.rangeSumBST(treeNode, 1, 3)).isEqualTo(6);
        assertThat(program.rangeSumBST(treeNode, 1, 5)).isEqualTo(15);
        assertThat(program.rangeSumBST(treeNode, 4, 5)).isEqualTo(9);
        assertThat(treeNode.val).isEqualTo(1);
    }
}

