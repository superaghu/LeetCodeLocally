package interview;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import interview.exercises.LeetCode541ReverseStringII;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LeetCode541ReverseStringIITest {

    private LeetCode541ReverseStringII program;

    @BeforeMethod
    public void setUp() {
        program = new LeetCode541ReverseStringII();
    }

    @Test
    public void testGenerate() {
        assertThat(program.reverseStr("abcdefg", 2)).isEqualTo("bacdfeg");
        assertThat(program.reverseStr("ab", 3)).isEqualTo("ba");
        assertThat(program.reverseStr("abcdefghijk", 2)).isEqualTo("bacdfeghjik");
        assertThat(program.reverseStr("abcdefghijk", 3)).isEqualTo("cbadefihgjk");
        assertThat(program.reverseStr("abcdefgh", 3)).isEqualTo("cbadefhg");
    }
}