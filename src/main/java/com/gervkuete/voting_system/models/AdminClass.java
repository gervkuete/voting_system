/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gervkuete.voting_system.models;

import com.gervkuete.voting_system.models.dataAccess.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gervaislepetit
 */
public class AdminClass extends User {

    @Override
    public boolean enter(String login, String password) {
        Connection con = DatabaseConnection.getConnection();
        PreparedStatement pstm = null;
        ResultSet rs = null;
        String sql = "SELECT login, password FROM Admin WHERE login=? and password=?";
        boolean authorized = false; 
        try {
            pstm = con.prepareStatement(sql);
            pstm.setString(1, login);
            pstm.setString(2, password);
            rs = pstm.executeQuery();
            
            authorized = rs.next();
        } catch (SQLException ex) {
            Logger.getLogger(AdminClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return authorized;
    }
}
