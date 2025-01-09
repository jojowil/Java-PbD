public class TestLinkedList {

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
