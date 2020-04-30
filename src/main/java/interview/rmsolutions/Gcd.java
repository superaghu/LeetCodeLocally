package interview.rmsolutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * See question at below image
 * <p>
 * <img width="1147" height="417" src="../../../resources/images/gcd.jpeg" alt="">
 * <dl>
 */
public class Gcd {
    public int generalizedGCD(int num, int[] arr) {
        int minNumber = Integer.MAX_VALUE;
        for (int value : arr) {
            if (value < minNumber) {
                minNumber = value;
            }
        }

        final List<Integer> factors = findFactors(minNumber);

        int gcd = 1;
        for (Integer i : factors) {
            boolean flag = true;
            for (Integer item : arr) {
                if (item % i != 0) {
                    flag = false;
                }
            }
            if (flag) {
                gcd = i;
            }
        }

        return gcd;
    }

    public List<Integer> findFactors(int num) {
        ArrayList<Integer> factors = new ArrayList<Integer>();

        // Skip two if the number is odd
        int incrementer = num % 2 == 0 ? 1 : 2;

        for (int i = 1; i <= Math.sqrt(num); i += incrementer) {

            // If there is no remainder, then the number is a factor.
            if (num % i == 0) {
                factors.add(i);

                // Skip duplicates
                if (i != num / i) {
                    factors.add(num / i);
                }
            }
        }

        // Sort the list of factors
        Collections.sort(factors);

        return factors;
    }
}
