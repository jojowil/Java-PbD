import java.util.NoSuchElementException;

public class ExerciseIntDeque {

    public static void main(String[] args) {
        IntDeque d = new IntDeque();
        int x;

        d.addLast(7);
        d.addLast(5);
        d.addLast(3);
        d.addFirst(13);
        d.addFirst(15);
        d.addFirst(17);
        System.out.print("Deque contains:\n" + d);
        System.out.println("Deque length is " + d.size());

        x = 0;
        while ( x < 3 ) {
            System.out.println("Dequeued from front " + d.removeFirst());
            x++;
        }

        System.out.print("Deque contains:\n" + d);

        x = 0;
        while ( x < 3 ) {
            System.out.println("Dequeued from end " + d.removeLast());
            x++;
        }

    /*
    x = 0;
    while ( x < 3 ) {
      System.out.println("Dequeued from front " + d.removeFirst());
      x++;
    }
    */

        System.out.print("Deque contains:\n" + d);

        // intentionally try to deq an empty deqque
        try {
            System.out.println("Dequeued from front " + d.removeFirst());
        } catch (NoSuchElementException e) {
            System.out.println("That could have been bad!");
        }

        // intentionally try to deq an empty deque
        try {
            System.out.println("Dequeued fron end " + d.removeLast());
        } catch (NoSuchElementException e) {
            System.out.println("That could have been bad!");
        }
    }
}
