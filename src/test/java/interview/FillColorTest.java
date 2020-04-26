package interview;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import interview.exercises.FillColor;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FillColorTest {
    private FillColor program;

    @BeforeMethod
    public void setUp() {
        program = new FillColor();
    }

    @Test
    public void testName() {
        int[][] canvas = new int[][]{{1, 0, 0, 2, 2, 0},
                                     {0, 0, 0, 2, 2, 2},
                                     {1, 2, 3, 2, 2, 2},
                                     {0, 1, 1, 1, 3, 2}};
        program.fill(canvas, 4, 1, 3);
        int[][] output = new int[][]{{1, 0, 0, 4, 4, 0},
                                     {0, 0, 0, 4, 4, 4},
                                     {1, 2, 3, 4, 4, 4},
                                     {0, 1, 1, 1, 3, 4}};
        assertThat(canvas).contains(output);
    }
}