import java.util.Scanner;

public class Directories {

    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {
        DirNode root = new DirNode("", true);
        NAryTree fs = new NAryTree(root);
        DirNode cwd = fs.getRoot();

        System.out.print("cmd> ");
        while (kb.hasNext()) {
            // get the command
            String line = kb.nextLine(), dst;

            // get parts
            String[] parts = line.split("\\s+");
            if (parts.length > 0) {
                String cmd = parts[0];
                switch (cmd) {

                    case "mkdir":
                        //if parts
                        dst = parts[1];
                        if (!cwd.addDir(dst))
                            System.out.println("Object \"" + cwd.getChild(dst).fullPath() + "\" exists.");
                        break;

                    case "rmdir":
                        dst = parts[1];
                        // determine if we can remove
                        DirNode c = cwd.getChild(dst);
                        if ( c == null )
                            System.out.println("Object \"" + dst + "\" does not exist.");
                        else if (!c.isDir())
                            System.out.println("Object \"" + dst + "\" is not a directory.");
                        else if (!cwd.removeDir(dst))
                            System.out.println("Directory \"" + dst + "\" is not empty.");
                        break;

                    case "ln":
                        String path = parts[1];
                        dst = parts[2];
                        cwd.addSymLink(path, dst);
                        break;

                    case "rm":
                        dst = parts[1];
                        if (!cwd.removeFile(dst))
                            System.out.println("Object \"" + dst + "\" does not exist.");
                    case "rmpath":
                        break;

                    case "tree":
                        fs.printTree();
                        break;

                    case "touch":
                        dst = parts[1];
                        if (!cwd.addFile(dst))
                            System.out.println("Object \"" + cwd.getChild(dst).fullPath() + "\" exists.");
                        break;

                    //case "up":

                    case "cd":
                        if (parts.length == 1)
                            cwd = fs.getRoot();
                        else if ( parts[1].equals("..")) {
                            cwd = cwd.getParent();
                        }
                        else {
                            dst = parts[1];
                            if ( cwd.hasChild(dst)) {
                                DirNode d = cwd.getChild(dst);
                                if (d.isDir())
                                    cwd = d;
                                else {
                                    System.out.println(dst + " is not a directory.");
                                }
                            } else {
                                System.out.println("The directory \"" + dst + "\" does not exist.");
                            }
                        }
                        break;

                    case "pwd":
                        System.out.println(cwd.fullPath());
                        break;

                    case "quit":
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Unknown command: \"" + cmd);
                        break;
                }
            }
            System.out.print("cmd> ");

        }
    }
}
