package com.gervkuete.voting_system.views;

import com.gervkuete.voting_system.models.Candidate;
import com.gervkuete.voting_system.models.Voting;
import com.gervkuete.voting_system.models.VotingSystem;
import com.gervkuete.voting_system.models.dataAccess.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Results extends javax.swing.JFrame {

    /**
     * Creates new form Results
     */
    public Results() {
        initComponents();
        loadPublishedElections();
    }
    
    Connection con = DatabaseConnection.getConnection();
    Statement stm = null;
    PreparedStatement pstm = null;
    ResultSet rs = null;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jLabel1.setText("Results available for these elections");

        jScrollPane2.setViewportView(jList2);

        jLabel2.setText("Reuslts");

        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(140, 140, 140)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel1)
                        .addGap(218, 218, 218)
                        .addComponent(jLabel2)))
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(51, 51, 51))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
        String selectedElection = (String) jList1.getSelectedValue();

        // get Id of the selected election
        int getId = 0;
        String sqlQuery = "SELECT Id FROM polls WHERE title = ?";
        try {
            pstm = con.prepareStatement(sqlQuery);
            pstm.setString(1, selectedElection);
            rs = pstm.executeQuery();
            
            if (rs.next()) {
                getId = rs.getInt("Id");
            }

            // retrieve Ids of all candidates of the selected election
            ArrayList<Integer> Ids = new ArrayList<>();
            String getCandidates = "SELECT * FROM candidate_polls WHERE polls_Id = ?";
            pstm = con.prepareStatement(getCandidates);
            pstm.setInt(1, getId);
            rs = pstm.executeQuery();
            while (rs.next()) {
                Ids.add(rs.getInt("candidate_Id"));
            }

            // retrieve candidates by their Ids
            ArrayList<Candidate> allCandidates = new ArrayList<>();
            String queryCandidates = "SELECT * FROM candidate WHERE Id = ?";
            pstm = con.prepareStatement(queryCandidates);
            for (Integer elt : Ids) {
                pstm.setInt(1, elt);
                rs = pstm.executeQuery();
                if (rs.next()) {
                    int id = rs.getInt("Id");
                    String name = rs.getString("name");
                    int voices = rs.getInt("voices");
                    String aboutCandidate = rs.getString("aboutCandidate");
                    String picture = rs.getString("picture");
                    Candidate candidate = new Candidate(id, name, voices, aboutCandidate, picture);
                    allCandidates.add(candidate);
                    
                }
            }

            // sort candidates of the selected election by voices and show the results in another list
            Voting voting = new Voting(selectedElection, allCandidates);
            VotingSystem.getVotingSystem().setCurrentVoting(voting);
            candidates = VotingSystem.getVotingSystem().getResults();

            // Show results in another list
            candidates.stream().forEach((cand) -> {
                jList2Model.addElement(cand);
            });
            
            jList2.setModel(jList2Model);
            jList2.setCellRenderer(new Renderer());
        } catch (SQLException ex) {
            Logger.getLogger(Results.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jList1ValueChanged

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
            java.util.logging.Logger.getLogger(Results.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Results.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Results.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Results.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Results().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList jList1;
    private javax.swing.JList jList2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    DefaultListModel jList1Model = new DefaultListModel();
    DefaultListModel<Candidate> jList2Model = new DefaultListModel<>();
    List<Candidate> candidates = new ArrayList<>();

// fetch activated published elections from database and show it in jlist
    private void loadPublishedElections() {
        ArrayList<Integer> getIds = new ArrayList<>();
        String fetchElections = "SELECT * FROM election WHERE published = '1'";
        try {
            stm = con.createStatement();
            rs = stm.executeQuery(fetchElections);
            while (rs.next()) {
                getIds.add(rs.getInt("polls_Id"));
            }
            String titles = "SELECT * FROM polls WHERE Id = ?";
            pstm = con.prepareStatement(titles);
            for (Integer id : getIds) {
                pstm.setInt(1, id);
                rs = pstm.executeQuery();
                if (rs.next()) {
                    jList1Model.addElement(rs.getString("title"));
                }
            }
            
            jList1.setModel(jList1Model);
        } catch (SQLException ex) {
            Logger.getLogger(Results.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
