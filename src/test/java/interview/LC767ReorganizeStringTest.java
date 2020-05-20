package interview;

import static org.assertj.core.api.Assertions.assertThat;

import interview.java.exercises.LC767ReorganizeString;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

@Ignore
@Test
public class LC767ReorganizeStringTest {
    private LC767ReorganizeString program;

    @BeforeMethod
    public void setUp() {
        program = new LC767ReorganizeString();
    }

    public void testName() {
        assertThat(program.reorganizeString("aab")).isEqualTo("aba");
        assertThat(program.reorganizeString("aaab")).isEqualTo("");
    }
}