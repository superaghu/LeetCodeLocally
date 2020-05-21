package interview;

import static org.assertj.core.api.Assertions.assertThat;

import interview.java.exercises.CellCompute;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.vavr.collection.List;

@Test(enabled = false)
public class CellComputeTest {
    private CellCompute program;

    @BeforeMethod
    public void setUp() {
        program = new CellCompute();
    }

    @Test(enabled = false)
    public void testName() {
        assertThat(program.cellCompete(new int[]{1, 0, 0, 0, 0, 1, 0, 0}, 1)).isEqualTo(List.of(0, 1, 0, 0, 1, 0, 1, 0));
        assertThat(program.cellCompete(new int[]{1, 1, 1, 0, 1, 1, 1, 1}, 1)).isEqualTo(List.of(1, 0, 1, 0, 1, 0, 0, 1));
        assertThat(program.cellCompete(new int[]{1, 0, 1, 0, 1, 0, 0, 1}, 1)).isEqualTo(List.of(0, 0, 0, 0, 0, 1, 1, 0));
        assertThat(program.cellCompete(new int[]{1, 1, 1, 0, 1, 1, 1, 1}, 2)).isEqualTo(List.of(0, 0, 0, 0, 0, 1, 1, 0));
    }
}