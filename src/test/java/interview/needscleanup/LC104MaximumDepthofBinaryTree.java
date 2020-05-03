package interview.needscleanup;

import static interview.model.TreeNode.createBinarySearchTree;
import static org.assertj.core.api.Assertions.assertThat;

import interview.model.TreeNode;
import org.testng.annotations.Test;

import java.util.List;

public class LC104MaximumDepthofBinaryTree {

    @Test
    public void mergeTrees() {
        assertThat(maxDepth(createBinarySearchTree(List.of(1)))).isEqualTo(1);
        assertThat(maxDepth(createBinarySearchTree(List.of(1, 2)))).isEqualTo(2);
        assertThat(maxDepth(createBinarySearchTree(List.of(1, 2, 3)))).isEqualTo(3);
        assertThat(maxDepth(createBinarySearchTree(List.of(2, 1, 3)))).isEqualTo(2);
        assertThat(maxDepth(createBinarySearchTree(List.of(2, 1, 3, 4)))).isEqualTo(3);
    }

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
