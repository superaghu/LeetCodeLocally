package interview;

import static org.assertj.core.api.Assertions.assertThat;

import interview.java.exercises.LC253MeetingRoomsII;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

@Ignore
@Test
public class LC253MeetingRoomsIITest {
    private LC253MeetingRoomsII program;

    @BeforeMethod
    public void setUp() {
        program = new LC253MeetingRoomsII();
    }

    @Test(enabled = false)
    public void testName() {
        assertThat(program.minMeetingRooms(new int[][]{{0, 30}, {5, 10}, {15, 20}})).isEqualTo(2);
        assertThat(program.minMeetingRooms(new int[][]{{7, 10}, {2, 4}})).isEqualTo(1);
    }
}