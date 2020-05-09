package interview.rmsolutions;

/**
 * @see <a href="https://leetcode.com/problems/one-edit-distance/">Link</a>
 */
public class LC161OneEditDistance {
    public boolean isOneEditDistance(String s, String t) {
        for (int i = 0; i < Math.min(s.length(), t.length()); i++) {
            if (s.charAt(i) != t.charAt(i)) {
                if (s.length() == t.length()) // s has the same length as t, so the only possibility is replacing one char in s and t
                {
                    return s.substring(i + 1).equals(t.substring(i + 1));
                } else if (s.length() < t.length()) // t is longer than s, so the only possibility is deleting one char from t
                {
                    return s.substring(i).equals(t.substring(i + 1));
                } else // s is longer than t, so the only possibility is deleting one char from s
                {
                    return t.substring(i).equals(s.substring(i + 1));
                }
            }
        }
        //All previous chars are the same, the only possibility is deleting the end char in the longer one of s and t
        return Math.abs(s.length() - t.length()) == 1;
    }

    public boolean isOneEditDistance_mine(String s, String t) {
        if (s == null || t == null) {
            return false;
        }

        if (Math.abs(s.length() - t.length()) > 1) {
            return false;
        }

        if (s.equals(t)) {
            return false;
        }

        if (s.length() == 0) {
            return t.length() == 1;
        }

        if (t.length() == 0) {
            return s.length() == 1;
        }

        int diffCount = 0;
        int leftIndex = 0;
        for (int i = 0; i < Math.min(s.length(), t.length()); i++) {
            if (s.charAt(i) != t.charAt(i)) {
                diffCount++;
                leftIndex = i;
                break;
            }
        }

        int tRightIndex = t.length() - 1;
        int sRightIndex = s.length() - 1;
        for (int i = sRightIndex, j = tRightIndex; sRightIndex >= leftIndex && tRightIndex >= leftIndex; tRightIndex--, tRightIndex--) {
            if (s.charAt(sRightIndex) != t.charAt(tRightIndex)) {
                diffCount++;
                sRightIndex = i;
                tRightIndex = j;
                break;
            }
        }

        if (diffCount == 1) {
            return true;
        }

        final int ada = Math.min(sRightIndex, tRightIndex) - leftIndex - 1;
        if (diffCount + ada == 1) {
            return true;
        }

        return false;
    }
}
