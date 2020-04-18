package rm;

import static org.assertj.core.api.Assertions.assertThat;

import org.testng.annotations.Test;

//https://leetcode.com/problems/number-of-lines-to-write-string/
public class LeetCode806NumberofLinesToWriteString {

    @Test
    public void testName() {
        int[] widths = new int[]{10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        String S = "abcdefghijklmnopqrstuvwxyz";
        int[] result = numberOfLines(widths, S);
        int[] expected = new int[]{3, 60};
        assertThat(result).contains(expected);
    }

    @Test
    public void testName2() {
        int[] widths = new int[]{4, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        String S = "bbbcccdddaaa";
        int[] result = numberOfLines(widths, S);
        int[] expected = new int[]{2, 4};
        assertThat(result).contains(expected);
    }

    @Test
    public void testName3() {
        int[] widths = new int[]{7, 5, 4, 7, 10, 7, 9, 4, 8, 9, 6, 5, 4, 2, 3, 10, 9, 9, 3, 7, 5, 2, 9, 4, 8, 9};
        String S = "zlrovckbgjqofmdzqetflraziyvkvcxzahzuuveypqxmjbwrjvmpdxjuhqyktuwjvmbeswxuznumazgxvitdrzxmqzhaaudztgie";
        int[] result = numberOfLines(widths, S);
        int[] expected = new int[]{7, 69};
        assertThat(result).contains(expected);
    }

    public int[] numberOfLines(int[] widths, String S) {
        final char[] chars = S.toCharArray();
        int lineCount = 0;
        int currentLineLength = 0;
        for (char c : chars) {
            final int width = widths[c - 97];

            if (currentLineLength + width < 100) {
                currentLineLength += width;
            } else if (currentLineLength + width == 100) {
                currentLineLength = 0;
                lineCount++;
            } else {
                currentLineLength = width;
                lineCount++;
            }
        }
        return new int[]{lineCount + (currentLineLength == 0 ? 0 : 1), currentLineLength};

    }

    public int[] numberOfLines_bestSolution(int[] widths, String S) {
        int res = 1, cur = 0;
        for (char c : S.toCharArray()) {
            int width = widths[c - 'a'];
            res = cur + width > 100 ? res + 1 : res;
            cur = cur + width > 100 ? width : cur + width;
        }
        return new int[]{res, cur};
    }

    public int[] numberOfLines_mySolution(int[] widths, String S) {
        final int lastCharLength = widths[S.charAt(S.length() - 1) - 97];

        int totalCount = S.chars().map(x -> x - 97).map(x -> widths[x]).sum();
        int lastLineLength = totalCount % 100;
        if (lastLineLength < lastCharLength) {
            lastLineLength = lastCharLength;
        }

        int numLines = (totalCount / 100) + (lastLineLength == 0 ? 0 : 1);
        return new int[]{numLines, lastLineLength};
    }
}
