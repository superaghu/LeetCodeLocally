package interview;

import static org.assertj.core.api.Assertions.assertThat;

import interview.java.exercises.LC1TwoSum;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LC1TwoSumTest {
    private LC1TwoSum program;

    @BeforeMethod
    public void setUp() {
        program = new LC1TwoSum();
    }

    @Test
    public void testName() {
        assertThat(program.twoSum(new int[]{2, 7, 11, 15}, 9)).isEqualTo(new int[]{0, 9});
    }
}
