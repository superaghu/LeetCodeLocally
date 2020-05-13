package interview.java.rmsolutions;

import java.util.HashMap;
import java.util.Map;

public class LC13RomantoInteger {

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

    public int buildRomanToInt(String roman) {
        final char[] chars = roman.toCharArray();
        int sum = 0;
        for (int i = 0; i < chars.length; i++) {
            char aChar = chars[i];
            if (aChar != 'I') {
                sum += map.get(aChar);
            } else {

            }
        }
        return sum;
    }
}
