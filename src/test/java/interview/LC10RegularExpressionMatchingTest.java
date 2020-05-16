package interview;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import interview.java.exercises.LC10RegularExpressionMatching;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test(enabled = false)
public class LC10RegularExpressionMatchingTest {
    private LC10RegularExpressionMatching program;

    @BeforeMethod
    public void setUp() {
        program = new LC10RegularExpressionMatching();
    }

    @Test(enabled = false)
    public void testName() {
        assertThat(program.isMatch("aa", "a")).isEqualTo(false);
        assertThat(program.isMatch("aa", "a*")).isEqualTo(true);
        assertThat(program.isMatch("ab", ".*")).isEqualTo(true);
        assertThat(program.isMatch("aab", "c*a*b")).isEqualTo(true);
        assertThat(program.isMatch("mississippi", "mis*is*p*.")).isEqualTo(false);
    }
}