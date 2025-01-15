import java.util.EmptyStackException;

public class IntStack {
    // the top of the stack
    private Node top;
    private int size;

    private class Node {
        private int data;
        private Node next;

        private Node(int item) {
            data = item;
            next = null;
        }
    }

    public IntStack() {
        top = null;
        size = 0;
    }

    // returns the top value or exception when empty.
    public int peek() {
        if (isEmpty())
            throw new EmptyStackException();
        else
            return top.data;
    }

    // push new item on the top
    public void push(int item) {
        Node n = new Node(item);
        n.next = top;
        top = n;
        size++;
    }

    // remove item from the top and return the removed value.
    public int pop() {
        int v;
        if (isEmpty())
            throw new EmptyStackException();
        v = top.data;
        top = top.next;
        size--;
        return v;
    }

    // debug method to dump the contents of the stack to the screen
    public String toString() {
        Node p = top;
        String s = "";

        while (p != null) {
            s = s + p.data + "\n";
            p = p.next;
        }
        return s;
    }

    // method to determine if the stack is empty.
    public boolean isEmpty() {
        return top == null;
    }

    // method to return the number of frames
    public int size() {
        return size;
    }

    public static void main(String[] args) {
        IntStack s = new IntStack();

        s.push(7);
        s.push(5);
        s.push(3);
        System.out.println("Stack length is " + s.size());
        System.out.println("Stack contains:\n" + s);

        while (!s.isEmpty()) {
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
