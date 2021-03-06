package interview;

import static org.assertj.core.api.Assertions.assertThat;

import interview.java.exercises.LC3LongestSubstringWithoutRepeatingCharacters;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test(enabled = false)
public class LC3LongestSubstringWithoutRepeatingCharactersTest {
    private LC3LongestSubstringWithoutRepeatingCharacters program;

    @BeforeMethod
    public void setUp() {
        program = new LC3LongestSubstringWithoutRepeatingCharacters();
    }

    @Test(enabled = false)
    public void testName() {
        assertThat(program.lengthOfLongestSubstring("abcabcbb")).isEqualTo(3);
        assertThat(program.lengthOfLongestSubstring("bbbbb")).isEqualTo(1);
        assertThat(program.lengthOfLongestSubstring("bbbbba")).isEqualTo(2);
        assertThat(program.lengthOfLongestSubstring("pwwkew")).isEqualTo(3);
        assertThat(program.lengthOfLongestSubstring("tmmzuxt")).isEqualTo(5);
    }
}