package interview.needscleanup;

import static interview.needscleanup.TreeNode.createBst;
import static org.assertj.core.api.Assertions.assertThat;

import io.vavr.collection.List;
import org.testng.annotations.Test;

public class LC104MaximumDepthofBinaryTree {

    @Test
    public void mergeTrees() {
        assertThat(maxDepth(createBst(List.of(1)))).isEqualTo(1);
        assertThat(maxDepth(createBst(List.of(1, 2)))).isEqualTo(2);
        assertThat(maxDepth(createBst(List.of(1, 2, 3)))).isEqualTo(3);
        assertThat(maxDepth(createBst(List.of(2, 1, 3)))).isEqualTo(2);
        assertThat(maxDepth(createBst(List.of(2, 1, 3, 4)))).isEqualTo(3);
    }

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(maxDepth(root.getLeft()), maxDepth(root.getRight()));
    }
}
