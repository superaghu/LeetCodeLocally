package interview.exercises;

import java.util.HashMap;
import java.util.Map;

/**
 * @see <a href="https://leetcode.com/problems/longest-substring-without-repeating-characters/">Link</a>
 */
public class LC3LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int j = 0;
        int longestDiff = 0;
        int currentLongest = 0;
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), 1);
            } else {
                for (int k = j; k < i; k++) {
                    j++;
                    if (s.charAt(j) == s.charAt(i)) {
                        map.computeIfPresent(s.charAt(i), (x, y) -> y == 1 ? y : y + 1);
                        break;
                    }
                }
            }
            currentLongest = i - j + 1;
            if (currentLongest > longestDiff) {
                longestDiff = currentLongest;
            }
        }
        return longestDiff;
    }
}
