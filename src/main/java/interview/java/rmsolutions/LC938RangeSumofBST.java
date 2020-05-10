package interview.java.rmsolutions;

import interview.java.model.TreeNode;

public class LC938RangeSumofBST {

    public int rangeSumBST(TreeNode root, int L, int R) {
        if (root == null) {
            return 0;
        }
        return root.val >= L && root.val <= R ? root.val + rangeSumBST(root.left, L, R) + rangeSumBST(root.right, L, R)
                                              : rangeSumBST(root.left, L, R) + rangeSumBST(root.right, L, R);
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
}
