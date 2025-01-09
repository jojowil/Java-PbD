public class TestGenListTime {

    public class Main {

        public static void main(String[] args) {

            GenList<Time> ll = new GenList<>();
            Time clock1 = new Time(11, 35, 0);
            Time clock2 = new Time(0, 0, 0);
            Time clock3 = new Time(16, 0, 0);
            Time clock4 = new Time(23, 59, 59);

            System.out.printf("Adding %s, %s, %s & %s to the list.%n", clock1, clock2, clock3, clock4);
            ll.insert(clock1);
            ll.insert(clock2);
            ll.insert(clock3);
            ll.insert(clock4);
            System.out.println(ll);

            System.out.printf("\nRemoving %s from head of list%n", clock4);
            ll.delete(clock4); // beginning
            System.out.println(ll);

            System.out.printf("\nRemoving %s from middle of list%n", clock2);
            ll.delete(clock2); // middle
            System.out.println(ll);

            System.out.printf("\nRemoving %s from end of list%n", clock1);
            ll.delete(clock1); // end
            System.out.println(ll);
        }
    }
