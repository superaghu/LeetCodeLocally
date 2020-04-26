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
        assertThat(program.wordForm(0)).isEqualTo("Zero");
        assertThat(program.wordForm(1)).isEqualTo("One");
        assertThat(program.wordForm(2)).isEqualTo("Two");
        assertThat(program.wordForm(3)).isEqualTo("Three");
        assertThat(program.wordForm(4)).isEqualTo("Four");
        assertThat(program.wordForm(5)).isEqualTo("Five");
        assertThat(program.wordForm(6)).isEqualTo("Six");
        assertThat(program.wordForm(7)).isEqualTo("Seven");
        assertThat(program.wordForm(8)).isEqualTo("Eight");
        assertThat(program.wordForm(9)).isEqualTo("Nine");
        assertThat(program.wordForm(10)).isEqualTo("Ten");
//        assertThat(program.wordForm(11)).isEqualTo("Eleven");
//        assertThat(program.wordForm(12)).isEqualTo("Twelve");
//        assertThat(program.wordForm(13)).isEqualTo("Thirteen");
//        assertThat(program.wordForm(14)).isEqualTo("Fourteen");
//        assertThat(program.wordForm(15)).isEqualTo("Fifteen");
//        assertThat(program.wordForm(16)).isEqualTo("Sixteen");
//        assertThat(program.wordForm(17)).isEqualTo("Seventeen");
//        assertThat(program.wordForm(18)).isEqualTo("Eighteen");
//        assertThat(program.wordForm(19)).isEqualTo("Nineteen");
        assertThat(program.wordForm(20)).isEqualTo("Twenty");
        assertThat(program.wordForm(30)).isEqualTo("Thirty");
        assertThat(program.wordForm(40)).isEqualTo("Forty");
        assertThat(program.wordForm(50)).isEqualTo("Fifty");
        assertThat(program.wordForm(60)).isEqualTo("Sixty");
        assertThat(program.wordForm(70)).isEqualTo("Seventy");
        assertThat(program.wordForm(80)).isEqualTo("Eighty");
        assertThat(program.wordForm(90)).isEqualTo("Ninety");
        assertThat(program.wordForm(100)).isEqualTo("One Hundred");
        assertThat(program.wordForm(1000)).isEqualTo("One Thousand");
        assertThat(program.wordForm(10000)).isEqualTo("Ten Thousand");
        assertThat(program.wordForm(1000000)).isEqualTo("One Million");
        assertThat(program.wordForm(1000000000)).isEqualTo("One Billion");

        assertThat(program.wordForm(101)).isEqualTo("One Hundred One");
        assertThat(program.wordForm(1999)).isEqualTo("One Thousand Nine Hundred Ninety Nine");
        assertThat(program.wordForm(1001)).isEqualTo("One Thousand One");
        assertThat(program.wordForm(1001001)).isEqualTo("One Million One Thousand One");
    }
}