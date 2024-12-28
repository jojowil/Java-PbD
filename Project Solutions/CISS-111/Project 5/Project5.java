import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class Project5 {

    public static void main (String[] args) throws SQLException,FileNotFoundException {

        OrderedList l = new OrderedList();
        PrintWriter outFile;
        Connection mydb = DBSupport.getDBConn();
        ResultSet results;

        outFile = new PrintWriter(args[0]);

        boolean status = DBSupport.getMysqlStatus(mydb);
        System.out.println("DB status is " + (status ? "GOOD!" :"BAD!"));

        if (status) {
            String query = "select word from wordsToInsert;";
            results = mydb.createStatement().executeQuery(query);

            while (results.next()) {
                String word = results.getString("word");
                l.insert(word);
            }

            query = "select word from wordsToDelete;";
            results = mydb.createStatement().executeQuery(query);
            while (results.next()) {
                String word = results.getString("word");
                l.delete(word);
            }
        }

        for (String item : l)
            outFile.println(item);
        outFile.close();
    }

}
