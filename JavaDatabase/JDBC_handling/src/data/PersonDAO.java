package data;

import domain.Person;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PersonDAO {

    private static final String SQL_SELECT = "SELECT " +
                                             "user_ID," +
                                             "firstName," +
                                             "lastName," +
                                             "email," +
                                             "phoneNumber," +
                                             "address" +
                                             " FROM users";

//    public List<Person> select() {
//        Connection connection = null;
//        PreparedStatement statement = null;
//        ResultSet result = null;
//        Person person = null;
//        List<Person> persons = new ArrayList<>();
//
//        try {
//            connection = data.Connection.getConnection();
//            statement = connection.prepareStatement(SQL_SELECT);
//            result = statement.executeQuery();
//            while (result.next()) {
//                int personID = result.getInt("user_ID");
//                String firstName = result.getString("firstName");
//                String lastName = result.getString("lastName")
//            }
//
//        } catch (SQLException e) {
//            e.printStackTrace(System.out);
//        }
//    }



}
