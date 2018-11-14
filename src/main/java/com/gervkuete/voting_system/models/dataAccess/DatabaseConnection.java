
package com.gervkuete.voting_system.models.dataAccess;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


// this class contains a methods to connect to the database and to free resources
public class DatabaseConnection {

    private static final String LOGIN = "root";
    private static final String PASSWORD = "root";
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/Voting?useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

    // etablish connection with the database
    public static Connection getConnection() {
        Connection connection = null;
        try {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                throw new RuntimeException(ex);
            }
            connection = DriverManager.getConnection(DATABASE_URL, LOGIN, PASSWORD);
            return connection;
        } catch (SQLException se) {
           JOptionPane.showMessageDialog(null, se, "Message", JOptionPane.ERROR_MESSAGE);
            
        }
        return null;
    }

    //close connection and free resources
    public static void closeConnection(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }

    // close PreparedStatement
    public static void closePrepareStatement(Statement pstmt) {
        if (pstmt != null) {
            try {
                pstmt.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }

    // close ResultSet
    public static void closeResultSet(ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
}
