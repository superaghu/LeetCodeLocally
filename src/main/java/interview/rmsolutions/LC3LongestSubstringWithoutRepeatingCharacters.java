package interview.rmsolutions;

import java.util.HashMap;
import java.util.Map;

/**
 * @see <a href="https://leetcode.com/problems/longest-substring-without-repeating-characters/">Link</a>
 * Must-repeat
 */
public class LC3LongestSubstringWithoutRepeatingCharacters {
    //copied
    public int lengthOfLongestSubstring(String s) {
        int longestDiff = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0, j = 0; j < s.length(); j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            longestDiff = Math.max(j - i + 1, longestDiff);
            map.put(s.charAt(j), j + 1);
        }
        return longestDiff;
    }
}
