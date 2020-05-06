package interview.rmsolutions;

import interview.model.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/**
 * @see <a href="https://leetcode.com/problems/binary-tree-right-side-view/">Link</a>
 */
public class LC199BinaryTreeRightSideView {
    class DepthAndNode {
        int depth;
        TreeNode node;

        public DepthAndNode(int depth, TreeNode node) {
            this.depth = depth;
            this.node = node;
        }
    }

    public List<Integer> rightSideView(TreeNode root) {
        Map<Integer, Integer> perLevelItem = new HashMap<>();
        Queue<DepthAndNode> queue = new LinkedList<>();
        int max_depth = 0;

        if (root != null) {
            queue.add(new DepthAndNode(0, root));
        }

        while (!queue.isEmpty()) {
            DepthAndNode depthAndNode = queue.poll();
            max_depth = Integer.max(max_depth, depthAndNode.depth);
            if (depthAndNode.node.left != null) {
                queue.add(new DepthAndNode(depthAndNode.depth + 1, depthAndNode.node.left));
            }
            if (depthAndNode.node.right != null) {
                queue.add(new DepthAndNode(depthAndNode.depth + 1, depthAndNode.node.right));
            }
            perLevelItem.put(depthAndNode.depth, depthAndNode.node.val);
        }

        return new ArrayList<>(perLevelItem.values());
    }
}
