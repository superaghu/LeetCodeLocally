package interview;

import static org.assertj.core.api.Assertions.assertThat;

import interview.java.exercises.LC994RottingOranges;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test(enabled = false)
public class LC994RottingOrangesTest {
    private LC994RottingOranges program;

    @BeforeMethod
    public void setUp() {
        program = new LC994RottingOranges();
    }

    @Test(enabled = false)
    public void testName() {
        int[][] input = new int[][]{{2, 1, 1}, {1, 1, 0}, {0, 1, 1}};
        assertThat(program.orangesRotting(input)).isEqualTo(4);
    }

    @Test(enabled = false)
    public void testName2() {
        int[][] input = new int[][]{{2, 2}, {1, 1}, {0, 0}, {2, 0}};
        assertThat(program.orangesRotting(input)).isEqualTo(1);
    }

    @Test(enabled = false)
    public void testName3() {
        int[][] input = new int[][]{{2, 1, 1}, {0, 1, 1}, {1, 0, 1}};
        assertThat(program.orangesRotting(input)).isEqualTo(-1);
    }

    @Test(enabled = false)
    public void testName4() {
        int[][] input = new int[][]{{0, 2}};
        assertThat(program.orangesRotting(input)).isEqualTo(0);
    }
}