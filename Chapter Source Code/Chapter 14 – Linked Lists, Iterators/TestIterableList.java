public class TestIterableList {

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
        for ( int i : il )
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
