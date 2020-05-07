package interview.rmsolutions;

/**
 * @see <a href="https://leetcode.com/problems/product-of-array-except-self/">Link</a>
 */
public class LC238ProductofArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        left[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            left[i] = nums[i-1] * left[i - 1];
        }

        right[nums.length-1] = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            right[i] = nums[i+1] * right[i + 1];
        }

        int[] resultArray = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            resultArray[i] = left[i] * right[i];
        }
        return resultArray;
    }
}
