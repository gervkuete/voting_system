package com.gervkuete.voting_system.models.dataAccess;

import com.gervkuete.voting_system.models.Elector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Gervaislepetit
 */
// this class contains implementations of all abstract methods declared in DataAccesObject interface
public class ElectorDAO implements DataAccessObject<Elector> {

    // instance of this class that wil be used to access methods of this class from everywhere
    private static final ElectorDAO ElectorDAO = new ElectorDAO();

    public static ElectorDAO getElectorDAO() {
        return ElectorDAO;
    }

    @Override
    public Elector getElector(String log, String pass) {
        Connection con = DatabaseConnection.getConnection();
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            String sqlQuery = "SELECT * FROM Elector WHERE login=? and password=?";
            pstmt = con.prepareStatement(sqlQuery);
            pstmt.setString(1, log);
            pstmt.setString(2, pass);
            rs = pstmt.executeQuery();
            Elector elector;
            if (rs.next()) {
                elector = new Elector();
                elector.setId(rs.getInt("id"));
                elector.setName(rs.getString("name"));
                elector.setLogin(rs.getString("login"));
                elector.setPassword(rs.getString("password"));
                elector.setVoted(rs.getBoolean("voted"));
                return elector;
            }
        } catch (SQLException se) {
            throw new RuntimeException(se);
        }
        return null;
    }

    @Override
    public List<Elector> getAllElectors() {
        Connection con = DatabaseConnection.getConnection();
        Statement stmt = null;
        ResultSet rs = null;

        List<Elector> electors = new ArrayList<>();
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT * FROM Elector");

            while (rs.next()) {
                Elector elector = new Elector();
                elector.setId(rs.getInt("id"));
                elector.setName(rs.getString("name"));
                elector.setLogin(rs.getString("login"));
                elector.setPassword(rs.getString("password"));
                electors.add(elector);
            }
        } catch (SQLException se) {
            throw new RuntimeException(se);
        } finally {
            DatabaseConnection.closeResultSet(rs);
            DatabaseConnection.closePrepareStatement(stmt);
            DatabaseConnection.closeConnection(con);
        }
        return electors;
    }

    @Override
    public int insertElector(String name, String login, String password, boolean voted) {
        Connection con = DatabaseConnection.getConnection();
        PreparedStatement pstmt = null;
        Statement stm = null;
        ResultSet rs = null;
        int count;
        try {
            String sqlQuery = "INSERT INTO User_t (name, login, password) VALUES (?, ?, ?)";
            pstmt = con.prepareStatement(sqlQuery);
            pstmt.setString(1, name);
            pstmt.setString(2, login);
            pstmt.setString(3, password);
            count = pstmt.executeUpdate();

            // get value of the column of the last insert
            String getValue = "SELECT LAST_INSERT_ID()";
            stm = con.createStatement();
            int insertedId = 0;
            rs = stm.executeQuery(getValue);
            if (rs.next()) {
                insertedId = rs.getInt(1);
            }

            String sql = "INSERT INTO Elector_t (voted, User_Id) VALUES (?, ?)";
            pstmt = con.prepareStatement(sql);
            pstmt.setBoolean(1, voted);
            pstmt.setInt(2, insertedId);
            pstmt.executeUpdate();

            return count;
        } catch (SQLException se) {
            throw new RuntimeException(se);
        } finally {
            DatabaseConnection.closeResultSet(rs);
            DatabaseConnection.closePrepareStatement(stm);
            DatabaseConnection.closeConnection(con);

        }

    }

    @Override
    public void updateElector(Elector elector) {
        Connection con = DatabaseConnection.getConnection();
        PreparedStatement pstmt = null;
        int count;
        try {
            String sqlQuery = "UPDATE User_t SET name=?, login=?, password=? WHERE id=?";
            pstmt = con.prepareStatement(sqlQuery);
            pstmt.setString(1, elector.getName());
            pstmt.setString(2, elector.getLogin());
            pstmt.setString(3, elector.getPassword());
            pstmt.setBoolean(4, elector.isVoted());
            count = pstmt.executeUpdate();
            if (count == 1) {
                JOptionPane.showMessageDialog(null, "Elector updated sucessfuly", "Message", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException se) {
            throw new RuntimeException(se);
        } finally {
            DatabaseConnection.closeConnection(con);
            DatabaseConnection.closePrepareStatement(pstmt);
        }
    }

    @Override
    public int deleteElector(String login) {
        PreparedStatement pstmt = null;
        Connection con = DatabaseConnection.getConnection();
        int count;
        try {
            String sql = "DELETE FROM User_t WHERE login=?";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, login);
            count = pstmt.executeUpdate();

        } catch (SQLException se) {
            throw new RuntimeException(se);
        }
        return count;
    }

}
