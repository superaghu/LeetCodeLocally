package interview;

import static org.assertj.core.api.Assertions.assertThat;

import interview.java.exercises.LC806NumberofLinesToWriteString;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LC806NumberofLinesToWriteStringTest {
    private LC806NumberofLinesToWriteString program;

    @BeforeMethod
    public void setUp() {
        program = new LC806NumberofLinesToWriteString();
    }

    @Test
    public void testName() {
        int[] widths = new int[]{10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        String S = "abcdefghijklmnopqrstuvwxyz";
        int[] result = program.numberOfLines(widths, S);
        int[] expected = new int[]{3, 60};
        assertThat(result).contains(expected);
    }

    @Test
    public void testName2() {
        int[] widths = new int[]{4, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        String S = "bbbcccdddaaa";
        int[] result = program.numberOfLines(widths, S);
        int[] expected = new int[]{2, 4};
        assertThat(result).contains(expected);
    }

    @Test
    public void testName3() {
        int[] widths = new int[]{7, 5, 4, 7, 10, 7, 9, 4, 8, 9, 6, 5, 4, 2, 3, 10, 9, 9, 3, 7, 5, 2, 9, 4, 8, 9};
        String S = "zlrovckbgjqofmdzqetflraziyvkvcxzahzuuveypqxmjbwrjvmpdxjuhqyktuwjvmbeswxuznumazgxvitdrzxmqzhaaudztgie";
        int[] result = program.numberOfLines(widths, S);
        int[] expected = new int[]{7, 69};
        assertThat(result).contains(expected);
    }
}