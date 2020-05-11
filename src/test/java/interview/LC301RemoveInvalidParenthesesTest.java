package interview;

import static org.assertj.core.api.Assertions.assertThat;

import interview.java.exercises.LC301RemoveInvalidParentheses;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LC301RemoveInvalidParenthesesTest {
    private LC301RemoveInvalidParentheses program;

    @BeforeMethod
    public void setUp() {
        program = new LC301RemoveInvalidParentheses();
    }

    @Test
    public void testName() {
        assertThat(program.removeInvalidParentheses("()())()")).containsExactly("()()()", "(())()");
        assertThat(program.removeInvalidParentheses("(a)())()")).containsExactly("(a)()()", "(a())()");
        assertThat(program.removeInvalidParentheses(")(")).containsExactly("");
    }
}