package interview;

import static org.assertj.core.api.Assertions.assertThat;

import lombok.RequiredArgsConstructor;
import org.testng.annotations.Test;

import java.util.Stack;

public class LeetCode155MinStack_WithStack {

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

        @RequiredArgsConstructor
        class Data {
            private final int val;
            private final int min;
        }

        int min = Integer.MAX_VALUE;
        Stack<Data> stack = new Stack<>();
        public MinStack() {

        }

        public void push(int x) {
            final int newMin = x < this.min ? x : this.min;
            stack.push(new Data(x, newMin));
            min = newMin;
        }

        public void pop() {
            final Data pop = stack.pop();
            min = stack.peek().min;
        }

        public int top() {
            return stack.peek().val;
        }

        public int getMin() {
            return min;
        }
    }
}
