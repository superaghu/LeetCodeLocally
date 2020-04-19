package interview;

import static org.assertj.core.api.Assertions.assertThat;

import interview.exercises.LeetCode13RomantoInteger;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LeetCode13RomantoIntegerTest {
    private LeetCode13RomantoInteger program;

    @BeforeMethod
    public void setUp() {
        program = new LeetCode13RomantoInteger();
    }

    @Test
    public void testName() {
        assertThat(6).isEqualTo(program.buildRomanToInt("VI"));
        assertThat(15).isEqualTo(program.buildRomanToInt("XV"));
        assertThat(9).isEqualTo(program.buildRomanToInt("IX"));
    }
}