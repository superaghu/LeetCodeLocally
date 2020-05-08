package interview;

import static org.assertj.core.api.Assertions.assertThat;

import interview.exercises.LC283MoveZeroes;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LC283MoveZeroesTest {
    LC283MoveZeroes program;

    @BeforeMethod
    public void setUp() {
        program = new LC283MoveZeroes();
    }

    @Test
    public void testName() {
        int[] nums = {0, 1, 0, 3, 12};
        program.moveZeroes(nums);
        assertThat(nums).isEqualTo(new int[]{1, 3, 12, 0, 0});
    }

    @Test
    public void testName2() {
        int[] nums = {0, 0, 0, 0, 0};
        program.moveZeroes(nums);
        assertThat(nums).isEqualTo(new int[]{0, 0, 0, 0, 0});
    }

    @Test
    public void testName3() {
        int[] nums = {0, 0, 0, 0, 1};
        program.moveZeroes(nums);
        assertThat(nums).isEqualTo(new int[]{1, 0, 0, 0, 0});
    }

    @Test
    public void testName4() {
        int[] nums = {1, 0, 0, 0, 0};
        program.moveZeroes(nums);
        assertThat(nums).isEqualTo(new int[]{1, 0, 0, 0, 0});
    }
}