package interview.java.rmsolutions;

/**
 * @see <a href="https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/">Link</a>
 */
public class LC167TwoSumIIInputarrayissorted {
    public int[] twoSum(int[] numbers, int target) {
        int low = 0;
        int high = numbers.length - 1;

        while (low < high) {
            if (numbers[low] + numbers[high] == target) {
                return new int[]{low + 1, high + 1};
            }
            if(numbers[low] + numbers[high] > target){
                high--;
            }else {
                low++;
            }
        }
        return null;
    }
}
