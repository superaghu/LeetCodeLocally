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
        if(num <=0) return 0;
        int steps = 0;
        while(num > 0) {
            steps += ((num&1)==1) ? 2 : 1;
            num >>= 1;
        }
        return steps--;
    }

    private int numberOfSteps2(int num) {
        int steps = 0;
        while (num > 0) {
            if (num % 2 == 1) {
                num--;
                steps++;

                if (num == 0) {
                    break;
                }
            }
            num = num / 2;
            steps++;
        }

        return steps;
    }
}
