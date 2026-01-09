import java.util.Iterator;

public class IterableList implements Iterable<Integer> {
    private Node head;

    // This is the requirement of implementing Iterable. Provide
    // an iterator() method that returns an Iterator object.
    public Iterator<Integer> iterator() {
        return new LLIterator();
    }

    // This is what the iterator() returns to the caller.
    // This is the iterator object that processes the list.
    private class LLIterator implements Iterator<Integer> {
        private Node current = head;

        public boolean hasNext() {
            return current != null;
        }

        public Integer next() {
            int item = current.data;
            current = current.next;
            return item;
        }
    }

    private class Node {
        private int data;
        private Node next;

        private Node(int item) {
            data = item;
            next = null;
        }
    }

    public IterableList() {
        head = null;
    }

    public void insert(int item) {
        Node n = new Node(item);
        n.next = head;
        head = n;
    }

    public void delete(int item) {
        Node cur = head, back = null;

        while (cur != null) {
            if (cur.data == item) {
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
        StringBuilder o = new StringBuilder("[");
        Iterator<Integer> iter = iterator();

        // first data value is alone.
        if (iter.hasNext())
            o.append(iter.next());
        // remaining data values have ", value"
        while (iter.hasNext())
            o.append(", ").append(iter.next());

        return o + "]";
    }

    public static void main(String args[]) {
        IterableList il = new IterableList();

        System.out.println("Adding values...\n" + il);
        il.insert(35);
        System.out.println(il);
        il.insert(100);
        System.out.println(il);
        il.insert(1024);
        System.out.println(il);
        il.insert(2048);
        System.out.println(il);

        System.out.println("\nUsing a for-each loop to print values...");
        for (int i : il)
            System.out.println(i);

        // Remove a middle.
        System.out.println("\nDeleting 100");
        il.delete(100);
        System.out.println(il);
        // Remove a head.
        System.out.println("\nDeleting 2048");
        il.delete(2048);
        System.out.println(il);
        // Remove the end.
        System.out.println("\nDeleting 35");
        il.delete(35);
        System.out.println(il);
    }
}

