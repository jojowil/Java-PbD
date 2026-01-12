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

    public IntQueue() {
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

        if (isEmpty())
            throw new NoSuchElementException();
        v = first.data;
        first = first.next;
        if (first == null)
            last = null;
        size--;
        return v;
    }

    // debug method to dump the contents of the queue to the screen
    public String toString() {
        Node p = first;
        StringBuilder s;

        s = new StringBuilder("FIRST ->");
        while (p != null) {
            s.append(" ").append(p.data).append(" ");
            p = p.next;
        }
        s.append("<- LAST\n");
        return s.toString();
    }

    // method to determine if the queue is empty.
    public boolean isEmpty() {
        return first == null;
    }

    // method to return the number of queue entries
    public int size() {
        return size;
    }

    public static void main(String[] args) {
        IntQueue q = new IntQueue();

        q.enq(7);
        q.enq(5);
        q.enq(3);
        System.out.print("Queue contains:\n" + q);
        System.out.println("Queue length is " + q.size());

        while (!q.isEmpty()) {
            System.out.println("Dequeued " + q.deq());
        }

        // intentionally try to deq an empty queue
        try {
            System.out.println("Dequeued " + q.deq());
        } catch (NoSuchElementException e) {
            System.out.println("That could have been bad!");
        }
    }
}
