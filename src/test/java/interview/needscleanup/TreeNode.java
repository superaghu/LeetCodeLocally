package interview.needscleanup;

import io.vavr.collection.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@AllArgsConstructor
@Data
class TreeNode {
    private final int val;
    private TreeNode left;
    private TreeNode right;

    public static TreeNode createBst(List<Integer> list) {
        int head = list.head();
        TreeNode root = new TreeNode(head);
        list.tail().forEach(x -> insert(root, x));
        return root;
    }

    public static void insert(TreeNode root, Integer x) {
        if (root == null) {
            return;
        }
        if (x < root.getVal()) {
            if (root.getLeft() == null) {
                root.setLeft(new TreeNode(x));
            } else {
                insert(root.getLeft(), x);
            }
        } else {
            if (root.getRight() == null) {
                root.setRight(new TreeNode(x));
            } else {
                insert(root.getRight(), x);
            }
        }
    }
}
