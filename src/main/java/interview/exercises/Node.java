package interview.exercises;

import io.vavr.Tuple2;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class Node {
    public int val;
    public Node next;
    public Node random;

    public static Node create(List<Tuple2<Integer, Integer>> list) {
        Node listNode = null;
        for (Tuple2<Integer, Integer> integer : list) {
            listNode = appendToLast(integer, listNode);
        }
        return listNode;
    }

    private static Node appendToLast(Tuple2<Integer, Integer> integer, Node listNode) {
        if (listNode == null) {
            listNode = new Node(integer._1, null, null);
            return listNode;
        }

        Node head = listNode;
        Node head2 = listNode;

        while (listNode.next != null) {
            listNode = listNode.next;
        }

        for (int i = 0; i < integer._2; i++) {
            head2 = head2.next;
        }

        listNode.next = new Node(integer._1, null, head2);
        return head;
    }

    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Node)) {
            return false;
        }
        final Node other = (Node) o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (this.val != other.val) {
            return false;
        }
        final Node this$next = this.next;
        final Node other$next = other.next;
        if (this$next == null ? other$next != null : this$next.val != other$next.val) {
            return false;
        }
        final Node this$random = this.random;
        final Node other$random = other.random;
        return this$random == null ? other$random == null : this$random.val == other$random.val;
    }

    private boolean canEqual(final Object other) {
        return other instanceof Node;
    }
}
