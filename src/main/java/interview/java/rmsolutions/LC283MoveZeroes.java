package interview.java.rmsolutions;

/**
 * @see <a href="https://leetcode.com/problems/move-zeroes/">Link </a>
 */
public class LC283MoveZeroes {
    //copied
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }

        int insertPos = 0;
        for (int num : nums) {
            if (num != 0) {
                nums[insertPos++] = num;
            }
        }

        while (insertPos < nums.length) {
            nums[insertPos++] = 0;
        }
    }

    public void moveZeroes_personal(int[] nums) {
        int lastNonZero = nums.length - 1;
        while (nums[lastNonZero] == 0 && lastNonZero > 0) {
            lastNonZero--;
        }

        if (lastNonZero == 0) {
            return;
        }

        for (int i = 0, j = lastNonZero; i < nums.length - 1 && i < j; i++) {
            if (nums[i] == 0) {
                int nextNonZero = i + 1;
                while (nums[nextNonZero] == 0 && nextNonZero < j) {
                    nextNonZero++;
                }
                swap(nums, i, nextNonZero);
            }
        }
    }

    private void swap(int[] nums, int i, int nextNonZero) {
        int temp = nums[i];
        nums[i] = nums[nextNonZero];
        nums[nextNonZero] = temp;
    }
}
