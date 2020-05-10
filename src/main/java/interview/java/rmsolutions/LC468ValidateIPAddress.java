package interview.java.rmsolutions;

import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * @see <a href="https://leetcode.com/problems/validate-ip-address/">Link</a>
 */
public class LC468ValidateIPAddress {

    public static final String NEITHER = "Neither";

    public String validIPAddress_mine(String IP) {
        final boolean contains = IP.contains(".");
        return contains ? checkIPV4(IP) : checkIPV6(IP);
    }

    private String checkIPV4(String ip) {
        final String[] split = ip.split("\\.");
        if (split.length != 4) {
            return NEITHER;
        }

        return Arrays.stream(split).filter(x -> !isValidIpElement(x)).count() == 0 ? "IPv4" : NEITHER;
    }

    private String checkIPV6(String ip) {
        final String[] split = ip.split(":");
        if (split.length != 8) {
            return NEITHER;
        }
        return Arrays.stream(split).filter(x -> !isValidIpV6Element(x)).count() == 0 ? "IPv6" : "Neither";
    }

    private boolean isValidIpV6Element(String ipV6Element) {
        Pattern pattern = Pattern.compile("[a-zA-Z0-9]{1,4}");
        return pattern.matcher(ipV6Element).matches();
    }

    private boolean isValidIpElement(String ipElement) {

        Pattern pattern = Pattern.compile("[1-9]{1,3}");
        return pattern.matcher(ipElement).matches();
    }

    String chunkIPv4 = "([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])";
    Pattern pattenIPv4 =
            Pattern.compile("^(" + chunkIPv4 + "\\.){3}" + chunkIPv4 + "$");

    String chunkIPv6 = "([0-9a-fA-F]{1,4})";
    Pattern pattenIPv6 =
            Pattern.compile("^(" + chunkIPv6 + "\\:){7}" + chunkIPv6 + "$");

    //copied
    public String validIPAddress(String IP) {
        if (pattenIPv4.matcher(IP).matches()) {
            return "IPv4";
        }
        return (pattenIPv6.matcher(IP).matches()) ? "IPv6" : "Neither";
    }
}
