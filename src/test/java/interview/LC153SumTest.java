package interview;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import interview.java.exercises.LC153Sum;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.vavr.collection.List;

@Test(enabled = false)
public class LC153SumTest {
    private LC153Sum program;

    @BeforeMethod
    public void setUp() {
        program = new LC153Sum();
    }

    @Test(enabled = false)
    public void testGenerate() {
        final List<List<Integer>> expected = List.of(List.of(-1, 0, 1), List.of(-1, -1, 2));
        assertThat(program.threeSum(new int[]{-1, 0, 1, 2, -1, -4})).isEqualTo(expected);
    }
}