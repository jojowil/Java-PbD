import java.util.Scanner;

public class ListOfNodes {

    private static class Node {
        private String data;
        private Node next;

        // Node constructor
        private Node(String item) {
            data = item;
            // not pointing to another node, yet
            next = null;
        }
    }

    public static Scanner kb = new Scanner(System.in);

    /**
     * Dump nodes pointed to by list
     *
     * @param list
     */
    public static void dumplist(Node list) {
        Node p;

        p = list;
        System.out.println("\nList Contents:");
        while (p != null) {
            System.out.print(p.data + " ");
            p = p.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = null, n;
        String w;

        System.out.print("Enter a word: ");
        while (kb.hasNext()) {
            w = kb.next();

            // create new Node
            n = new Node(w);

            // assign the next field to point to
            // what head is currently pointing to
            n.next = head;
            // make the new node the head
            head = n;

            dumplist(head);
            System.out.print("\nEnter a word: ");
        }
    }
}
