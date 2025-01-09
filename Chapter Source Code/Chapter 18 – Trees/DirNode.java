import java.util.ArrayList;
import java.util.List;

public class DirNode {
    private String name;
    private boolean dir;
    private boolean symlink;
    private String linkTarget;
    private List<DirNode> children;
    private DirNode parent;

    public DirNode(String name, boolean dir) {
        this.name = name;
        this.dir = dir;
        if ( dir )
            this.children = new ArrayList<DirNode>();
    }

    public boolean addDir(String value) {
        return addChild(value, true);
    }

    public boolean addFile(String value) {
        return addChild(value, false);
    }

    private boolean addChild(String value, boolean dir) {
        if (!hasChild(value)) {
            DirNode n = new DirNode(value, dir);
            n.setParent(this);
            children.add(n);
            return true;
        }
        return false;
    }

    private void setSymLink(String target) {
        symlink = true;
        linkTarget = target;
    }

    public boolean addSymLink(String target, String value) {
        if (!hasChild(value)) {
            DirNode n = new DirNode(value, false);
            n.setParent(this);
            n.setSymLink(target);
            children.add(n);
            return true;
        }

        return false;
    }

    public boolean removeFile(String value) {
        return removeChild(value, false);
    }

    public boolean removeDir(String value) {
        return removeChild(value, true);
    }

    private boolean removeChild(String value, boolean dir) {
        List<DirNode> list = getChildren();
        for (DirNode n : list)
            if (n.getName().equals(value)) {
                // remove a file
                if (!dir && !n.isDir())
                    return list.remove(n);
                else if (dir) {
                    // remove an empty directory
                    if ( n.isDir() && n.children.size() == 0)
                        return list.remove(n);
                }
            }
        // would really like more than boolean...
        return false;
    }

    public boolean hasChild(String value) {
        List<DirNode> list = getChildren();
        for (DirNode n : list)
            if (n.getName().equals(value))
                return true;

        return false;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DirNode getParent() {
        return this.parent;
    }

    public String getTarget() {
        return linkTarget;
    }

    public void setDir() {
        this.dir = true;
    }

    public void setParent(DirNode parent) {
        this.parent = parent;
    }

    public List getChildren() {
        return this.children;
    }

    public DirNode getChild(String value) {
        List<DirNode> list = getChildren();

        for (int i = 0; i < list.size(); i++) {
            DirNode n = list.get(i);
            if (n.getName().equals(value))
                return n;
        }

        return null;
    }

    @Override
    public boolean equals(Object obj) {
        if (null == obj)
            return false;

        if (obj instanceof DirNode) {
            if (((DirNode)obj).getName().equals(this.name))
                return true;
        }

        return false;
    }

    public boolean isDir() {
        return dir;
    }

    public boolean isSymLink() {
        return symlink;
    }

    public String fullPath() {
        DirNode p = this;
        String path="";
        if ( p.parent == null)
            return "/";

        while (p != null) {
            if (path.length() == 0)
                path = p.getName() + "";
            else
                path = p.getName() + "/" + path;
            p = p.getParent();
        }
        return path;
    }
}
