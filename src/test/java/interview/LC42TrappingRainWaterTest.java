package interview;

import static org.assertj.core.api.Assertions.assertThat;

import interview.exercises.LC42TrappingRainWater;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LC42TrappingRainWaterTest {
    private LC42TrappingRainWater program;

    @BeforeMethod
    public void setUp() {
        program = new LC42TrappingRainWater();
    }

    @Test
    public void testName() {
        assertThat(1).isEqualTo(program.trap(new int[]{1, 0, 1}));
        assertThat(2).isEqualTo(program.trap(new int[]{1, 0, 0, 1}));
        assertThat(2).isEqualTo(program.trap(new int[]{2, 0, 2}));
        assertThat(1).isEqualTo(program.trap(new int[]{2, 1, 2}));
        assertThat(4).isEqualTo(program.trap(new int[]{2, 1, 0, 1, 2}));
        assertThat(6).isEqualTo(program.trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
    }
}


