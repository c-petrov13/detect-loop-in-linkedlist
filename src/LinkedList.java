import java.util.NoSuchElementException;

/**
 * This realization do not pretend to be a full implementation List interface.
 * Just the necessary method to run and test the detect loop algorithm.
 */

public class LinkedList<E> {
    private LinkedListNode<E> first;
    private int size;

    public LinkedList() {
        first = null;
        size = 0;
    }

    /**
     * Appends the specified element to the head of this list.
     * @param data element to be appended to this list
     * @return true
     *
     */
    public boolean add(E data) {
        LinkedListNode<E> newNode = new LinkedListNode<>(data);
        newNode.setNext(first);
        first = newNode;

        size++;
        return true;
    }

    /**
     * Returns the LinkedListNode<E> element at the specified position in this list.
     * @param index index of the LinkedListNode<E> element to return
     * @return the LinkedListNode<E> element at the specified position in this list
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    public LinkedListNode<E> get(int index) throws IndexOutOfBoundsException {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        LinkedListNode<E> temp = first;
        for (int i = 0; i < index; i++) {
            temp = temp.getNext();
        }
        return temp;
    }

    /**
     * Returns the first LinkedListNode<E> element in this list.
     * @return the first LinkedListNode<E> element in this list
     * @throws NoSuchElementException if this list is empty
     */
    public LinkedListNode<E> getFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return first;
    }

    /**
     * Returns the last LinkedListNode<E> element in this list.
     * @return the last LinkedListNode<E> element in this list
     * @throws NoSuchElementException if this list is empty
     */
    public LinkedListNode<E> getLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return get(size - 1);
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return first == null;
    }


}
