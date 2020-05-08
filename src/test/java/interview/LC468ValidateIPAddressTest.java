package interview;

import static org.assertj.core.api.Assertions.assertThat;

import interview.exercises.LC468ValidateIPAddress;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LC468ValidateIPAddressTest {
    private LC468ValidateIPAddress program;

    @BeforeMethod
    public void setUp() {
        program = new LC468ValidateIPAddress();
    }

    @Test
    public void testName() {
        assertThat(program.validIPAddress("172.16.254.1")).isEqualTo("IPv4");
        assertThat(program.validIPAddress("2001:0db8:85a3:0:0:8A2E:0370:7334")).isEqualTo("IPv6");
        assertThat(program.validIPAddress("256.256.256.256")).isEqualTo("Neither");
    }
}