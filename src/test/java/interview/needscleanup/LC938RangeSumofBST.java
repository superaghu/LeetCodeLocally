package interview.needscleanup;

import static interview.model.TreeNode.createBinarySearchTree;
import static org.assertj.core.api.Assertions.assertThat;

import interview.model.TreeNode;
import org.testng.annotations.Test;

import java.util.List;

public class LC938RangeSumofBST {

    @Test
    public void testName() {
        final TreeNode treeNode = createBinarySearchTree(List.of(1, 2, 3, 5, 4));
        assertThat(6).isEqualTo(rangeSumBST(treeNode, 1, 3));
        assertThat(15).isEqualTo(rangeSumBST(treeNode, 1, 5));
        assertThat(9).isEqualTo(rangeSumBST(treeNode, 4, 5));
        assertThat(treeNode.val).isEqualTo(1);
    }

    @Test
    public void mergeTrees() {
        assertThat(mergeTrees(createBinarySearchTree(List.of(1, 2, 3, 5, 4)), createBinarySearchTree(List.of(1))).val).isEqualTo(2);
    }

    private TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            return null;
        }
        if (t1 == null) {
            return t2;
        }
        if (t2 == null) {
            return t1;
        }

        return new TreeNode(t1.val + t2.val, mergeTrees(t1.left, t2.left), mergeTrees(t2.left, t1.right));
    }

    int rangeSumBST(TreeNode root, int L, int R) {
        if (root == null) {
            return 0;
        }
        return root.val >= L && root.val <= R ? root.val + rangeSumBST(root.left, L, R) + rangeSumBST(root.right, L, R)
                                              : rangeSumBST(root.left, L, R) + rangeSumBST(root.right, L, R);
    }
}

