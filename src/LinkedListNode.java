public class LinkedListNode<E> implements Node {
    private E data;
    private LinkedListNode<E> next;

    public LinkedListNode() {
        data = null;
        next = null;
    }

    public LinkedListNode(E data) {
        this.data = data;
        next = null;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public LinkedListNode<E> getNext() {
        return next;
    }

    public void setNext(LinkedListNode<E> next) {
        this.next = next;
    }

    @Override
    public Node next() {
        return next;
    }
}
