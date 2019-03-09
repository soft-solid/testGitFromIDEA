import java.sql.*;

public class Main {

    public static void connect() {
        Connection conn = null;
        try {

            // db parameters
            String url = "jdbc:sqlite:C:/sqlite/DB/test.db";
            String sqlQuery = "Select name From Products";

            // create a connection to the database
            conn = DriverManager.getConnection(url);
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(sqlQuery);

            while (rs.next()) {
                System.out.println(rs.getString("name"));
            }

            System.out.println("Connection to SQLite has been established.");
            System.out.println("Connection to SQLite has been established.");


        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public static void main(String[] args) {

        connect();

        System.out.println("Hello World!");
    }
}
