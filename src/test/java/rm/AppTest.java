package rm;

import static org.assertj.core.api.Assertions.assertThat;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    public void shouldAssertLowerCase() {
        assertThat("a&bcd").isEqualTo(toLower("A&bcD"));
    }

    private String toLower(String str) {
        return str.chars().map(x -> x > 64 && x < 91 ? x + 32 : x).mapToObj(x -> (char) x).collect(StringBuilder::new, StringBuilder::append, StringBuilder::append).toString();
    }

    @Test
    //https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
    public void shouldAssertCountOfLowerValuesThanIndex() {
        final List<Integer> outValue = Arrays.stream(smallerNumbersThanCurrent(listToIntArray(List.of(8, 1, 2, 2, 3)))).boxed().collect(Collectors.toList());
        assertThat(outValue).hasSameElementsAs(List.of(4, 0, 1, 1, 3));
    }

    private int[] smallerNumbersThanCurrent(int[] nums) {
        List<Integer> numbers = Arrays.stream(nums).boxed().collect(Collectors.toList());
        final List<Integer> collect = numbers.stream().map(x -> getHowManyAreSmaller(x, numbers)).collect(Collectors.toList());
        return listToIntArray(collect);
    }

    private int[] listToIntArray(List<Integer> input) {
        return input.stream().mapToInt(x -> x).toArray();
    }

    private int getHowManyAreSmaller(int x, List<Integer> numbers){
        return (int)numbers.stream().filter(n -> n < x).count();
    }
}
