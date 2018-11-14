package com.gervkuete.voting_system.views;

import com.gervkuete.voting_system.models.Candidate;
import com.gervkuete.voting_system.models.Elector;
import com.gervkuete.voting_system.models.VotingSystem;
import com.gervkuete.voting_system.models.dataAccess.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class VotePage extends javax.swing.JFrame {

    public VotePage() {
        initComponents();
        loadElections();
    }

    Connection con = DatabaseConnection.getConnection();
    PreparedStatement pstm = null;
    Statement smt = null;
    ResultSet rs = null;
    DefaultListModel model = new DefaultListModel();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pannel1 = new javax.swing.JPanel();
        lblForVote = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listOfElections = new javax.swing.JList();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listCandidates = new javax.swing.JList();
        lblChosenCandidate = new javax.swing.JLabel();
        lblImage = new javax.swing.JLabel();
        btnVote = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pannel1.setBorder(javax.swing.BorderFactory.createTitledBorder("list of elections"));

        lblForVote.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblForVote.setText("Choose election to vote for");

        listOfElections.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listOfElections.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listOfElectionsMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(listOfElections);

        javax.swing.GroupLayout pannel1Layout = new javax.swing.GroupLayout(pannel1);
        pannel1.setLayout(pannel1Layout);
        pannel1Layout.setHorizontalGroup(
            pannel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pannel1Layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(lblForVote)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pannel1Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        pannel1Layout.setVerticalGroup(
            pannel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pannel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(lblForVote)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
                .addGap(88, 88, 88))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        listCandidates.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listCandidates.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listCandidatesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(listCandidates);

        lblChosenCandidate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblChosenCandidate.setText("Chosen candidate");

        btnVote.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnVote.setText("Vote");
        btnVote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVote, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblChosenCandidate))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblChosenCandidate)
                        .addGap(18, 18, 18)
                        .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnVote)))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jMenu2.setText("Results");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jMenuItem2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem2.setText("View results");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        jMenu1.setText("Logout");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem1.setText("Disconnect");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(pannel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(97, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pannel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator1))))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
DefaultListModel model2 = new DefaultListModel();

// fetch candidates for an election and show it in list
    private void listOfElectionsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listOfElectionsMouseClicked

        String selected = (String) listOfElections.getSelectedValue();
        candidateNames.clear();
        String sql = "SELECT Id FROM Polls WHERE title=?";

        try {
            int selectedElectionId = 0;
            pstm = con.prepareStatement(sql);
            pstm.setString(1, selected);
            rs = pstm.executeQuery();
            rs.next();
            selectedElectionId = rs.getInt("Id");

            String getCandidateId = "SELECT * FROM candidate_polls WHERE Polls_Id=?";
            ArrayList<Integer> candidateId = new ArrayList<>();
            pstm = con.prepareStatement(getCandidateId);
            pstm.setInt(1, selectedElectionId);
            rs = pstm.executeQuery();
            while (rs.next()) {
                candidateId.add(rs.getInt("Candidate_Id"));

            }

            // get candidate names that matche the returned Ids from the table Candidate and show it list
            String getCandidateNames = "SELECT name FROM candidate WHERE Id=?";
            pstm = con.prepareStatement(getCandidateNames);
            for (Integer id : candidateId) {
                pstm.setInt(1, id);
                rs = pstm.executeQuery();
                while (rs.next()) {
                    candidateNames.add(rs.getString("Name"));
                }
            }
            
            candidateNames.stream().forEach((candidate) -> {
                model2.addElement(candidate);
            });
            listCandidates.setModel(model2);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
            Logger.getLogger(VotePage.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_listOfElectionsMouseClicked

// retrieve picture of the selected candidate and show it.
    private void listCandidatesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listCandidatesMouseClicked

        candidateName = "";
        String selected = (String) listCandidates.getSelectedValue();
        candidateName = selected;
        String sql = "SELECT * FROM candidate WHERE name=? ";
        try {
            pstm = con.prepareStatement(sql);
            pstm.setString(1, selected);
            rs = pstm.executeQuery();

            if (rs.next()) {
                int id = rs.getInt("Id");
                String name = rs.getString("name");
                int voices = rs.getInt("voices");
                String aboutCandidate = rs.getString("aboutCandidate");
                String urlPicture = rs.getString("picture");
                selectedCandidate = new Candidate(id, name, voices, aboutCandidate, urlPicture);
                ImageIcon image = new ImageIcon(urlPicture);
                lblImage.setIcon(image);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
            Logger.getLogger(VotePage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_listCandidatesMouseClicked

// vote a candidate
    private void btnVoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoteActionPerformed

        if (selectedCandidate == null) {
            JOptionPane.showMessageDialog(this, "Please choose a candidate");
        } else {

            VotingSystem votingSystem = VotingSystem.getVotingSystem();
            Elector elector = votingSystem.getCurrentElector();
            if (elector != null) {
                elector.vote();
                dispose();
            } else {
                try {
                    throw new Exception();
                } catch (Exception ex) {
                    Logger.getLogger(VotePage.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_btnVoteActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       Results result = new Results();
       result.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VotePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VotePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VotePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VotePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VotePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVote;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblChosenCandidate;
    private javax.swing.JLabel lblForVote;
    private javax.swing.JLabel lblImage;
    private javax.swing.JList listCandidates;
    public javax.swing.JList listOfElections;
    private javax.swing.JPanel pannel1;
    // End of variables declaration//GEN-END:variables

    String candidateName;
    public static Candidate selectedCandidate;
    ArrayList<String> candidateNames = new ArrayList<>();

    // retrieve activated elections from the database and fill the list
    private void loadElections() {
        ArrayList<Integer> arrayOfId = new ArrayList<>();
        // get Ids of activated elections
        String sql = "SELECT Polls_Id FROM election";
        try {
            smt = con.createStatement();
            rs = smt.executeQuery(sql);
            while (rs.next()) {
                arrayOfId.add(rs.getInt("Polls_Id"));
            }

            // retrieve election by Id and add into model
            String query = "SELECT Title FROM polls WHERE Id=?";
            pstm = con.prepareStatement(query);
            for (Integer id : arrayOfId) {
                pstm.setInt(1, id);
                rs = pstm.executeQuery();
                if (rs.next()) {
                    model.addElement(rs.getString("Title"));
                }
            }

            listOfElections.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(VotePage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
