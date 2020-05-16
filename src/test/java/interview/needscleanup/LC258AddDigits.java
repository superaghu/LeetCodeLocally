package interview.needscleanup;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.testng.annotations.Test;

//https://leetcode.com/problems/add-digits/
@Test(enabled = false)
public class LC258AddDigits {

    @Test(enabled = false)
    public void testName() {
        assertThat(addDigits(38)).isEqualTo(2);
        assertThat(addDigits(238)).isEqualTo(4);
        assertThat(addDigits(2038)).isEqualTo(4);
    }

    @Test(enabled = false)
    public void testName2() {
        assertThat(addDigitsWithoutLoop(38)).isEqualTo(2);
        assertThat(addDigitsWithoutLoop(238)).isEqualTo(4);
        assertThat(addDigitsWithoutLoop(2038)).isEqualTo(4);
    }

    private int addDigitsWithoutLoop(int num) {
        //0, 1, 10, 11, 100, 101, 110, 111, 1000, 1001, 1010

        //10 -> 1010 ^ 1111 => 1111
        //10 -> 1010 XOR 1111 => 0101

        if (num == 0) {
            return 0;
        }
        if (num % 9 == 0) {
            return 9;
        } else {
            return num % 9;
        }
    }

    public int addDigits(int num) {
        return sumDigits(num);
    }

    private int sumDigits(int num) {
        int result = 0;
        while (num > 9) {
            int unitDigit = num % 10;
            result += unitDigit;
            num = num / 10;
        }
        return result + num > 9 ? sumDigits(result + num) : result + num;
    }
}
