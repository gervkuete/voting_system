package com.gervkuete.voting_system.models.dataAccess;

import com.gervkuete.voting_system.models.Elector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


// this class contains implementations of all abstract methods declared in DataAccesObject interface
public class ElectorDAO implements DataAccessObject<Elector> {

    Connection con = DatabaseConnection.getConnection();
    PreparedStatement pstm = null;
    Statement stm = null;
    ResultSet rs = null;
    
    
    // instance of this class that wil be used to access methods of this class from everywhere
    private static final ElectorDAO ElectorDAO = new ElectorDAO();

    public static ElectorDAO getElectorDAO() {
        return ElectorDAO;
    }

    @Override
    public Elector getElector(String log, String pass) {

        try {
            String sqlQuery = "SELECT * FROM Elector WHERE login=? and password=?";
            pstm = con.prepareStatement(sqlQuery);
            pstm.setString(1, log);
            pstm.setString(2, pass);
            rs = pstm.executeQuery();
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

        List<Elector> electors = new ArrayList<>();
        try {
            stm = con.createStatement();
            rs = stm.executeQuery("SELECT * FROM Elector");

            while (rs.next()) {
                Elector elector = new Elector();
                elector.setId(rs.getInt("id"));
                elector.setName(rs.getString("name"));
                elector.setLogin(rs.getString("login"));
                elector.setPassword(rs.getString("password"));
                elector.setVoted(rs.getBoolean("voted"));
                electors.add(elector);
            }
        } catch (SQLException se) {
            throw new RuntimeException(se);
        }
        return electors;
    }

    @Override
    public int insertElector(String name, String login, String password, boolean voted) {
        int count;
        try {
            String sqlQuery = "INSERT INTO User_t (name, login, password) VALUES (?, ?, ?)";
            pstm = con.prepareStatement(sqlQuery);
            pstm.setString(1, name);
            pstm.setString(2, login);
            pstm.setString(3, password);
            count = pstm.executeUpdate();

            // get id of  of the last insert
            String getValue = "SELECT LAST_INSERT_ID()";
            stm = con.createStatement();
            int insertedId = 0;
            rs = stm.executeQuery(getValue);
            if (rs.next()) {
                insertedId = rs.getInt(1);
            }

            String sql = "INSERT INTO Elector_t (voted, User_Id) VALUES (?, ?)";
            pstm = con.prepareStatement(sql);
            pstm.setBoolean(1, voted);
            pstm.setInt(2, insertedId);
            pstm.executeUpdate();

            return count;
        } catch (SQLException se) {
            throw new RuntimeException(se);
        }
    }

    @Override
    public int deleteElector(int id) {
        int count = 0;
        int count2 = 0;
        int value = 0;
        try {
            String sql = "DELETE FROM elector_t WHERE user_Id = ?";
            pstm = con.prepareStatement(sql);
            pstm.setInt(1, id);
            count = pstm.executeUpdate();
            
            String deleteUser = "DELETE FROM user_t WHERE Id = ?";
            pstm = con.prepareStatement(deleteUser);
            pstm.setInt(1, id);
            count2 = pstm.executeUpdate();
            if (count > 0 && count2 > 0)
                value = 1;
            

        } catch (SQLException se) {
            throw new RuntimeException(se);
        }
        return value;
    }

}
