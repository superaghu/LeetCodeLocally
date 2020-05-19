package interview;

import static org.assertj.core.api.Assertions.assertThat;

import interview.java.exercises.LC621TaskScheduler;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LC621TaskSchedulerTest {
    private LC621TaskScheduler program;

    @BeforeMethod
    public void setUp() {
        program = new LC621TaskScheduler();
    }

    @Test(enabled = false)
    public void testName() {
        assertThat(program.leastInterval(new char[]{'A', 'A', 'A', 'B', 'B', 'B'}, 2)).isEqualTo(8);
        assertThat(program.leastInterval(new char[]{'A', 'A'}, 100)).isEqualTo(102);
        assertThat(program.leastInterval(new char[]{'A', 'A'}, 1)).isEqualTo(2);
        assertThat(program.leastInterval(new char[]{'A', 'B', 'B'}, 1)).isEqualTo(3);
    }
}