package interview.exercises;

import interview.model.TreeNode;
import io.vavr.Tuple2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class LC199BinaryTreeRightSideView {

    public List<Integer> rightSideView(TreeNode root) {
        Map<Integer, Integer> perLevelItem = new HashMap<>();
        Queue<Tuple2<Integer, TreeNode>> queue = new LinkedList<>();
        int max_depth = 0;

        if (root != null) {
            queue.add(new Tuple2<>(0, root));
        }

        while (!queue.isEmpty()) {
            Tuple2<Integer, TreeNode> depthAndNode = queue.poll();
            max_depth = Integer.max(max_depth, depthAndNode._1);
            if (depthAndNode._2.left != null) {
                queue.add(new Tuple2<>(depthAndNode._1 + 1, depthAndNode._2.left));
            }
            if (depthAndNode._2.right != null) {
                queue.add(new Tuple2<>(depthAndNode._1 + 1, depthAndNode._2.right));
            }
            perLevelItem.put(depthAndNode._1, depthAndNode._2.val);
        }

        return new ArrayList<>(perLevelItem.values());
    }


}
