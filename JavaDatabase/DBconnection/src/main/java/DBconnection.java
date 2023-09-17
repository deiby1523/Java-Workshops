import java.sql.*;

public class DBconnection {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/test?user=root&password=";

        try {
            Connection connection = DriverManager.getConnection(url);
            // The connection has been successfully established
            System.out.println("Successful connection to the database.");

            // A test query
            Statement sentence = connection.createStatement();
            String sql = "SELECT * FROM users";
            ResultSet result = sentence.executeQuery(sql);
            while (result.next()) {
                System.out.print("id: " + result.getInt("id"));
                System.out.print(" name: " + result.getString("name"));
                System.out.print(" phone: " + result.getString("phoneNumber"));
                System.out.println(" address: " + result.getString("address"));
            }
            result.close();
            sentence.close();
            connection.close();
        } catch (SQLException e) {
            System.err.println("Error connecting to the database: " + e.getMessage());
        }
    }
}
