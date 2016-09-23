public class LinkedListUtils {

    /**
     * Detect if a linked list has a loop using Floyd's cycle detection algorithm.
     * @param first the first node in list
     * @return true if the list has a cycle, false otherwise
     */
    public static boolean hasLoop(Node first) {
        if (first == null) {
            return false;
        }

        Node slow = first;
        Node fast = first;

        while (fast.next() != null) {
            slow = slow.next();
            fast = fast.next().next();
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }
}
