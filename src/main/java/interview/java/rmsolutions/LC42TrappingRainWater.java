package interview.java.rmsolutions;

import java.util.Stack;

public class LC42TrappingRainWater {

//    public int trap(int[] height) {
//        int left_max = Integer.MIN_VALUE;
//        int right_max = Integer.MIN_VALUE;
//
//
//        for(int i=0; i< height.length; i++){
//            if(height[i] >= left_max) {
//                left_max = height[i];
//            }else {
//                while()
//            }
//        }
//    }

    //copied
    public int trap(int[] height) {
        int ans = 0, current = 0;
        Stack<Integer> st = new Stack<>();
        while (current < height.length) {
            while (!st.empty() && height[current] > height[st.peek()]) {
                int top = st.peek();
                st.pop();
                if (st.empty()) {
                    break;
                }
                int distance = current - st.peek() - 1;
                int bounded_height = Math.min(height[current], height[st.peek()]) - height[top];
                ans += distance * bounded_height;
            }
            st.push(current++);
        }

        return ans;
    }
}
