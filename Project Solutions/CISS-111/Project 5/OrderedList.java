import java.util.Iterator;

public class OrderedList implements Iterable<String> {
    private Node head;

    // This is the requirement of implementing Iterable. Provide
    // an iterator() method that returns an Iterator object.
    public Iterator<String> iterator() {
        return new LLIterator();
    }

    // This is what the iterator() returns to the caller.
    // This is the iterator object that processes the list.
    private class LLIterator implements Iterator<String> {
        private Node current = head;

        public boolean hasNext() {
            return current != null;
        }

        public String next() {
            String item = current.data;
            current = current.next;
            return item;
        }
    }

    private class Node {
        private String data;
        private Node next;

        private Node(String item) {
            data = item;
            next = null;
        }
    }

    public OrderedList () {
        head = null;
    }

    public void insert(String item) {
        Node cur = head, back = null;

        Node n = new Node(item);
        while (cur != null) {
            if (cur.data.equals(item)) return; // no dups!

            if (cur.data.compareToIgnoreCase(item) > 0) break;
            back = cur;
            cur = cur.next;
        }
        n.next = cur;
        if (back == null)
            head = n;
        else
            back.next = n;
    }

    public void delete(String item) {
        Node cur = head, back = null;

        while (cur != null) {
            if (cur.data.equals(item)) {
                if (back == null)
                    head = cur.next;
                else
                    back.next = cur.next;

                break; //leave the loop
            } else {
                back = cur;
                cur = cur.next; // move to the next node
            }
        }
    }

    @Override
    public String toString() {
        String o = "[";
        Iterator iter = iterator();

        // first data value is alone.
        if ( iter.hasNext() )
            o += iter.next();
        // remaining data values have ", value"
        while ( iter.hasNext() )
            o += ", " + iter.next();

        return o + "]";
    }
}
