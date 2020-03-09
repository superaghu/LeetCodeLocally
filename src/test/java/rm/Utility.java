package rm;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Utility {
    public static List<Integer> intArrayToList(int[] nums) {
        return Arrays.stream(nums).boxed().collect(Collectors.toList());
    }

    public static int[] listToIntArray(List<Integer> input) {
        return input.stream().mapToInt(x -> x).toArray();
    }
}
