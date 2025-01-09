import java.util.List;

public class NAryTree {

    private DirNode root;

    // Tree constructor
    public NAryTree(DirNode root) {
        this.root = root;
        root.setDir();
    }

    public DirNode getRoot() {
        return root;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void printTree() {
        System.out.println("/");
        printTree(root, 1);
    }

    private void printTree(DirNode n, int l) {

        List<DirNode> list = n.getChildren();

        for (DirNode o : list) {
            if (l >0) {
                for ( int x = 0; x < l; x++)
                    System.out.print("  ");
            }
            //System.out.println("isSymlink()" + o.isSymLink());
            if ( o.isSymLink() )
                System.out.println(o.getName() + " -> " + o.getTarget());
            else
                System.out.println(o.getName() + (o.isDir() ? " (DIR)" : " (FILE)"));
            if (o.isDir())
                printTree(o, l+1);
        }
    }
}
