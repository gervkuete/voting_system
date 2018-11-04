package com.gervkuete.voting_system.models;

import com.gervkuete.voting_system.models.dataAccess.DatabaseConnection;
import com.gervkuete.voting_system.views.VotePage;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Elector extends User {

    private boolean voted;

    public Elector() {

    }

    public Elector(int id, String name, String login, String password, boolean voted) {
        super(id, name, login, password);
        this.voted = voted;
    }

    public boolean isVoted() {
        return voted;
    }

    public void setVoted(boolean voted) {
        this.voted = voted;
    }

    Connection con = DatabaseConnection.getConnection();
    PreparedStatement pstm = null;
    ResultSet rs = null;

    // log into the system 
    @Override
    public boolean enter(String login, String password) {

        String sql = "SELECT login, password FROM Elector WHERE login=? and password=?";
        boolean authorized = false;
        try {
            pstm = con.prepareStatement(sql);
            pstm.setString(1, login);
            pstm.setString(2, password);
            rs = pstm.executeQuery();

            authorized = rs.next();
        } catch (SQLException ex) {
            Logger.getLogger(Elector.class.getName()).log(Level.SEVERE, null, ex);
        }

        return authorized;
    }

    // vote for a candidate 
    public void vote() {
        if (this.isVoted()) {
            JOptionPane.showMessageDialog(null, "You can't vote twice!", "Mesage", JOptionPane.INFORMATION_MESSAGE);
        } else {

            int yesOrNo = JOptionPane.showConfirmDialog(null, "Do you really wish to vote this candidate ?", "Confirm vote", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (yesOrNo == 0) {
                VotePage.selectedCandidate.addVoice();
                String name = this.getName();
                int id = 0;
                String sql = "SELECT Id FROM user_t WHERE name = ?";
                try {
                    pstm = con.prepareStatement(sql);
                    pstm.setString(1, name);
                    rs = pstm.executeQuery();
                    if (rs.next()) {
                        id = rs.getInt("Id");
                    }
                    
                    String updateStatus = "UPDATE elector_t SET voted = " + true + "WHERE user_Id = ?";
                    pstm = con.prepareStatement(updateStatus);
                    pstm.setInt(1, id);
                    int count = pstm.executeUpdate();
                    if (count == 1) {
                        JOptionPane.showMessageDialog(null, "Thank you for voting\n Good bye!", "Message", JOptionPane.INFORMATION_MESSAGE);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Elector.class.getName()).log(Level.SEVERE, null, ex);
                } finally {
                    DatabaseConnection.closeResultSet(rs);
                    DatabaseConnection.closePrepareStatement(pstm);
                    DatabaseConnection.closeConnection(con);

                }

            }
        }

    }
}
