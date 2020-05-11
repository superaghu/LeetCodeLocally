package interview.java.rmsolutions;

/**
 * @see <a href="https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/">Link</a>
 */
public class LC167TwoSumIIInputarrayissorted {
    public int[] twoSum(int[] numbers, int target) {
        for (int i = 0, j = 1; j < numbers.length && i < numbers.length - 1; ) {
            if (numbers[i] + numbers[j] > target || j < numbers.length - 1) {
                for (int k = i + 1; k < j; k++) {
                    if (numbers[i] + numbers[j] == target) {
                        return new int[]{i + 1, j + 1};
                    }
                    i++;
                }
            }
            if (numbers[i] + numbers[j] == target) {
                return new int[]{i + 1, j + 1};
            }

            if (j < numbers.length - 1) {
                j++;
            }
        }
        return null;
    }
}
