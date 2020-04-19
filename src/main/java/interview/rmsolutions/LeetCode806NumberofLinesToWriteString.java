package interview.rmsolutions;

//https://leetcode.com/problems/number-of-lines-to-write-string/
public class LeetCode806NumberofLinesToWriteString {

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

    public int[] numberOfLines_mySolution_failed(int[] widths, String S) {
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
