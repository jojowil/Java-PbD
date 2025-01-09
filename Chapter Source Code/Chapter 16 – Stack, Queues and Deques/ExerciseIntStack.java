import java.util.EmptyStackException;

public class ExerciseIntStack

public static void main(String[] args) {
    IntStack s = new IntStack();

    s.push(7);
    s.push(5);
    s.push(3);
    System.out.println("Stack length is " + s.size());
    System.out.println("Stack contains:\n" + s);

    while (! s.isEmpty()) {
        System.out.println("Popped " + s.pop());
    }

    // intentionally try to pop an empty stack
    try {
        System.out.println("Popped " + s.pop());
    } catch (EmptyStackException e) {
        System.out.println("That could have been bad!");
    }
}
}
