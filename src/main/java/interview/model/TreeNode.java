package interview.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int val) {
        this.val = val;
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

    public static void display(TreeNode root) {
        System.out.println("--printing tree--");
        final int height = 5, width = 64;

        int len = width * height * 2 + 2;
        StringBuilder sb = new StringBuilder(len);
        for (int i = 1; i <= len; i++) {
            sb.append(i < len - 2 && i % width == 0 ? "\n" : ' ');
        }

        displayR(sb, width / 2, 1, width / 4, width, root, " ");
        System.out.println(sb);
    }

    private static void displayR(StringBuilder sb, int c, int r, int d, int w, TreeNode n,
                                 String edge) {
        if (n != null) {
            displayR(sb, c - d, r + 2, d / 2, w, n.left, " /");

            String s = String.valueOf(n.val);
            int idx1 = r * w + c - (s.length() + 1) / 2;
            int idx2 = idx1 + s.length();
            int idx3 = idx1 - w;
            if (idx2 < sb.length()) {
                sb.replace(idx1, idx2, s).replace(idx3, idx3 + 2, edge);
            }

            displayR(sb, c + d, r + 2, d / 2, w, n.right, "\\ ");
        }
    }
}
