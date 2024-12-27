import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBSupport {

    /**
     * Gets a database connection
     * @return a Connection object or null on error
     */
    public static Connection getDBConn() {
        Connection mdb;
        String userName="ciss111p8", password="ciss111p8";

        String url = "jdbc:mysql://crammit.in:7070/ciss111p8";
        try {
            mdb = DriverManager.getConnection(url +
                    "?user="+ userName + "&password=" + password);
            return mdb;
        } catch (SQLException ex) {
            // handle any errors
            System.err.println("SQLException: " + ex.getMessage());
            System.err.println("SQLState: " + ex.getSQLState());
            System.err.println("VendorError: " + ex.getErrorCode());
            return null;
        }
    }

    /**
     * Gets the open status of a Connection object.
     * @param mdb the MySQL database object
     * @return true if connection is open
     */
    public static boolean getMysqlStatus(Connection mdb) {
        if ( mdb != null )
            try {
                return !mdb.isClosed();
            } catch (SQLException e) {
                return false;
            }
        return false;
    }

    /**
     * Closes a database connection.
     * @param mdb the Connection objet to be closed
     */
    public static void closeDB(Connection mdb) {
        try {
            if ( mdb != null && !mdb.isClosed() )
                mdb.close();
        } catch (SQLException e) {
            System.err.println("Failed closing MySQL connection.");
        }
    }
}
