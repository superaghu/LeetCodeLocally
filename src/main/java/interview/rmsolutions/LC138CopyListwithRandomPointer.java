package interview.rmsolutions;

import interview.model.Node;

import java.util.HashMap;
import java.util.Map;

/**
 * @see <a href="https://leetcode.com/problems/copy-list-with-random-pointer/">See LC</a>
 */
public class LC138CopyListwithRandomPointer {
    public Node copyRandomList(Node head) {
        Map<Node, Node> visited = new HashMap<>();
        Node headPointer = head;
        Node copyHead = new Node(0, null, null);
        Node copyHeadPointer = copyHead;
        while (head != null) {
            final Node copy = new Node(head.val, null, null);
            copyHead.next = copy;
            visited.put(head, copy);
            copyHead = copyHead.next;
            head = head.next;
        }
        while (headPointer != null) {
            Node randomToBeAdded = visited.get(headPointer);
            if (headPointer.random != null) {
                randomToBeAdded.random = visited.get(headPointer.random);
            }
            headPointer = headPointer.next;
        }
        return copyHeadPointer.next;
    }
}
