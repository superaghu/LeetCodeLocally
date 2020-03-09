package rm;

import static org.assertj.core.api.Assertions.assertThat;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class LeetCode13RomantoInteger {
    @Test
    public void testName() {
        assertThat(6).isEqualTo(buildRomanToInt("VI"));
        assertThat(15).isEqualTo(buildRomanToInt("XV"));
        assertThat(9).isEqualTo(buildRomanToInt("IX"));
    }

    private static Map<Character, Integer> map = new HashMap<>();

    static {
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
    }

    private int buildRomanToInt(String roman) {
        final char[] chars = roman.toCharArray();
        int sum = 0;
        for (int i = 0; i < chars.length; i++) {
            char aChar = chars[i];
            if (aChar != 'I') {
                sum += map.get(aChar);
            }else {

            }

        }
        return sum;
    }
}
