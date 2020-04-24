package interview.rmsolutions;

//https://leetcode.com/problems/reverse-string-ii/
public class LC541ReverseStringII {

    public String reverseStr(String s, int k) {
        final char[] chars = s.toCharArray();
        boolean reverse = true;
        final int length = s.length();
        char[] result = new char[length];
        for (int i = 0; i < chars.length; i = i + k) {

            int index = 0;
            int index_plus_k = i + k > length ? length - (length / k) * k : k;
            for (int j = 0; j < k && i + j < length; j++) {
                if (reverse) {
                    //reverse here
                    result[i + index] = chars[i + index_plus_k - 1];
                    index++;
                    index_plus_k--;
                } else {
                    result[i + index] = chars[i + index];
                    index++;
                }
            }

            reverse = !reverse;
        }
        return new String(result);
    }
}
