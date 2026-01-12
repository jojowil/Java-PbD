import java.util.Iterator;

public class IterableList2 implements Iterable<Integer> {
    private Node head;

    // This is the requirement of implementing Iterable. Provide
    // an iterator() method that returns an Iterator object.
    public Iterator<Integer> iterator() {
        return new LLIterator();
    }

    // This is what the iterator() returns to the caller.
    // This is the iterator object that processes the list.
    private class LLIterator implements Iterator<Integer> {
    /* We are using three pointers to be able to delete the node
       of the currently returned value.
    */

        // next is the next node to be requested.
        private Node next = head,
        // the current node (and value) sent by next().
        current = null,
        // the previous node.
        back = null;

        private boolean nextCalled = false;

        // next performs the task of current from the previous version
        public boolean hasNext() {
            return next != null;
        }

        public Integer next() {
            int item = next.data;
            back = current;
            current = next;
            next = next.next;
            nextCalled = true; // safe to do remove()!
            return item;
        }

        /*


                       back       cur        next
                        |          |          |
                        V          V          V
                       +-----+    +-----+    +-----+    +-----+
        head --------> |   | |-XX | X | |--> |   | |--> |   |\|
                       +-----+    +-----+    +-----+    +-----+
                            |                   ^
                            |                   |
                             -------------------

        Head points to current chain.
        next, cur, back walk the chain until we find node
          to be deleted.
        The remove() method fixes head or back.next to point to same
          node as cur.next.

        */
        public void remove() {
            if (nextCalled) {
                if (back == null)
                    head = current.next;
                else
                    back.next = next;
                nextCalled = false; // reset!
            } else {
                throw new IllegalStateException();
            }
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

    public IterableList2() {
        head = null;
    }

    public void insert(int item) {
        Node n = new Node(item);
        n.next = head;
        head = n;
    }

    public void delete(int item) {
        Iterator<Integer> iter = iterator();

        while (iter.hasNext())
            if (item == iter.next()) {
                iter.remove();
                break;
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

    public static void main(String[] args) {
        IterableList2 il = new IterableList2();

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