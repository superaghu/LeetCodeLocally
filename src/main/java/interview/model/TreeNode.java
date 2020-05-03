package interview.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }

    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof TreeNode)) {
            return false;
        }
        final TreeNode other = (TreeNode) o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (this.val != other.val) {
            return false;
        }
        final TreeNode this$left = this.left;
        final TreeNode other$left = other.left;
        if (this$left == null ? other$left != null : this$left.val != other$left.val) {
            return false;
        }
        final TreeNode this$right = this.right;
        final TreeNode other$right = other.right;
        if (this$right == null ? other$right != null : this$right.val != other$right.val) {
            return false;
        }
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof TreeNode;
    }

    public static TreeNode createBinarySearchTree(List<Integer> list) {
        TreeNode head = null;

        if (list.isEmpty()) {
            return head;
        }

        for (Integer nodeValue : list) {
            if (head == null) {
                head = new TreeNode(nodeValue);
            } else {
                insertIntoBinarySearchTree(head, nodeValue);
            }
        }

        return head;
    }

    private static void insertIntoBinarySearchTree(TreeNode root, Integer nodeValue) {
        if (root == null) {
            return;
        }

        if (nodeValue < root.val) {
            if (root.left == null) {
                root.left = new TreeNode(nodeValue);
            } else {
                insertIntoBinarySearchTree(root.left, nodeValue);
            }
        } else {
            if (root.right == null) {
                root.right = new TreeNode(nodeValue);
            } else {
                insertIntoBinarySearchTree(root.right, nodeValue);
            }
        }
    }
}
