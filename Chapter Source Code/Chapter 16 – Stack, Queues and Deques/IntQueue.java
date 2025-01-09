import java.util.NoSuchElementException;

public class IntQueue {
    // the front and back of the queue
    private Node first, last;
    private int size;

    private class Node {
        private int data;
        private Node next;

        private Node(int item) {
            data = item;
            next = null;
        }
    }

    public IntQueue () {
        first = null;
        last = null;
        size = 0;
    }

    // returns the first value or exception when empty.
    public int peek() {
        if (isEmpty())
            throw new NoSuchElementException();
        else
            return first.data;
    }

    // enqueue (add) new item on the last
    public void enq(int item) {
        Node oldlast = last;

        last = new Node(item);
        if (isEmpty())
            first = last;
        else
            oldlast.next = last;
        size++;
    }

    // dequeue (remove) item from the first of the queue and return the removed value.
    public int deq() {
        int v;

        if ( isEmpty() )
            throw new NoSuchElementException();
        v = first.data;
        first = first.next;
        if ( first == null )
            last = null;
        size--;
        return v;
    }

    // debug method to dump the contents of the queue to the screen
    public String toString() {
        Node p = first;
        String s;

        s = "FIRST ->";
        while ( p != null ) {
            s = s + " " + p.data + " ";
            p = p.next;
        }
        s = s +"<- LAST\n";
        return s;
    }

    // method to determine if the queue is empty.
    public boolean isEmpty() {
        return first == null;
    }

    // method to return the number of queue entries
    public int size() {
        return size;
    }
}
