import java.util.NoSuchElementException;

public class IntDeque {
    // the top of the queue
    private Node first, last;
    private int size;

    private class Node {
        private int data;
        private Node next, prev;

        private Node(int item) {
            data = item;
            next = null;
            prev = null;
        }
    }

    public IntDeque() {
        first = null;
        last = null;
        size = 0;
    }

    // returns the first value or exception when empty.
    public int peekFirst() {
        if (isEmpty())
            throw new NoSuchElementException();
        else
            return first.data;
    }

    // returns the last value or exception when empty.
    public int peekLast() {
        if (isEmpty())
            throw new NoSuchElementException();
        else
            return last.data;
    }

    // enqueue (add) new item on the last
    public void addLast(int item) {
        Node oldlast = last;

        last = new Node(item);
        if (isEmpty())
            first = last;
        else {
            // link up both directions
            oldlast.next = last;
            last.prev = oldlast;
        }
        size++;
    }

    // enqueue (add) new item on the first
    public void addFirst(int item) {
        Node oldfirst = first;

        first = new Node(item);
        if (isEmpty())
            last = first;
        else {
            // link up both directions
            oldfirst.prev = first;
            first.next = oldfirst;
        }
        size++;
    }

    // dequeue (remove) item from the first of the queue and return the removed value.
    public int removeFirst() {
        int v;

        if (isEmpty())
            throw new NoSuchElementException();
        v = first.data;
        // advance and null the prev link.
        first = first.next;
        if (first != null)
            first.prev = null;
        else
            last = null;
        size--;
        return v;
    }

    // dequeue (remove) item from the first of the queue and return the removed value.
    public int removeLast() {
        int v;

        if (isEmpty())
            throw new NoSuchElementException();
        v = last.data;
        // advance and null the prev link.
        last = last.prev;
        if (last != null)
            last.next = null;
        else
            first = null;
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

        s.append("LAST ->");
        p = last;
        while (p != null) {
            s.append(" ").append(p.data).append(" ");
            p = p.prev;
        }
        s.append("<- FIRST\n");

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
        IntDeque d = new IntDeque();
        int x;

        d.addLast(7);
        d.addLast(5);
        d.addLast(3);
        d.addFirst(13);
        d.addFirst(15);
        d.addFirst(17);
        System.out.print("Deque contains:\n" + d);
        System.out.println("Deque length is " + d.size());

        x = 0;
        while (x < 3) {
            System.out.println("Dequeued from front " + d.removeFirst());
            x++;
        }

        System.out.print("Deque contains:\n" + d);

        x = 0;
        while (x < 3) {
            System.out.println("Dequeued from end " + d.removeLast());
            x++;
        }

        System.out.print("Deque contains:\n" + d);

        // intentionally try to deq an empty deqque
        try {
            System.out.println("Dequeued from front " + d.removeFirst());
        } catch (NoSuchElementException e) {
            System.out.println("That could have been bad!");
        }

        // intentionally try to deq an empty deque
        try {
            System.out.println("Dequeued fron end " + d.removeLast());
        } catch (NoSuchElementException e) {
            System.out.println("That could have been bad!");
        }
    }
}
