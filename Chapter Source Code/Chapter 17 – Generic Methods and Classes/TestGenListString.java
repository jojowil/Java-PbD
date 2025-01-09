public class TestGenListString {

    public static void main(String[] args) {

        GenList<String> ll = new GenList<String>();

        System.out.println("\nAdding Blue, Red, Orange and Green to the list");
        ll.insert("Blue");
        ll.insert("Red");
        ll.insert("Orange");
        ll.insert("Green");
        System.out.println(ll);

        System.out.println("\nRemoving Green from head of list");
        ll.delete("Green"); // beginning
        System.out.println(ll);

        System.out.println("\nRemoving Red from middle of list");
        ll.delete("Red"); // middle
        System.out.println(ll);

        System.out.println("\nRemoving Blue from end of list");
        ll.delete("Blue"); // end
        System.out.println(ll);
    }
}
