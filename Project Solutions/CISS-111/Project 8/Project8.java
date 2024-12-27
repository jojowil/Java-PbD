import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Project8 {

    public static void main(String[] args) throws SQLException {
        Connection mydb = DBSupport.getDBConn();
        ResultSet results;
        // test query for project 8
        String query = "select path,type from pathnames;";
        NAryTree fs = new NAryTree(new DirNode("", true));

        /* this is some test code for you! */
        boolean status = DBSupport.getMysqlStatus(mydb);
        System.out.println("DB status is " + (status ? "GOOD!" :"BAD!"));

        if (status) {
            results = mydb.createStatement().executeQuery(query);

            while (results.next()) {
                String path = results.getString("path");
                String type = results.getString("type");
                //System.out.println("Got path -> " + path + " as " + type);

                String[] parts = path.split("/");
                String dst = parts[parts.length - 1];
                DirNode cur = fs.getRoot();
                for ( int x = 1; x < parts.length - 1 && cur != null; x++) {
                    cur = cur.getChild(parts[x]);
                }
                if ( cur != null ) {
                    if ( type.equals("D") )
                        cur.addDir(dst);
                    else if ( type.equals("F") )
                        cur.addFile(dst);
                    else
                        System.out.println("Unknown file type " + type + " for " + path + ".");
                } else
                    System.out.println("Unable to create object " + dst + ". Path not found (" + path + ").");
            }
            System.out.println("\n\nTree:");
            fs.printTree();
        }
        /* END test code */

        DBSupport.closeDB(mydb);
    }
}
