package interview;

import static org.assertj.core.api.Assertions.assertThat;

import interview.exercises.NumberToWordForm;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NumberToWordFormTest {
    private NumberToWordForm program;

    @BeforeMethod
    public void setUp() {
        program = new NumberToWordForm();
    }

    @Test
    public void testName() {
        assertThat(program.format(1)).isEqualTo("One");
        assertThat(program.format(2)).isEqualTo("Two");
        assertThat(program.format(3)).isEqualTo("Three");
        assertThat(program.format(4)).isEqualTo("Four");
        assertThat(program.format(5)).isEqualTo("Five");
        assertThat(program.format(6)).isEqualTo("Six");
        assertThat(program.format(7)).isEqualTo("Seven");
        assertThat(program.format(8)).isEqualTo("Eight");
        assertThat(program.format(9)).isEqualTo("Nine");
        assertThat(program.format(10)).isEqualTo("Ten");
        assertThat(program.format(11)).isEqualTo("Eleven");
        assertThat(program.format(12)).isEqualTo("Twelve");
        assertThat(program.format(13)).isEqualTo("Thirteen");
        assertThat(program.format(14)).isEqualTo("Fourteen");
        assertThat(program.format(15)).isEqualTo("Fifteen");
        assertThat(program.format(16)).isEqualTo("Sixteen");
        assertThat(program.format(17)).isEqualTo("Seventeen");
        assertThat(program.format(18)).isEqualTo("Eighteen");
        assertThat(program.format(19)).isEqualTo("Nineteen");
        assertThat(program.format(20)).isEqualTo("Twenty");
        assertThat(program.format(30)).isEqualTo("Thirty");
        assertThat(program.format(40)).isEqualTo("Forty");
        assertThat(program.format(50)).isEqualTo("Fifty");
        assertThat(program.format(60)).isEqualTo("Sixty");
        assertThat(program.format(70)).isEqualTo("Seventy");
        assertThat(program.format(80)).isEqualTo("Eighty");
        assertThat(program.format(90)).isEqualTo("Ninety");
        assertThat(program.format(100)).isEqualTo("Hundred");
        assertThat(program.format(1000)).isEqualTo("Thousand");
        assertThat(program.format(1000000)).isEqualTo("Million");
        assertThat(program.format(1000000000)).isEqualTo("Billion");

        assertThat(program.format(101)).isEqualTo("One Hundred One");
        assertThat(program.format(1999)).isEqualTo("One Thousand Nine Hundred Ninety Nine");
    }
}