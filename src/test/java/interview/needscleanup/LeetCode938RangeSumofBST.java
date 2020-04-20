package interview.needscleanup;

import static interview.needscleanup.TreeNode.createBst;
import static org.assertj.core.api.Assertions.assertThat;
import io.vavr.collection.List;
import org.testng.annotations.Test;

public class LeetCode938RangeSumofBST {

    @Test
    public void testName() {
        final TreeNode treeNode = createBst(List.of(1, 2, 3, 5, 4));
        assertThat(6).isEqualTo(rangeSumBST(treeNode, 1, 3));
        assertThat(15).isEqualTo(rangeSumBST(treeNode, 1, 5));
        assertThat(9).isEqualTo(rangeSumBST(treeNode, 4, 5));
        assertThat(treeNode.getVal()).isEqualTo(1);
    }

    @Test
    public void mergeTrees() {
        assertThat(mergeTrees(createBst(List.of(1, 2, 3, 5, 4)), createBst(List.of(1))).getVal()).isEqualTo(2);
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

        return new TreeNode(t1.getVal() + t2.getVal(), mergeTrees(t1.getLeft(), t2.getLeft()), mergeTrees(t2.getLeft(), t1.getRight()));
    }

    int rangeSumBST(TreeNode root, int L, int R) {
        if (root == null) {
            return 0;
        }
        return root.getVal() >= L && root.getVal() <= R ? root.getVal() + rangeSumBST(root.getLeft(), L, R) + rangeSumBST(root.getRight(), L, R)
                                                        : rangeSumBST(root.getLeft(), L, R) + rangeSumBST(root.getRight(), L, R);
    }
}

