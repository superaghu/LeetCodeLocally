package interview;

import static org.assertj.core.api.Assertions.assertThat;

import interview.exercises.Gcd;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GcdTest {
    private Gcd program;

    @BeforeMethod
    public void setUp() {
        program = new Gcd();
    }

    @Test
    public void testName() {
//        assertThat(program.generalizedGCD(5, new int[]{2, 3, 4, 5, 6})).isEqualTo(1);
        assertThat(program.generalizedGCD(5, new int[]{2, 4, 6, 8, 10})).isEqualTo(2);
        assertThat(program.generalizedGCD(5, new int[]{6, 9})).isEqualTo(3);
        assertThat(program.generalizedGCD(5, new int[]{1, Integer.MAX_VALUE})).isEqualTo(1);
    }
}