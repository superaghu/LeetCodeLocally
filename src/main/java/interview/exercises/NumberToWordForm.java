package interview.exercises;

import java.util.HashMap;
import java.util.Map;

public class NumberToWordForm {
    public String format(int number) {
        Map<Integer, String> map = new HashMap<>();
        map.put(0, "Zero");
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");
        map.put(5, "Five");
        map.put(6, "Six");
        map.put(7, "Seven");
        map.put(8, "Eight");
        map.put(9, "Nine");
        map.put(10, "Ten");
        map.put(11, "Eleven");
        map.put(12, "Twelve");
        map.put(13, "Thirteen");
        map.put(14, "Fourteen");
        map.put(15, "Fifteen");
        map.put(16, "Sixteen");
        map.put(17, "Seventeen");
        map.put(18, "Eighteen");
        map.put(19, "Nineteen");
        map.put(20, "Twenty");
        map.put(30, "Thirty");
        map.put(40, "Forty");
        map.put(50, "Fifty");
        map.put(60, "Sixty");
        map.put(70, "Seventy");
        map.put(80, "Eighty");
        map.put(90, "Ninety");
        map.put(100, "Hundred");
        map.put(1000, "Thousand");
        map.put(1000000, "Million");
        map.put(1000000000, "Billion");
//        format(1892)
        // 1 ->One Thousand
////                8 -> Eight Hunderd
////                9 -> Nighthy  -> Nine Ten
////                2 -> Two      -> Two

        int length = String.valueOf(number).length();
        StringBuilder sb = new StringBuilder();
        for (int i = length - 1; i >= 0; i--) {
            final int base = (int) Math.pow(10, i);
            int digit = number / base;

            if (base == 10) {
                sb.append(map.get(number * 10 / base));
            } else {
                sb.append(map.get(digit));
            }
            if (base > 10) {
                sb.append(map.get(base));
            }
            number = number % base;
        }
        return sb.toString();
    }
}
