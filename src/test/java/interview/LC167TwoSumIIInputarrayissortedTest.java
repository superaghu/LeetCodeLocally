package interview;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import interview.scala.rmsolutions.LC167TwoSumIIInputarrayissorted;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LC167TwoSumIIInputarrayissortedTest {
    private LC167TwoSumIIInputarrayissorted program;

    @BeforeMethod
    public void setUp() {
        program = new LC167TwoSumIIInputarrayissorted();
    }

    @Test
    public void testGenerate() {
        assertThat(program.twoSum(new int[]{2, 7, 11, 15}, 9)).isEqualTo(new int[]{1, 2});
        assertThat(program.twoSum(new int[]{2, 7, 11, 15}, 13)).isEqualTo(new int[]{1, 3});
        assertThat(program.twoSum(new int[]{2, 7, 11, 15}, 22)).isEqualTo(new int[]{2, 4});
        assertThat(program.twoSum(new int[]{5, 25, 75}, 100)).isEqualTo(new int[]{2, 3});
    }
}