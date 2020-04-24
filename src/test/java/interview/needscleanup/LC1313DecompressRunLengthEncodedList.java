package interview.needscleanup;

import static org.assertj.core.api.Assertions.assertThat;

import io.vavr.collection.List;
import org.testng.annotations.Test;

//https://leetcode.com/problems/decompress-run-length-encoded-list/discuss/?currentPage=1&orderBy=most_votes&query=
//https://www.thedigitalcatonline.com/blog/2015/04/14/99-scala-problems-12-decode-a-run-length-encoded-list/
public class LC1313DecompressRunLengthEncodedList {
    @Test
    public void testName() {
        assertThat(runLength(List.of(1, 2, 3, 4))).isEqualTo(List.of(2, 4, 4, 4));
    }

    private List runLength(List listToIntArray) {
//        listToIntArray.spl()
//
//        List<Integer> list = Utility.intArrayToList(listToIntArray);
//        final List<Integer> out = new ArrayList();
//        list.stream().reduce(ArrayList::new, (x, y) -> IntStream.range(0, x).peek(item -> out.add(item)));
        return List.empty();
    }
}
