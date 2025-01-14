public class LinkedList {

    private Node head;

    private class Node {
        private int data;
        private Node next;

        private Node(int item) {
            data = item;
            next = null;
        }
    }

    // start with an emply list
    public LinkedList() {
        head = null;
    }

    // display list of nodes pointed to by head.
    public void dumplist() {
        Node p = head;

        while (p != null) {
            System.out.print(p.data + " ");
            p = p.next;
        }
        System.out.println();
    }

    public void insert(int item) {
        // insert node to the head of the chain

  /*
             +-----+
     ------> |   | | <--- n
     |       +-----+
     |            |
     |            |
     |            V
     |           +-----+    +-----+
  head ---XXX--> |   | |--> |   |\|
                 +-----+    +-----+

  Head points to current chain. Create new n.
  Set n.next to point to same node as head.
  Set head to point to new node.
  */

        Node n = new Node(item);

        n.next = head;
        head = n;
    }

    public void delete(int item) {

        // remove node that contains item

    /*


                   back       cur
                    |          |
                    V          V
                   +-----+    +-----+    +-----+    +-----+
    head --------> |   | |-XX | X | |--> |   | |--> |   |\|
                   +-----+    +-----+    +-----+    +-----+
                        |                   ^
                        |                   |
                         -------------------

    Head points to current chain.
    cur and back walk the chain until we find node
      to be deleted.
    Set head or back.next to point to same node as cur.next.

    */

        Node cur = head, back = null;

        while (cur != null) {
            if (cur.data == item) {
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

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();

        System.out.println("\nAdding 35, 78, 45 and 0 to the list");
        ll.insert(35);
        ll.insert(78);
        ll.insert(45);
        ll.insert(0);
        ll.dumplist();

        System.out.println("\nRemoving 0 from head of list");
        ll.delete(0); // beginning
        ll.dumplist();

        System.out.println("\nRemoving 78 from middle of list");
        ll.delete(78); // middle
        ll.dumplist();

        System.out.println("\nRemoving 35 from end of list");
        ll.delete(35); // end
        ll.dumplist();
    }
}
