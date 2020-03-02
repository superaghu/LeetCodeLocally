package rm;

import static org.assertj.core.api.Assertions.assertThat;

import org.testng.annotations.Test;

//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
public class LeetCode1342_NumberofStepstoReduceANumberToZero {
    @Test
    public void testName() {
        assertThat(numberOfSteps(8)).isEqualTo(4);
        assertThat(numberOfSteps(14)).isEqualTo(6);
        assertThat(numberOfSteps(123)).isEqualTo(12);
    }

    private int numberOfSteps(int num) {
        return 0;
    }
}
