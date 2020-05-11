package interview.java.pvsolutions;

import java.util.ArrayList;
import java.util.List;

/**
 * @see <a href="https://leetcode.com/problems/product-of-array-except-self/">Link</a>
 */
public class LC238ProductofArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        List<Integer> resultList = new ArrayList<Integer>();
        for(int i=0; i < nums.length; i++) {
            int x =1;
            for (int j=0; j< nums.length; j++) {
                if (i != j) {
                    x = nums[j] *x;
                }
            }
            resultList.add(x);
        }
        return resultList.stream().mapToInt(x ->x).toArray();
    }
}
