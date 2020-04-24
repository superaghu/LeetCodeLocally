package interview;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import interview.exercises.LC66PlusOne;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LC66PlusOneTest {
    private LC66PlusOne program;

    @BeforeMethod
    public void setUp() {
        program = new LC66PlusOne();
    }

    @Test
    public void testGenerate() {
        assertThat(program.plusOne(new int[]{1, 2, 3})).isEqualTo(new int[]{1, 2, 4});
        assertThat(program.plusOne(new int[]{9, 9, 9})).isEqualTo(new int[]{1, 0, 0, 0});
        assertThat(program.plusOne(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0})).isEqualTo(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 1});
        assertThat(program.plusOne(new int[]{6, 1, 4, 5, 3, 9, 0, 1, 9, 5, 1, 8, 6, 7, 0, 5, 5, 4, 3}))
                .isEqualTo(new int[]{6, 1, 4, 5, 3, 9, 0, 1, 9, 5, 1, 8, 6, 7, 0, 5, 5, 4, 4});
    }
}