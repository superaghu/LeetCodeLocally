package interview;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import interview.java.exercises.LC541ReverseStringII;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test(enabled = false)
public class LC541ReverseStringIITest {

    private LC541ReverseStringII program;

    @BeforeMethod
    public void setUp() {
        program = new LC541ReverseStringII();
    }

    @Test(enabled = false)
    public void testGenerate() {
        assertThat(program.reverseStr("abcdefg", 2)).isEqualTo("bacdfeg");
        assertThat(program.reverseStr("ab", 3)).isEqualTo("ba");
        assertThat(program.reverseStr("abcdefghijk", 2)).isEqualTo("bacdfeghjik");
        assertThat(program.reverseStr("abcdefghijk", 3)).isEqualTo("cbadefihgjk");
        assertThat(program.reverseStr("abcdefgh", 3)).isEqualTo("cbadefhg");
    }
}