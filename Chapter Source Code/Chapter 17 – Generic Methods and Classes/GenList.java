public class GenList<T> {

    private Node head;

    private class Node {
        private T data;
        private Node next;

        private Node(T item) {
            data = item;
            next = null;
        }
    }

    public GenList() {
        head = null;
    }

    public void insert(T item) {
        Node n = new Node(item);

        n.next = head;
        head = n;
    }

    public void delete(T item) {
        Node cur = head, back = null;

        while (cur != null) {
            if (cur.data.equals(item)) {
                if (back == null)
                    head = cur.next;
                else
                    back.next = cur.next;

                break; // leave the loop
            } else {
                back = cur;
                cur = cur.next; // move to the next node
            }
        }
    }

    @Override
    public String toString() {
        String o = "[";
        Node p = head;

        // first data value is alone.
        if (p != null) {
            o += p.data;
            p = p.next;
        }
        // remaining data values have ", value"
        while (p != null) {
            o += ", " + p.data;
            p = p.next;
        }
        return o + "]";
    }
}
