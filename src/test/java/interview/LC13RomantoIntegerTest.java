package interview;

import static org.assertj.core.api.Assertions.assertThat;

import interview.scala.exercises.LC13RomantoInteger;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LC13RomantoIntegerTest {
    private LC13RomantoInteger program;

    @BeforeMethod
    public void setUp() {
        program = new LC13RomantoInteger();
    }

    @Test
    public void testName() {
        assertThat(6).isEqualTo(program.buildRomanToInt("VI"));
        assertThat(15).isEqualTo(program.buildRomanToInt("XV"));
        assertThat(9).isEqualTo(program.buildRomanToInt("IX"));
    }
}