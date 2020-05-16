package interview;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import interview.java.exercises.LC161OneEditDistance;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test(enabled = false)
public class LC161OneEditDistanceTest {
    private LC161OneEditDistance program;

    @BeforeMethod
    public void setUp() {
        program = new LC161OneEditDistance();
    }

    @Test(enabled = false)
    public void testGenerate() {
        assertThat(program.isOneEditDistance("ab", "acb")).isEqualTo(true);
    }

    @Test(enabled = false)
    public void testGenerate2() {
        assertThat(program.isOneEditDistance("cab", "ad")).isEqualTo(false);
    }

    @Test(enabled = false)
    public void testGenerate3() {
        assertThat(program.isOneEditDistance("1203", "1213")).isEqualTo(true);
    }

    @Test(enabled = false)
    public void testGenerate4() {
        assertThat(program.isOneEditDistance("a", "")).isEqualTo(true);
    }

    @Test(enabled = false)
    public void testGenerate5() {
        assertThat(program.isOneEditDistance("cab", "ab")).isEqualTo(true);
    }
}