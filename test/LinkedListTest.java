import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class LinkedListTest {
    private LinkedList<Integer> sampleList;

    @Before
    public void setUp() {
        sampleList = createSampleList();
    }

    @Test
    public void testAddOneElement() {
        sampleList.add(100);
        assertEquals(100, sampleList.getFirst().getData().intValue());
    }

    @Test
    public void testGetElementAtPosition4() {
        assertEquals(sampleList.get(4).getData().intValue(), 4);
    }

    @Test
    public void testGetFirstElement() {
        assertEquals(0, sampleList.getFirst().getData().intValue());
    }

    @Test
    public void testGetLastElement() {
        assertEquals(10, sampleList.getLast().getData().intValue());
    }

    @Test
    public void testCheckAnEmptyList() {
        assertTrue(new LinkedList<Integer>().isEmpty());
    }

    @Test
    public void testCheckAnNonEmptyList() {
        assertFalse(sampleList.isEmpty());
    }

    private LinkedList<Integer> createSampleList() {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 10; i >= 0; i--) {
            list.add(i);
        }
        return list;
    }
}
