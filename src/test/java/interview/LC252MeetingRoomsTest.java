package interview;

import static org.assertj.core.api.Assertions.assertThat;

import interview.java.exercises.LC252MeetingRooms;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

@Ignore
@Test
public class LC252MeetingRoomsTest {
    private LC252MeetingRooms program;

    @BeforeMethod
    public void setUp() {
        program = new LC252MeetingRooms();
    }

    @Test(enabled = false)
    public void testName() {
        assertThat(program.canAttendMeetings(new int[][]{{0, 30}, {5, 10}, {15, 20}})).isEqualTo(false);
        assertThat(program.canAttendMeetings(new int[][]{{7, 10}, {2, 4}})).isEqualTo(true);
    }
}