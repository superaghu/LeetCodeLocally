package rm;

import static org.assertj.core.api.Assertions.assertThat;

import org.testng.annotations.Test;

import java.util.Arrays;

public class LeetCode961NRepeatedElementinSize2NArray {
    public int repeatedNTimes(int[] A) {
//        Arrays.sort(A);
//        int currentElem = A[0];
//        int count = 0;
//        for (int i : A) {
//            if (currentElem != i) {
//                if (count == 0) {
//                    currentElem = i;
//                }
//                count--;
//            } else {
//                count++;
//            }
//        }
//
//        return currentElem;
        return 0;
    }

    @Test
    public void testName() {
        assertThat(repeatedNTimes(new int[]{1, 2, 2, 3})).isEqualTo(2);
        assertThat(repeatedNTimes(new int[]{2, 1, 2, 5, 3, 2})).isEqualTo(2);
        assertThat(repeatedNTimes(new int[]{5, 1, 5, 2, 5, 3, 5, 4})).isEqualTo(5);
    }
}
