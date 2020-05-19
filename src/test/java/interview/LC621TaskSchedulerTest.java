package interview;

import static org.assertj.core.api.Assertions.assertThat;

import interview.java.exercises.LC621TaskScheduler;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

@Ignore
@Test
public class LC621TaskSchedulerTest {
    private LC621TaskScheduler program;

    @BeforeMethod
    public void setUp() {
        program = new LC621TaskScheduler();
    }

    public void testName() {
        assertThat(program.leastInterval(new char[]{'A', 'B'}, 1)).isEqualTo(2);
        assertThat(program.leastInterval(new char[]{'A', 'A', 'A', 'B', 'B', 'B'}, 2)).isEqualTo(8);
        assertThat(program.leastInterval(new char[]{'A', 'A'}, 100)).isEqualTo(102);
        assertThat(program.leastInterval(new char[]{'A', 'A'}, 0)).isEqualTo(2);
        assertThat(program.leastInterval(new char[]{'A', 'B', 'B'}, 1)).isEqualTo(3);
        assertThat(program.leastInterval(new char[]{'A', 'A'}, 1)).isEqualTo(3);
        assertThat(program.leastInterval(new char[]{'A', 'B', 'B', 'B', 'B', 'B'}, 1)).isEqualTo(9); //B A B idle B idle B idle B
        assertThat(program.leastInterval(new char[]{'A', 'A', 'A', 'B', 'B', 'B', 'C', 'C', 'C'}, 1)).isEqualTo(9);
        assertThat(program.leastInterval(new char[]{'A', 'B', 'C', 'D', 'E', 'F'}, 100)).isEqualTo(6);
    }
}