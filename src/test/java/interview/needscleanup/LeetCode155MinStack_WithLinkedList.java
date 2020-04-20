package interview.needscleanup;

import static org.assertj.core.api.Assertions.assertThat;

import org.testng.annotations.Test;

public class LeetCode155MinStack_WithLinkedList {

    @Test
    public void testName() {
        final MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);

        assertThat(minStack.getMin()).isEqualTo(-3);
        minStack.pop();
        assertThat(minStack.top()).isEqualTo(0);
        assertThat(minStack.getMin()).isEqualTo(-2);
    }

    class MinStack {

        class Node {
            private final int value;
            private final int min;
            private Node next;

            Node(int value, int min) {
                this.value = value;
                this.min = min;
            }

            Node(int value, int min, Node next) {
                this.value = value;
                this.min = min;
                this.next = next;
            }
        }

        Node head;

        public void push(int x) {
            if (head == null) {
                head = new Node(x, x);
            } else {
                head = new Node(x, Math.min(x, head.min), head);
            }
        }

        public void pop() {
            head = head.next;
        }

        public int top() {
            return head.value;
        }

        public int getMin() {
            return head.min;
        }
    }
}
