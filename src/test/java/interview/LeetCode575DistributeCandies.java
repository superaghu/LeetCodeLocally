package interview;

import static org.assertj.core.api.Assertions.assertThat;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.IntStream;

//https://leetcode.com/problems/distribute-candies/
public class LeetCode575DistributeCandies {

    @Test
    public void testName() {
        int[] candies = new int[]{1, 1, 2, 2, 3, 3};
        assertThat(distributeCandies(candies)).isEqualTo(3);
    }

    @Test
    public void testName2() {
        int[] candies = new int[]{1, 1, 2, 3};
        assertThat(distributeCandies(candies)).isEqualTo(2);
    }


    public int distributeCandies(int[] candies) {
        Set<Integer> kinds = new HashSet<>();
        for (int candy : candies) kinds.add(candy);
        return kinds.size() >= candies.length / 2 ? candies.length / 2 : kinds.size();
    }

    private int distributeCandies_mySolution(int[] candies) {
        Map<Integer, Integer> map = new HashMap<>();
        IntStream.of(candies).forEach(x -> map.merge(x, 1, (y, z) -> y + 1));
        return map.size() >  candies.length / 2 ? candies.length / 2 : map.size();
    }

    public int distributeCandies_bad(int[] candies) {
        Map<Integer, Integer> map = new HashMap<>();
        IntStream.of(candies).forEach(x -> map.merge(x, 1, (y, z) -> y + 1));
        final Collection<Integer> values = map.values();
        List<Integer> list = new ArrayList<>(values);
//        list.sort((x, y) -> x < y ? x : y); This should have been     public static int compare(int x, int y) {
//        return (x < y) ? -1 : ((x == y) ? 0 : 1);
//    }

        list.sort(Comparator.naturalOrder());
        int half = candies.length / 2;
        int sisterShare = 0;
        int unique = 0;
        int index = 0;
        while (sisterShare < half) {
            int j = list.get(index);
            unique++;
            sisterShare += j;
        }

        return unique;
    }
}
