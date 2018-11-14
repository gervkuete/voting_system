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
public class Candidate {

    private int id;
    private String name;
    private String picture;
    private String aboutCandidate;
    private int voices;

    public Candidate() {
    }

    public Candidate(int id, String name, int voices, String aboutCandidate, String picture) {
        this.id = id;
        this.name = name;
        this.picture = picture;
        this.aboutCandidate = aboutCandidate;
        this.voices = voices;
    }

    // add candidate voices 
    public void addVoice() {
        Connection con = DatabaseConnection.getConnection();
        PreparedStatement pstm = null;
        ResultSet rs = null;
        int increaseVoices = 0;
        String getVoices = "SELECT voices FROM candidate WHERE name = ?";
        try {
            pstm = con.prepareStatement(getVoices);
            pstm.setString(1, this.name);
            rs = pstm.executeQuery();
            if (rs.next()) {
                increaseVoices = rs.getInt("Voices");
                increaseVoices++;

                String updateVoices = "UPDATE candidate SET voices = " + increaseVoices + " WHERE name = ?";
                pstm = con.prepareStatement(updateVoices);
                pstm.setString(1, this.name);
                pstm.executeUpdate();

            }

        } catch (SQLException ex) {
            Logger.getLogger(Candidate.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            DatabaseConnection.closeResultSet(rs);
            DatabaseConnection.closePrepareStatement(pstm);
            DatabaseConnection.closeConnection(con);
        }

    }

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

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getAboutCandidate() {
        return aboutCandidate;
    }

    public void setAboutCandidate(String aboutCandidate) {
        this.aboutCandidate = aboutCandidate;
    }

    public int getVoices() {
        return voices;
    }

    @Override
    public String toString() {
        return name + " " + voices;
    }

}
