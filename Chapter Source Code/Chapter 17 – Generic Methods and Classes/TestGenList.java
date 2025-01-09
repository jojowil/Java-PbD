public class TestGenListInt {

    public static void main(String[] args) {

        GenList<Integer> ll = new GenList<>();

        System.out.println("\nAdding 35, 78, 45 and 0 to the list");
        ll.insert(35);
        ll.insert(78);
        ll.insert(45);
        ll.insert(0);
        System.out.println(ll);

        System.out.println("\nRemoving 0 from head of list");
        ll.delete(0); // beginning
        System.out.println(ll);

        System.out.println("\nRemoving 78 from middle of list");
        ll.delete(78); // middle
        System.out.println(ll);

        System.out.println("\nRemoving 35 from end of list");
        ll.delete(35); // end
        System.out.println(ll);
    }
}
