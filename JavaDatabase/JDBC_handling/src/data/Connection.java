package data;

import java.sql.*;

public class Connection {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/test";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "";

    public static java.sql.Connection getConnection() throws SQLException {
        return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
    }

    public static void close(ResultSet rs) throws SQLException {
        rs.close();
    }

    public static void close(Statement st) throws SQLException {
        st.close();
    }

    public static void close(PreparedStatement st) throws SQLException {
        st.close();
    }

    public static void close(Connection cn) throws CloneNotSupportedException {
        cn.close();
    }

}
