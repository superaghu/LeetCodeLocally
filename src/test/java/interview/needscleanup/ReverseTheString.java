package interview.needscleanup;

import static org.assertj.core.api.Assertions.assertThat;

import org.testng.annotations.Test;

import java.util.stream.Stream;

public class ReverseTheString {
    @Test
    public void testName() {
        assertThat(reverse("input")).isEqualTo("tupni");
        assertThat(reverse("")).isEqualTo("");
    }

    @Test
    public void testName2() {
        assertThat(reverse2("input")).isEqualTo("tupni");
        assertThat(reverse2("")).isEqualTo("");
        assertThat(reverse2("Madam, I'm Adam")).isEqualTo("madA m'I ,madaM");
    }

    private String reverse2(String input) {
        final char[] chars = input.toCharArray();
        int end = input.length() - 1;

        for (int i = 0; i < end / 2; i++) {
            char c = chars[end - i];
            chars[end - i] = chars[i];
            chars[i] = c;
        }
        return new String(chars);
    }

    private String reverse(String input) {
        final char[] chars = input.toCharArray();
        char[] output = new char[input.length()];

        int j = 0;
        for (int i = chars.length - 1; i >= 0; i--) {
            output[j++] = chars[i];
        }

        return Stream.of(output).collect(StringBuilder::new, StringBuilder::append, StringBuilder::append).toString();
    }
}
