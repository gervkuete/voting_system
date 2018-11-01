package com.gervkuete.voting_system.models;

import com.gervkuete.voting_system.models.dataAccess.DatabaseConnection;
import com.gervkuete.voting_system.models.dataAccess.ElectorDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class User {

    private int id;
    private String name;
    private String login;
    private String password;

    // constructors of this class
    public User() {
    }

    public User(int id, String name, String login, String password) {
        this.id = id;
        this.name = name;
        this.login = login;
        this.password = password;
    }

    @Override
    public String toString() {
        return +id + " " + name + " " + login;
    }

    // check if the user is authorized to access the system.
    public boolean enter(String login, String password) {
        Connection con = DatabaseConnection.getConnection();
        PreparedStatement pstm = null;
        ResultSet rs = null;
        String sql = "SELECT login, password FROM User_t WHERE login=? and password=?";
        try {
            pstm = con.prepareStatement(sql);
            pstm.setString(1, login);
            pstm.setString(2, password);
            rs = pstm.executeQuery();

            return rs.next();
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;

    }

    // getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
