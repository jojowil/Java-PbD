import java.util.NoSuchElementException;

public class ExerciseIntQueue {

    public static void main(String[] args) {
        IntQueue q = new IntQueue();

        q.enq(7);
        q.enq(5);
        q.enq(3);
        System.out.print("Queue contains:\n" + q);
        System.out.println("Queue length is " + q.size());

        while (! q.isEmpty()) {
            System.out.println("Dequeued " + q.deq());
        }

        // intentionally try to deq an empty queue
        try {
            System.out.println("Dequeued " + q.deq());
        } catch (NoSuchElementException e) {
            System.out.println("That could have been bad!");
        }
    }
}
