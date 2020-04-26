package interview.exercises;

import java.util.HashMap;
import java.util.Map;

public class NumberToWordForm {
    private static Map<Integer, String> MAP = new HashMap<>();

    static {
        MAP.put(0, "Zero");
        MAP.put(1, "One");
        MAP.put(2, "Two");
        MAP.put(3, "Three");
        MAP.put(4, "Four");
        MAP.put(5, "Five");
        MAP.put(6, "Six");
        MAP.put(7, "Seven");
        MAP.put(8, "Eight");
        MAP.put(9, "Nine");
        MAP.put(10, "Ten");
        MAP.put(11, "Eleven");
        MAP.put(12, "Twelve");
        MAP.put(13, "Thirteen");
        MAP.put(14, "Fourteen");
        MAP.put(15, "Fifteen");
        MAP.put(16, "Sixteen");
        MAP.put(17, "Seventeen");
        MAP.put(18, "Eighteen");
        MAP.put(19, "Nineteen");
        MAP.put(20, "Twenty");
        MAP.put(30, "Thirty");
        MAP.put(40, "Forty");
        MAP.put(50, "Fifty");
        MAP.put(60, "Sixty");
        MAP.put(70, "Seventy");
        MAP.put(80, "Eighty");
        MAP.put(90, "Ninety");
        MAP.put(100, "Hundred");
        MAP.put(1000, "Thousand");
        MAP.put(1000000, "Million");
        MAP.put(1000000000, "Billion");
    }

    public String wordForm_ArrayStyle(int number) {
        if (number == 0) {
            return "Zero";
        }
        int length = String.valueOf(number).length();
        int[] digitArray = new int[length]; // 9,0,8,1

        for (int i = length - 1, j = 0; i >= 0; i--, j++) {
            final int base = (int) Math.pow(10, i);
            int quotient = number / base;
            digitArray[j] = quotient;
            number = number % base;
        }
        StringBuilder sb = new StringBuilder();

        for (int i = 0, j = length - 1; i < length; i++, j--) {
            final int base = (int) Math.pow(10, j);
            int digit = digitArray[i];
            if (digit != 0) {
                sb.append(MAP.get(digitArray[i]) + " " + MAP.get(base));
            }
        }

        return sb.toString();
    }
    //              format(1892)
    //              1 -> One Thousand
////                8 -> Eight Hundred
////                9 -> Ninety
////                2 -> Two

    public String wordForm(int number) {
        if (number == 0) {
            return "Zero";
        }
        int length = String.valueOf(number).length();
        StringBuilder sb = new StringBuilder();
        for (int i = length - 1; i >= 0; i--) {
            int currLength = String.valueOf(number).length();
            final int base = (int) Math.pow(10, i);
            int quotient = number / base;

            if (currLength == 2) {
//                if (number > 10 && number < 20) {
//                    sb.append(MAP.get(number));
//                } else {
                    quotient *= 10;
//                }
            }

            if (quotient != 0) {
                sb.append(MAP.get(quotient));
            }

            if (currLength > 2) {
                sb.append(MAP.get(base));
            }

            number = number % base;
        }
        return sb.toString();
    }

//    if (base == 10) {
//        sb.append(MAP.get(number * 10 / base));
//    } else {
//        sb.append(MAP.get(quotient));
//    }
//
//            if (base > 10) {
//        sb.append(MAP.get(base));
//    }
//            if ((number >= 10 && number <= 20) || number == 30 || number == 90) {
//        i--;
//    }
}
