package interview;

import interview.exercises.LC283MoveZeroes;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC283MoveZeroesTest {

    @Test
    public void testName() {
        LC283MoveZeroes program = new LC283MoveZeroes();
        int[] nums = {0, 1, 0, 3, 12};
        program.moveZeroes(nums);
        assertThat(nums).isEqualTo(new int[]{1,3,12,0,0});
    }
}