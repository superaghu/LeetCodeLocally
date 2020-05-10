package interview;

import static org.assertj.core.api.Assertions.assertThat;

import interview.java.rmsolutions.LC566ReshapetheMatrix;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LC566ReshapetheMatrixTest {
    private LC566ReshapetheMatrix program;

    @BeforeMethod
    public void setUp() {
        program = new LC566ReshapetheMatrix();
    }

    @Test
    public void testName() {
        assertThat(program.matrixReshape(new int[][]{{1, 2}, {3, 4}}, 1, 4)).contains(new int[][]{{1, 2, 3, 4}});
        assertThat(program.matrixReshape(new int[][]{{1, 2}, {3, 4}}, 2, 4)).contains(new int[][]{{1, 2}, {3, 4}});
        assertThat(program.matrixReshape(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, 1, 9)).contains(new int[][]{{1, 2, 3, 4, 5, 6, 7, 8, 9}});
    }
}