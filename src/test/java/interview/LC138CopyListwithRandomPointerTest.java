package interview;

import static interview.exercises.Node.create;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import interview.exercises.LC138CopyListwithRandomPointer;
import interview.exercises.Node;
import io.vavr.Tuple2;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class LC138CopyListwithRandomPointerTest {
    private LC138CopyListwithRandomPointer program;

    @BeforeMethod
    public void setUp() {
        program = new LC138CopyListwithRandomPointer();
    }

    @Test
    public void testGenerate() {
        final List<Tuple2<Integer, Integer>> list = List.of(new Tuple2<>(0, 0), new Tuple2<>(2, 0));
        final Node head = create(list);
        assertThat(program.copyRandomList(head)).isEqualTo(head);
    }
}