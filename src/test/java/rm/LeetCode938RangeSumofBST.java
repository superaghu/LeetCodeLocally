package rm;

import static org.assertj.core.api.Assertions.assertThat;

import io.vavr.collection.List;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.testng.annotations.Test;

public class LeetCode938RangeSumofBST {

    @Test
    public void testName() {
        final TreeNode treeNode = create(List.of(1, 2, 3, 5, 4));
        assertThat(6).isEqualTo(rangeSumBST(treeNode, 1, 3));
        assertThat(15).isEqualTo(rangeSumBST(treeNode, 1, 5));
        assertThat(9).isEqualTo(rangeSumBST(treeNode, 4, 5));
        assertThat(treeNode.val).isEqualTo(1);
    }

    @Test
    public void mergeTrees() {
        assertThat(mergeTrees(create(List.of(1, 2, 3, 5, 4)), create(List.of(1))).val).isEqualTo(2);
    }

    private TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1 == null && t2 == null) return null;
        if(t1 == null) return t2;
        if(t2 == null) return t1;

        return new TreeNode(t1.val + t2.val, mergeTrees(t1.left, t2.left), mergeTrees(t2.right, t1.right));
    }

    int rangeSumBST(TreeNode root, int L, int R) {
        if (root == null) {
            return 0;
        }
        return root.val >= L && root.val <= R ? root.val + rangeSumBST(root.left, L, R) + rangeSumBST(root.right, L, R)
                                            : rangeSumBST(root.left, L, R) + rangeSumBST(root.right, L, R);
    }

    private TreeNode create(List<Integer> list) {
        int head = list.head();
        TreeNode root = new TreeNode(head);
        list.tail().forEach(x -> insert(root, x));
        return root;
    }

    private void insert(TreeNode root, Integer x) {
        if (root == null) {
            return;
        }
        if (x < root.val) {
            if (root.left == null) {
                root.left = new TreeNode(x);
            } else {
                insert(root.left, x);
            }
        } else {
            if (root.right == null) {
                root.right = new TreeNode(x);
            } else {
                insert(root.right, x);
            }
        }
    }

    @RequiredArgsConstructor
    @AllArgsConstructor
    class TreeNode {
        private final int val;
        private TreeNode left;
        private TreeNode right;

//        public TreeNode(int val, TreeNode left, TreeNode right) {
//            this.val = val;
//            this.left = left;
//            this.right = right;
//        }
    }
}

