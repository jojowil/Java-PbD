import java.util.*;

public class IntTree {

    Node root;

    // Node to implement two paths: left and right
    private class Node {
        int data;
        Node left, right;

        public Node (int item) {
            data = item;
            left = null;
            right = null;
        }
    }

    // insert item into a tree root.
    public void insert(int item) {
        Node n, p, back;

        n = new Node(item);
        p = root;
        back = null;

        while (p != null) {
            back = p;
            if (p.data > item)
                p = p.left;
            else
                p = p.right;
        }

        if (back == null )
            root = n;
        else {
            if (back.data > item)
                back.left = n;
            else
                back.right = n;
        }
    }

    // delete item from a tree
    public void delete(int item) {
        Node tdb, tbdback = null, back = null, p = root, temp;

        // find the node to delete.
        while ( p != null ) {
            if ( p.data == item )
                break;
            back = p;
            if (p.data > item)
                p = p.left;
            else
                p = p.right;
        }

        // not found - nothing to do
        if ( p == null )
            throw new NoSuchElementException();

        // save our place
        tbdback = back;
        tdb = p;

        // Case of 0 or 1 child
        if ( p.right == null )
            p = p.left;
        else if ( p.left == null )
            p = p.right;
            // two children
        else {
            temp = p.left;
            back = p;

            // find largest value less than one being deleted
            while ( temp.right != null ) {
                back = temp;
                temp = temp.right;
            }
            // move the data
            p.data = temp.data;
            // relink tree removing the node used for replacement
            if ( back == p )
                back.left = temp.left;
            else
                back.right = temp.left;
        }

        // were we deleting the root?
        if ( tdb == root )
            root = p;
        else if (tbdback.left == tdb)
            tbdback.left = p;
        else
            tbdback.right = p;

    }

    public boolean search(int item) {
        Node p = root;

        while (p != null) {
            if (p.data == item) {
                return true;
            } else if (p.data > item)
                p = p.left;
            else p = p.right;
        }
        return false;
    }

    public void prettytree() {
        prettytree2(root, 0);
    }

    private void prettytree2(Node r, int i) {
        String s = "";
        if ( r == null && i == 0 )
            System.out.println("EMPTY");

        if ( r != null ) {
            prettytree2(r.right, i + 4);
            for (int x = 0; x < i; x++)
                s = s + " ";
            System.out.print(s);
            System.out.println(r.data);
            prettytree2(r.left, i + 4);
        }
    }

    public void inorder() {
        inorder2(root);
    }

    public static void inorder2(Node r) {
        if ( r != null ) {
            inorder2(r.left);
            System.out.print(r.data + " ");
            inorder2(r.right);
        }
    }

    public void preorder() {
        preorder2(root);
    }

    private void preorder2(Node r) {
        if ( r != null ) {
            System.out.print(r.data + " ");
            preorder2(r.left);
            preorder2(r.right);
        }
        System.out.println();
    }

    public void postorder() {
        postorder2(root);
    }

    private void postorder2(Node r) {
        if ( r != null ) {
            postorder2(r.left);
            postorder2(r.right);
            System.out.print(r.data + " ");
        }
    }

    public static void main(String[] args) {
        int x;
        IntTree tree = new IntTree();
        int[] in = {9,3,5,7,11,1,75,68,70};
        int[] out = {7,68,75,3,9,11};

        /*
         * The data sets up a tree to test removal of nodes with
         * no children (7), one child right (68), one child left (75),
         * two children (3) and the root (9).
         */
        for (x = 0; x < in.length; x++) {
            tree.insert(in[x]);
            tree.prettytree();
            System.out.println("==========");
        }

        System.out.println("\nSearching for  75 : " + tree.search(75));
        System.out.println("Searching for 100 : " + tree.search(100) + "\n");
        System.out.println("==========");

        for (x = 0; x < out.length; x++) {
            tree.delete(out[x]);
            tree.prettytree();
            System.out.println("==========");
        }
    }
}
