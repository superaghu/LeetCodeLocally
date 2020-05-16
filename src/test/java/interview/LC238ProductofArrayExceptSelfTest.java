package interview;

import static org.assertj.core.api.Assertions.assertThat;

import interview.java.exercises.LC238ProductofArrayExceptSelf;
import org.testng.annotations.Test;

@Test(enabled = false)
public class LC238ProductofArrayExceptSelfTest {

    @Test(enabled = false)
    public void testName() {
        LC238ProductofArrayExceptSelf program = new LC238ProductofArrayExceptSelf();
        assertThat(program.productExceptSelf(new int[]{1, 2, 3, 4})).isEqualTo(new int[]{24, 12, 8, 6});
        assertThat(program.productExceptSelf(new int[]{4, 5, 1, 2})).isEqualTo(new int[]{10, 8, 40, 20});
    }
}