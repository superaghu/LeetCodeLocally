package interview;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import interview.java.exercises.LC118PascalsTriangle;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

@Test(enabled = false)
public class LC118PascalsTriangleTest {
    private LC118PascalsTriangle program;

    @BeforeMethod
    public void setUp() {
        program = new LC118PascalsTriangle();
    }

    @Test(enabled = false)
    public void testGenerate() {

        final List<Integer> level1 = List.of(1);
        final List<Integer> level2 = List.of(1, 1);
        final List<Integer> level3 = List.of(1, 2, 1);
        final List<Integer> level4 = List.of(1, 3, 3, 1);
        final List<Integer> level5 = List.of(1, 4, 6, 4, 1);

        assertThat(program.generate(1)).isEqualTo(List.of(level1));
        assertThat(program.generate(2)).isEqualTo(List.of(level1, level2));
        assertThat(program.generate(3)).isEqualTo(List.of(level1, level2, level3));
        assertThat(program.generate(4)).isEqualTo(List.of(level1, level2, level3, level4));
        assertThat(program.generate(5)).isEqualTo(List.of(level1, level2, level3, level4, level5));
    }
}