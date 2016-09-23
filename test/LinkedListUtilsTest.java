import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class LinkedListUtilsTest {
    private LinkedList<Integer> sampleListWithLoop;
    private LinkedList<Integer> sampleListWithoutLoop;

    @Before
    public void setUp() {
        sampleListWithLoop = createListWithLoop();
    }

    @Test
    public void testDetectLoopInListWithLoop() {
        assertTrue(LinkedListUtils.hasLoop(sampleListWithLoop.getFirst()));
    }

    @Test
    public void testDetectNoLoopInListWithoutLoop() {
        sampleListWithoutLoop = createSampleList();
        assertFalse(LinkedListUtils.hasLoop(sampleListWithoutLoop.getFirst()));
    }

    @Test(expected = NoSuchElementException.class)
    public void testNoSuchElementExceptionThenTryGetElementFromEmptyList() {
        LinkedList<Integer> emptyList = new LinkedList<>();
        assertFalse(LinkedListUtils.hasLoop(emptyList.getFirst()));
    }

    private LinkedList<Integer> createSampleList() {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 10; i >= 0; i--) {
            list.add(i);
        }
        return list;
    }

    private LinkedList<Integer> createListWithLoop() {
        LinkedList<Integer> list = createSampleList();
        list.getLast().setNext(list.get(3));

        return list;
    }
}
