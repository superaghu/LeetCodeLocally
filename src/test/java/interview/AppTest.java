package interview;

import static org.assertj.core.api.Assertions.assertThat;

import org.testng.annotations.Test;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void testNameFix() {
        final String exerciseName = "118. Pascal's Triangle\n\n";
        String className = "LeetCode" + (exerciseName + "\n").replaceAll("[\\s\\.-]", "");
        System.out.println(className);
    }

    @Test
    public void random1() {
        List<Integer> list = List.of(1, 2, 3);
        final Integer reduceSum = list.stream().reduce(0, Integer::sum, Integer::sum);
        final Integer reduceProduct = list.stream().reduce(1, (a, b) -> a * b, (a, b) -> a * b);
        assertThat(reduceProduct - reduceSum).isEqualTo(0);
    }

    @Test
    public void shouldAssertLowerCase() {
        assertThat("a&bcd").isEqualTo(toLower("A&bcD"));
    }

    @Test
    public void testCountNumberOfDigits() {
        //given
        //when
        //then
        assertThat(findNumbersByStringify(Utility.listToIntArray(List.of(555, 901, 482, 1771)))).isEqualTo(1);
        assertThat(findNumbers(Utility.listToIntArray(List.of(555, 901, 482, 1771)))).isEqualTo(1);

        assertThat(findNumbersByStringify(Utility.listToIntArray(List.of(12, 345, 2, 6, 7896)))).isEqualTo(2);
        assertThat(findNumbers(Utility.listToIntArray(List.of(12, 345, 2, 6, 7896)))).isEqualTo(2);
    }

    private int findNumbers(int[] nums) {
        final List<Integer> integers = Utility.intArrayToList(nums);

        return integers.stream().map(this::countDigits).mapToInt(x -> x % 2 == 0 ? 1 : 0).sum();
    }

    private int countDigits(int i) {
        int numberOfDigits = 1;
        while (i > 9) {
            i = i / 10;
            numberOfDigits++;
        }
        return numberOfDigits;
    }

    private int findNumbersByStringify(int[] nums) {
        final List<Integer> integers = Utility.intArrayToList(nums);
        return integers.stream().map(x -> x.toString()).mapToInt(x -> x.length() % 2 == 0 ? 1 : 0).sum();
    }

    private String toLower(String str) {
        return str.chars().map(x -> x > 64 && x < 91 ? x + 32 : x).mapToObj(x -> (char) x).collect(StringBuilder::new, StringBuilder::append, StringBuilder::append).toString();
    }

    @Test
    //https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
    public void shouldAssertCountOfLowerValuesThanIndex() {
        final List<Integer> outValue = Utility.intArrayToList(smallerNumbersThanCurrent(Utility.listToIntArray(List.of(8, 1, 2, 2, 3))));
        assertThat(outValue).hasSameElementsAs(List.of(4, 0, 1, 1, 3));
    }

    private int[] smallerNumbersThanCurrent(int[] nums) {
        List<Integer> numbers = Utility.intArrayToList(nums);
        final List<Integer> collect = numbers.stream().map(x -> getHowManyAreSmaller(x, numbers)).collect(Collectors.toList());
        return Utility.listToIntArray(collect);
    }

    private int getHowManyAreSmaller(int x, List<Integer> numbers) {
        return (int) numbers.stream().filter(n -> n < x).count();
    }

    public int[][] flipAndInvertImage(int[][] A) {
        int n = A.length;
        for (int[] row : A) {
            for (int i = 0; i * 2 < n; i++) {
                if (row[i] == row[n - i - 1]) {
                    row[i] = row[n - i - 1] ^= 1;
                }
            }
        }
        return A;
    }
}
