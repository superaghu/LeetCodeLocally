package interview.java.rmsolutions;

import interview.java.model.TreeNode;

public class LC114FlattenBinaryTreetoLinkedList {
    public void flatten(TreeNode root) {
        flattenToTail(root);
    }

    private TreeNode flattenToTail(TreeNode root) {
        if (root == null) {
            return null;
        }
        if (root.left == null && root.right == null) {
            return root;
        }

        TreeNode leftTail = flattenToTail(root.left);
        TreeNode rightTail = flattenToTail(root.right);

        if (leftTail != null) {
            leftTail.right = root.right;
            root.right = root.left;
            root.left = null;
        }

        return rightTail == null ? leftTail : rightTail;
    }
}
