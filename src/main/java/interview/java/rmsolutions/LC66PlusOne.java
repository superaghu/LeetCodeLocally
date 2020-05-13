package interview.java.rmsolutions;

public class LC66PlusOne {
    public int[] plusOne(int[] digits) {
        long value = 0;
        for (int i = digits.length - 1, j = 0; i >= 0; i--, j++) {
            value += digits[i] * Math.pow(10, j);
        }

        value++;

        final int length = String.valueOf(value).length();
        int[] ret = new int[length];

        for (int i = 0, j = length - 1; i < length; i++, j--) {
            final int digit = (int) (value / Math.pow(10, j));
            ret[i] = digit;
            value = value - (long) (digit * Math.pow(10, j));
        }
        return ret;
    }
}
