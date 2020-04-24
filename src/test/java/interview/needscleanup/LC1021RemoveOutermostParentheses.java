package interview.needscleanup;

import static org.assertj.core.api.Assertions.assertThat;

import org.testng.annotations.Test;

public class LC1021RemoveOutermostParentheses {
    @Test
    public void testName() {
        assertThat(removeOuterParentheses("(()())(())")).isEqualTo("()()()");
        assertThat(removeOuterParentheses("(()())(())(()(()))")).isEqualTo("()()()()(())");
    }

    public String removeOuterParentheses(String S) {
        final char[] chars = S.toCharArray();
        int depth = 0;
        StringBuilder sb = new StringBuilder();
        for (char aChar : chars) {

            if (aChar == '(') {
                if (depth != 0) {
                    sb.append(aChar);
                }
                depth++;
            } else {
                depth--;
                if (depth != 0) {
                    sb.append(aChar);
                }
            }
        }

        return sb.toString();
    }
}
