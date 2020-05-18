package interview;

import static org.assertj.core.api.Assertions.assertThat;

import interview.java.LC91DecodeWays;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

@Ignore
@Test
public class LC91DecodeWaysTest {
    private LC91DecodeWays program;

    @BeforeMethod
    public void setUp() {
        program = new LC91DecodeWays();
    }

    public void testGenerate() {
        assertThat(program.numDecodings("12")).isEqualTo(2);
        assertThat(program.numDecodings("226")).isEqualTo(3);
        assertThat(program.numDecodings("0")).isEqualTo(0);
        assertThat(program.numDecodings("1")).isEqualTo(1);
        assertThat(program.numDecodings("10")).isEqualTo(1);
        assertThat(program.numDecodings("01")).isEqualTo(0);
        assertThat(program.numDecodings("100")).isEqualTo(0);
        assertThat(program.numDecodings("110")).isEqualTo(1);
    }
}