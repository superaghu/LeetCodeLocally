package interview.java.rmsolutions;

/**
 * @see <a href="https://leetcode.com/problems/two-sum/">Link</a>
 */
public class LC1TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i; j < nums.length; j++) {
                if ((nums[i] + nums[j]) == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}
