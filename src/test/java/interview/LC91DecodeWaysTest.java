package interview;

import static org.assertj.core.api.Assertions.assertThat;

import interview.java.LC91DecodeWays;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test(enabled = false)
public class LC91DecodeWaysTest {
    private LC91DecodeWays program;

    @BeforeMethod
    public void setUp() {
        program = new LC91DecodeWays();
    }

    public void testGenerate() {
        assertThat(program.numDecodings("12")).isEqualTo(2);
        assertThat(program.numDecodings("226")).isEqualTo(3);
    }
}