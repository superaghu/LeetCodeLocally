package interview;

import static interview.java.model.Node.create;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import interview.java.exercises.LC138CopyListwithRandomPointer;
import interview.java.model.Node;
import io.vavr.Tuple2;
import io.vavr.collection.List;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test(enabled = false)
public class LC138CopyListwithRandomPointerTest {
    private LC138CopyListwithRandomPointer program;

    @BeforeMethod
    public void setUp() {
        program = new LC138CopyListwithRandomPointer();
    }

    @Test(enabled = false)
    public void testGenerate() {
        final List<Tuple2<Integer, Integer>> list = List.of(new Tuple2<>(0, 0), new Tuple2<>(2, 0));
        final Node head = create(list.toJavaList());
        assertThat(program.copyRandomList(head)).isEqualTo(head);
    }

    @Test(enabled = false)
    public void testGenerate2() {
        final List<Tuple2<Integer, Integer>> list = List.of(new Tuple2<>(7, null), new Tuple2<>(13, 0), new Tuple2<>(11, 4), new Tuple2<>(10, 2), new Tuple2<>(1, 0));
        final Node head = create(list.toJavaList());
        final Node actual = program.copyRandomList(head);
        assertThat(actual).isEqualTo(head);
    }

    @Test(enabled = false)
    public void testGenerate3() {
        final List<Tuple2<Integer, Integer>> list = List.of(new Tuple2<>(3, null), new Tuple2<>(3, 0), new Tuple2<>(3, null));
        final Node head = create(list.toJavaList());
        assertThat(program.copyRandomList(head)).isEqualTo(head);
    }

    @Test(enabled = false)
    public void testGenerate4() {
        final List<Tuple2<Integer, Integer>> list = List.of();
        final Node head = create(list.toJavaList());
        assertThat(program.copyRandomList(head)).isEqualTo(head);
    }
}