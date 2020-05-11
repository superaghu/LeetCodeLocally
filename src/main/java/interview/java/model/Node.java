package interview.java.model;

import io.vavr.Tuple2;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class Node {
    public int val;
    public Node next;
    public Node random;

    public static Node create(List<Tuple2<Integer, Integer>> valueAndRandomNodeIndexPairs) {
        Node head = null;
        for (Tuple2<Integer, Integer> valueAndRandomNodeIndexPair : valueAndRandomNodeIndexPairs) {
            head = appendToLast(head, valueAndRandomNodeIndexPair);
        }
        addRandomNode(head, valueAndRandomNodeIndexPairs);
        return head;
    }

    private static void addRandomNode(Node head, List<Tuple2<Integer, Integer>> valueAndRandomNodeIndexPairs) {
        Node tempHead = head;
        for (Tuple2<Integer, Integer> tuple2 : valueAndRandomNodeIndexPairs) {
            if (tuple2._2 != null) {
                Node randomNod = tempHead;
                for (int i = 0; i < tuple2._2; i++) {
                    randomNod = randomNod.next;
                }
                head.random = randomNod;
            }
            head = head.next;
        }
    }

    private static Node appendToLast(Node givenHead, Tuple2<Integer, Integer> valueAndRandomNodeIndexPair) {
        if (givenHead == null) {
            givenHead = new Node(valueAndRandomNodeIndexPair._1, null, null);
            return givenHead;
        }

        Node head = givenHead;
        while (head.next != null) {
            head = head.next;
        }
        head.next = new Node(valueAndRandomNodeIndexPair._1, null, null);
        return givenHead;
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
