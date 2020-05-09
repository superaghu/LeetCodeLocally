package interview;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import interview.exercises.LC161OneEditDistance;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LC161OneEditDistanceTest {
    private LC161OneEditDistance program;

    @BeforeMethod
    public void setUp() {
        program = new LC161OneEditDistance();
    }

    @Test
    public void testGenerate() {
        assertThat(program.isOneEditDistance("ab", "abc")).isEqualTo(true);
    }

    @Test
    public void testGenerate2() {
        assertThat(program.isOneEditDistance("cab", "ad")).isEqualTo(false);
    }

    @Test
    public void testGenerate3() {
        assertThat(program.isOneEditDistance("1203", "1213")).isEqualTo(true);
    }
}