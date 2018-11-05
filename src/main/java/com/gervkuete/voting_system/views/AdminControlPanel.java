/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gervkuete.voting_system.views;

import com.gervkuete.voting_system.models.Elector;
import com.gervkuete.voting_system.models.dataAccess.DatabaseConnection;
import com.gervkuete.voting_system.models.dataAccess.ElectorDAO;
import java.awt.Toolkit;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gervaislepetit
 */
public class AdminControlPanel extends javax.swing.JFrame {

    /**
     * Creates new form Admin
     */
    public AdminControlPanel() {
        initComponents();
        Toolkit tk = Toolkit.getDefaultToolkit();
        int xSize = tk.getScreenSize().width;
        int ySize = tk.getScreenSize().height;
        this.setSize(xSize, ySize);

        loadElections();
    }

    // get connection object
    Connection con = DatabaseConnection.getConnection();
    Statement stm = null;
    ResultSet rs = null;
    PreparedStatement pstm = null;

    private void switchPanels(JPanel panel) {
        layeredPane1.removeAll();
        layeredPane1.add(panel);
        layeredPane1.repaint();
        layeredPane1.revalidate();
    }

    private void switchPanels3(JPanel panel) {
        electionLayeredPane.removeAll();
        electionLayeredPane.add(panel);
        electionLayeredPane.repaint();
        electionLayeredPane.revalidate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        controlPanel = new javax.swing.JPanel();
        btnCreateElection = new javax.swing.JButton();
        btnViewElection = new javax.swing.JButton();
        btnAddCandidate = new javax.swing.JButton();
        btnViewCandidate = new javax.swing.JButton();
        btnRegisterElector = new javax.swing.JButton();
        btnViewElectors = new javax.swing.JButton();
        btnPublishResults = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        btnActivateElection = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        layeredPane1 = new javax.swing.JLayeredPane();
        createElectionPanel = new javax.swing.JPanel();
        createElectPanel = new javax.swing.JPanel();
        lblElectiontTitle = new javax.swing.JLabel();
        electionTitleField = new javax.swing.JTextField();
        lblElect = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descriptionArea = new javax.swing.JTextArea();
        lblElectionDate = new javax.swing.JLabel();
        electionDateChooser = new com.toedter.calendar.JDateChooser();
        btnOK = new javax.swing.JButton();
        viewElectionsPanel = new javax.swing.JPanel();
        lblElections = new javax.swing.JLabel();
        scpElection = new javax.swing.JScrollPane();
        electionTable = new javax.swing.JTable();
        btnDeleteElections = new javax.swing.JButton();
        btnEditElection = new javax.swing.JButton();
        electionLayeredPane = new javax.swing.JLayeredPane();
        emptyElectionPanel = new javax.swing.JPanel();
        editElectionPanel = new javax.swing.JPanel();
        lblEditElectionTitle = new javax.swing.JLabel();
        editElectionTitleField = new javax.swing.JTextField();
        lblEditDescription = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        editDescriptionArea = new javax.swing.JTextArea();
        lblEditDate = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        btnOK3 = new javax.swing.JButton();
        addCandidatePanel = new javax.swing.JPanel();
        addCandidatePanel2 = new javax.swing.JPanel();
        lblchooseElection = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        candidateField = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        aboutCandidateArea = new javax.swing.JTextArea();
        btnPhoto = new javax.swing.JButton();
        photoField = new javax.swing.JTextField();
        lblAddDescription = new javax.swing.JLabel();
        btnInsertCandidate = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        candidateTable = new javax.swing.JTable();
        btnFinish = new javax.swing.JButton();
        viewCandidatePanel = new javax.swing.JPanel();
        lblListOfCandidate = new javax.swing.JLabel();
        scpListCandidate = new javax.swing.JScrollPane();
        tblListCandidate = new javax.swing.JTable();
        btnDeleteCandidate = new javax.swing.JButton();
        btnEditCandidade = new javax.swing.JButton();
        lblByElection = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        registerElectorPanel = new javax.swing.JPanel();
        registrationPanel = new javax.swing.JPanel();
        lbName = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        lblUserName = new javax.swing.JLabel();
        userNameField = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        confirmPasswordField = new javax.swing.JPasswordField();
        lblConfirmPassword = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        btnSubmit = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        viewElectorPanel = new javax.swing.JPanel();
        scpListElector = new javax.swing.JScrollPane();
        electorTable = new javax.swing.JTable();
        lblListOfElectors = new javax.swing.JLabel();
        btnDeleteElector = new javax.swing.JButton();
        publishResultsPanel = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        activateElectionPanel = new javax.swing.JPanel();
        listPanel = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jListElectionToActivate = new javax.swing.JList();
        btnActivate = new javax.swing.JButton();
        jLabelChoseElection = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnItemExit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("adminFrame"); // NOI18N

        controlPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnCreateElection.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCreateElection.setText("Create election");
        btnCreateElection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateElectionActionPerformed(evt);
            }
        });

        btnViewElection.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnViewElection.setText("View elections");
        btnViewElection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewElectionActionPerformed(evt);
            }
        });

        btnAddCandidate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAddCandidate.setText("Add candidate");
        btnAddCandidate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCandidateActionPerformed(evt);
            }
        });

        btnViewCandidate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnViewCandidate.setText("View candidates");
        btnViewCandidate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewCandidateActionPerformed(evt);
            }
        });

        btnRegisterElector.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnRegisterElector.setText("Register elector");
        btnRegisterElector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterElectorActionPerformed(evt);
            }
        });

        btnViewElectors.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnViewElectors.setText("View electors");
        btnViewElectors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewElectorsActionPerformed(evt);
            }
        });

        btnPublishResults.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnPublishResults.setText("Publish results");
        btnPublishResults.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPublishResultsActionPerformed(evt);
            }
        });

        btnActivateElection.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnActivateElection.setText("Activate election");
        btnActivateElection.setActionCommand("");
        btnActivateElection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActivateElectionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlPanelLayout = new javax.swing.GroupLayout(controlPanel);
        controlPanel.setLayout(controlPanelLayout);
        controlPanelLayout.setHorizontalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(controlPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2)
                            .addComponent(jSeparator3)))
                    .addGroup(controlPanelLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnViewCandidate, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                                .addComponent(btnAddCandidate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRegisterElector, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnViewElectors, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnPublishResults, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(btnViewElection, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCreateElection, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnActivateElection, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 40, Short.MAX_VALUE)))
                .addContainerGap())
        );
        controlPanelLayout.setVerticalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(btnCreateElection)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnActivateElection)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnViewElection)
                .addGap(32, 32, 32)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnAddCandidate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnViewCandidate)
                .addGap(30, 30, 30)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnRegisterElector)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnViewElectors)
                .addGap(30, 30, 30)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnPublishResults)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        layeredPane1.setLayout(new java.awt.CardLayout());

        createElectionPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        createElectPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Create election"));

        lblElectiontTitle.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblElectiontTitle.setText("Eclection's title*");

        electionTitleField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblElect.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblElect.setText("Description");

        descriptionArea.setColumns(3);
        descriptionArea.setLineWrap(true);
        descriptionArea.setRows(3);
        descriptionArea.setWrapStyleWord(true);
        jScrollPane1.setViewportView(descriptionArea);

        lblElectionDate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblElectionDate.setText("Date*");

        electionDateChooser.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout createElectPanelLayout = new javax.swing.GroupLayout(createElectPanel);
        createElectPanel.setLayout(createElectPanelLayout);
        createElectPanelLayout.setHorizontalGroup(
            createElectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createElectPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(createElectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblElectiontTitle)
                    .addComponent(lblElect)
                    .addComponent(lblElectionDate))
                .addGap(28, 28, 28)
                .addGroup(createElectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(electionTitleField, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(electionDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        createElectPanelLayout.setVerticalGroup(
            createElectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createElectPanelLayout.createSequentialGroup()
                .addGroup(createElectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(createElectPanelLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(electionTitleField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(createElectPanelLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(lblElectiontTitle)))
                .addGap(33, 33, 33)
                .addGroup(createElectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblElect)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(createElectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(electionDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblElectionDate))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnOK.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnOK.setText("OK");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout createElectionPanelLayout = new javax.swing.GroupLayout(createElectionPanel);
        createElectionPanel.setLayout(createElectionPanelLayout);
        createElectionPanelLayout.setHorizontalGroup(
            createElectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createElectionPanelLayout.createSequentialGroup()
                .addGap(274, 274, 274)
                .addComponent(createElectPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(277, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createElectionPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnOK, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(300, 300, 300))
        );
        createElectionPanelLayout.setVerticalGroup(
            createElectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createElectionPanelLayout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(createElectPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnOK)
                .addContainerGap(197, Short.MAX_VALUE))
        );

        layeredPane1.add(createElectionPanel, "card1");

        viewElectionsPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblElections.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblElections.setText("Elections");

        electionTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Election ID", "Title", "Description", "Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scpElection.setViewportView(electionTable);

        btnDeleteElections.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnDeleteElections.setText("Delete");
        btnDeleteElections.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteElectionsActionPerformed(evt);
            }
        });

        btnEditElection.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnEditElection.setText("Edit");
        btnEditElection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditElectionActionPerformed(evt);
            }
        });

        electionLayeredPane.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout emptyElectionPanelLayout = new javax.swing.GroupLayout(emptyElectionPanel);
        emptyElectionPanel.setLayout(emptyElectionPanelLayout);
        emptyElectionPanelLayout.setHorizontalGroup(
            emptyElectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 395, Short.MAX_VALUE)
        );
        emptyElectionPanelLayout.setVerticalGroup(
            emptyElectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 274, Short.MAX_VALUE)
        );

        electionLayeredPane.add(emptyElectionPanel, "card3");

        editElectionPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Edit election"));

        lblEditElectionTitle.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblEditElectionTitle.setText("Election's title");

        editElectionTitleField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        editElectionTitleField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editElectionTitleFieldActionPerformed(evt);
            }
        });

        lblEditDescription.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblEditDescription.setText("Description");

        editDescriptionArea.setColumns(3);
        editDescriptionArea.setLineWrap(true);
        editDescriptionArea.setRows(3);
        editDescriptionArea.setWrapStyleWord(true);
        jScrollPane2.setViewportView(editDescriptionArea);

        lblEditDate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblEditDate.setText("Date");

        btnOK3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnOK3.setText("OK");
        btnOK3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOK3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout editElectionPanelLayout = new javax.swing.GroupLayout(editElectionPanel);
        editElectionPanel.setLayout(editElectionPanelLayout);
        editElectionPanelLayout.setHorizontalGroup(
            editElectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editElectionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(editElectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEditElectionTitle)
                    .addComponent(lblEditDescription)
                    .addComponent(lblEditDate))
                .addGap(34, 34, 34)
                .addGroup(editElectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(editElectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                        .addComponent(editElectionTitleField))
                    .addComponent(btnOK3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        editElectionPanelLayout.setVerticalGroup(
            editElectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editElectionPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(editElectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEditElectionTitle)
                    .addComponent(editElectionTitleField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(editElectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEditDescription))
                .addGap(18, 18, 18)
                .addGroup(editElectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEditDate))
                .addGap(29, 29, 29)
                .addComponent(btnOK3)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        electionLayeredPane.add(editElectionPanel, "card2");

        javax.swing.GroupLayout viewElectionsPanelLayout = new javax.swing.GroupLayout(viewElectionsPanel);
        viewElectionsPanel.setLayout(viewElectionsPanelLayout);
        viewElectionsPanelLayout.setHorizontalGroup(
            viewElectionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewElectionsPanelLayout.createSequentialGroup()
                .addGroup(viewElectionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(viewElectionsPanelLayout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(lblElections)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(viewElectionsPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(viewElectionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(viewElectionsPanelLayout.createSequentialGroup()
                                .addComponent(scpElection, javax.swing.GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(electionLayeredPane, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(viewElectionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnEditElection, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnDeleteElections, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(19, 19, 19))
        );
        viewElectionsPanelLayout.setVerticalGroup(
            viewElectionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewElectionsPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblElections)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(viewElectionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(electionLayeredPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scpElection, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnDeleteElections)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditElection)
                .addContainerGap(140, Short.MAX_VALUE))
        );

        layeredPane1.add(viewElectionsPanel, "card3");

        addCandidatePanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        addCandidatePanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Add candidate"));

        lblchooseElection.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblchooseElection.setText("Choose election to add a candidate to:");

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-select an election-" }));
        jComboBox1.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Candidate's name:*");

        candidateField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        aboutCandidateArea.setColumns(3);
        aboutCandidateArea.setLineWrap(true);
        aboutCandidateArea.setRows(4);
        aboutCandidateArea.setWrapStyleWord(true);
        jScrollPane4.setViewportView(aboutCandidateArea);

        btnPhoto.setText("Add photo*");
        btnPhoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPhotoActionPerformed(evt);
            }
        });

        photoField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblAddDescription.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblAddDescription.setText("About candidate:");

        javax.swing.GroupLayout addCandidatePanel2Layout = new javax.swing.GroupLayout(addCandidatePanel2);
        addCandidatePanel2.setLayout(addCandidatePanel2Layout);
        addCandidatePanel2Layout.setHorizontalGroup(
            addCandidatePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addCandidatePanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(addCandidatePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(lblchooseElection)
                    .addComponent(lblAddDescription)
                    .addComponent(btnPhoto))
                .addGap(25, 25, 25)
                .addGroup(addCandidatePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(photoField, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(addCandidatePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                        .addComponent(candidateField)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        addCandidatePanel2Layout.setVerticalGroup(
            addCandidatePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addCandidatePanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(addCandidatePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblchooseElection))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addCandidatePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(candidateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addCandidatePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAddDescription))
                .addGap(21, 21, 21)
                .addGroup(addCandidatePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPhoto)
                    .addComponent(photoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        btnInsertCandidate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnInsertCandidate.setText("Add");
        btnInsertCandidate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertCandidateActionPerformed(evt);
            }
        });

        candidateTable.setBackground(new java.awt.Color(204, 204, 255));
        candidateTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Candidate_ID", "Name", "Voices", "AboutCandidate", "Photo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(candidateTable);

        btnFinish.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnFinish.setText("Finish");

        javax.swing.GroupLayout addCandidatePanelLayout = new javax.swing.GroupLayout(addCandidatePanel);
        addCandidatePanel.setLayout(addCandidatePanelLayout);
        addCandidatePanelLayout.setHorizontalGroup(
            addCandidatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addCandidatePanelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(addCandidatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(addCandidatePanelLayout.createSequentialGroup()
                        .addComponent(addCandidatePanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnInsertCandidate, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnFinish, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 903, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        addCandidatePanelLayout.setVerticalGroup(
            addCandidatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addCandidatePanelLayout.createSequentialGroup()
                .addGroup(addCandidatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addCandidatePanelLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(addCandidatePanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addCandidatePanelLayout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addGroup(addCandidatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnFinish)
                            .addComponent(btnInsertCandidate))))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        layeredPane1.add(addCandidatePanel, "card4");

        viewCandidatePanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblListOfCandidate.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblListOfCandidate.setText("List of candidates");

        tblListCandidate.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Candidate ID", "Name", "Voices", "About candidate", "Picture"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scpListCandidate.setViewportView(tblListCandidate);
        if (tblListCandidate.getColumnModel().getColumnCount() > 0) {
            tblListCandidate.getColumnModel().getColumn(0).setResizable(false);
            tblListCandidate.getColumnModel().getColumn(1).setResizable(false);
            tblListCandidate.getColumnModel().getColumn(2).setResizable(false);
            tblListCandidate.getColumnModel().getColumn(3).setResizable(false);
            tblListCandidate.getColumnModel().getColumn(4).setResizable(false);
        }

        btnDeleteCandidate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnDeleteCandidate.setText("Delete");
        btnDeleteCandidate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteCandidateActionPerformed(evt);
            }
        });

        btnEditCandidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnEditCandidade.setText("Edit");

        lblByElection.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblByElection.setText("By election:");

        jComboBox2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-select an election-" }));
        jComboBox2.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox2PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        javax.swing.GroupLayout viewCandidatePanelLayout = new javax.swing.GroupLayout(viewCandidatePanel);
        viewCandidatePanel.setLayout(viewCandidatePanelLayout);
        viewCandidatePanelLayout.setHorizontalGroup(
            viewCandidatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewCandidatePanelLayout.createSequentialGroup()
                .addGroup(viewCandidatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(viewCandidatePanelLayout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(lblListOfCandidate))
                    .addGroup(viewCandidatePanelLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(viewCandidatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDeleteCandidate)
                            .addComponent(btnEditCandidade, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(viewCandidatePanelLayout.createSequentialGroup()
                                .addComponent(lblByElection)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(scpListCandidate, javax.swing.GroupLayout.PREFERRED_SIZE, 905, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        viewCandidatePanelLayout.setVerticalGroup(
            viewCandidatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewCandidatePanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblListOfCandidate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scpListCandidate, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(viewCandidatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblByElection))
                .addGap(18, 18, 18)
                .addComponent(btnEditCandidade)
                .addGap(18, 18, 18)
                .addComponent(btnDeleteCandidate)
                .addGap(45, 45, 45))
        );

        layeredPane1.add(viewCandidatePanel, "card5");

        registerElectorPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        registrationPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("registration"));

        lbName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbName.setText("Name:*");

        nameField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblUserName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUserName.setText("UserName:*");

        userNameField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPassword.setText("password:*");

        passwordField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });

        confirmPasswordField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        confirmPasswordField.setToolTipText("");

        lblConfirmPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblConfirmPassword.setText("Confirm Password:*");

        btnSubmit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        btnReset.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnCancel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout registrationPanelLayout = new javax.swing.GroupLayout(registrationPanel);
        registrationPanel.setLayout(registrationPanelLayout);
        registrationPanelLayout.setHorizontalGroup(
            registrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registrationPanelLayout.createSequentialGroup()
                .addGroup(registrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(registrationPanelLayout.createSequentialGroup()
                        .addContainerGap(147, Short.MAX_VALUE)
                        .addComponent(btnSubmit)
                        .addGap(35, 35, 35)
                        .addComponent(btnReset)
                        .addGap(36, 36, 36)
                        .addComponent(btnCancel))
                    .addGroup(registrationPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(registrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator5)
                            .addGroup(registrationPanelLayout.createSequentialGroup()
                                .addGroup(registrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbName, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(registrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(nameField)
                                    .addComponent(confirmPasswordField)
                                    .addComponent(passwordField, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                                    .addComponent(userNameField))))))
                .addGap(19, 19, 19))
        );
        registrationPanelLayout.setVerticalGroup(
            registrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registrationPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(registrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbName)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(registrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserName)
                    .addComponent(userNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(registrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(registrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblConfirmPassword))
                .addGap(25, 25, 25)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(registrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel)
                    .addComponent(btnReset)
                    .addComponent(btnSubmit))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout registerElectorPanelLayout = new javax.swing.GroupLayout(registerElectorPanel);
        registerElectorPanel.setLayout(registerElectorPanelLayout);
        registerElectorPanelLayout.setHorizontalGroup(
            registerElectorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerElectorPanelLayout.createSequentialGroup()
                .addGap(257, 257, 257)
                .addComponent(registrationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(254, Short.MAX_VALUE))
        );
        registerElectorPanelLayout.setVerticalGroup(
            registerElectorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerElectorPanelLayout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(registrationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(208, Short.MAX_VALUE))
        );

        layeredPane1.add(registerElectorPanel, "card6");

        viewElectorPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        electorTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Elector ID", "Name", "Login", "isVoted"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scpListElector.setViewportView(electorTable);

        lblListOfElectors.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblListOfElectors.setText("List of electors");

        btnDeleteElector.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnDeleteElector.setText("Delete");

        javax.swing.GroupLayout viewElectorPanelLayout = new javax.swing.GroupLayout(viewElectorPanel);
        viewElectorPanel.setLayout(viewElectorPanelLayout);
        viewElectorPanelLayout.setHorizontalGroup(
            viewElectorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewElectorPanelLayout.createSequentialGroup()
                .addGroup(viewElectorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(viewElectorPanelLayout.createSequentialGroup()
                        .addGap(379, 379, 379)
                        .addComponent(lblListOfElectors))
                    .addGroup(viewElectorPanelLayout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(scpListElector, javax.swing.GroupLayout.PREFERRED_SIZE, 739, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnDeleteElector, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        viewElectorPanelLayout.setVerticalGroup(
            viewElectorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewElectorPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblListOfElectors)
                .addGroup(viewElectorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(viewElectorPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(scpListElector, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(255, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewElectorPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDeleteElector)
                        .addGap(264, 264, 264))))
        );

        layeredPane1.add(viewElectorPanel, "card7");

        publishResultsPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel10.setText("Publish results");

        javax.swing.GroupLayout publishResultsPanelLayout = new javax.swing.GroupLayout(publishResultsPanel);
        publishResultsPanel.setLayout(publishResultsPanelLayout);
        publishResultsPanelLayout.setHorizontalGroup(
            publishResultsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(publishResultsPanelLayout.createSequentialGroup()
                .addGap(378, 378, 378)
                .addComponent(jLabel10)
                .addContainerGap(448, Short.MAX_VALUE))
        );
        publishResultsPanelLayout.setVerticalGroup(
            publishResultsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(publishResultsPanelLayout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(jLabel10)
                .addContainerGap(415, Short.MAX_VALUE))
        );

        layeredPane1.add(publishResultsPanel, "card8");

        listPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Activate election"));

        jListElectionToActivate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jScrollPane7.setViewportView(jListElectionToActivate);

        btnActivate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnActivate.setText("Activate");
        btnActivate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActivateActionPerformed(evt);
            }
        });

        jLabelChoseElection.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelChoseElection.setText("Choose election to activate");

        javax.swing.GroupLayout listPanelLayout = new javax.swing.GroupLayout(listPanel);
        listPanel.setLayout(listPanelLayout);
        listPanelLayout.setHorizontalGroup(
            listPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listPanelLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(listPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnActivate)
                    .addComponent(jLabelChoseElection))
                .addGap(88, 88, 88))
        );
        listPanelLayout.setVerticalGroup(
            listPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, listPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabelChoseElection)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnActivate)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout activateElectionPanelLayout = new javax.swing.GroupLayout(activateElectionPanel);
        activateElectionPanel.setLayout(activateElectionPanelLayout);
        activateElectionPanelLayout.setHorizontalGroup(
            activateElectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(activateElectionPanelLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(listPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(152, Short.MAX_VALUE))
        );
        activateElectionPanelLayout.setVerticalGroup(
            activateElectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(activateElectionPanelLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(listPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(180, Short.MAX_VALUE))
        );

        layeredPane1.add(activateElectionPanel, "card2");

        jMenu1.setText("Logout");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        mnItemExit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        mnItemExit.setText("Disconnect");
        mnItemExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItemExitActionPerformed(evt);
            }
        });
        jMenu1.add(mnItemExit);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(controlPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(layeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 981, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(controlPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(layeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewElectorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewElectorsActionPerformed

        // view electors
        switchPanels(viewElectorPanel);
        DefaultTableModel model = (DefaultTableModel) electorTable.getModel();

        while (model.getRowCount() > 0) {
            for (int count = 0; count < model.getRowCount(); count++) {
                model.removeRow(count);
            }
        }
        List<Elector> electors = ElectorDAO.getElectorDAO().getAllElectors();
        Object[] row = new Object[4];
        for (Elector elector : electors) {
            row[0] = elector.getId();
            row[1] = elector.getName();
            row[2] = elector.getLogin();
            row[3] = elector.isVoted();
            model.addRow(row);

        }
    }//GEN-LAST:event_btnViewElectorsActionPerformed

    private void btnViewCandidateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewCandidateActionPerformed

        // view candidate
        switchPanels(viewCandidatePanel);
        DefaultTableModel model = (DefaultTableModel) tblListCandidate.getModel();
        while (model.getRowCount() > 0) {
            for (int count = 0; count < model.getRowCount(); count++) {
                model.removeRow(count);
            }
        }
        String getCandidates = "SELECT * FROM candidate";
        try {
            stm = con.createStatement();
            rs = stm.executeQuery(getCandidates);
            String[] row = new String[5];

            while (rs.next()) {
                row[0] = rs.getString("id");
                row[1] = rs.getString("name");
                row[2] = rs.getString("voices");
                row[3] = rs.getString("aboutCandidate");
                row[4] = rs.getString("picture");
                model.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminControlPanel.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnViewCandidateActionPerformed

    private void mnItemExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItemExitActionPerformed
        dispose();
    }//GEN-LAST:event_mnItemExitActionPerformed

    private void btnCreateElectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateElectionActionPerformed
        switchPanels(createElectionPanel);
    }//GEN-LAST:event_btnCreateElectionActionPerformed

    private void btnViewElectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewElectionActionPerformed

        // view elections
        switchPanels(viewElectionsPanel);
        DefaultTableModel model = (DefaultTableModel) electionTable.getModel();
        while (model.getRowCount() > 0) {
            for (int count = 0; count < model.getRowCount(); count++) {
                model.removeRow(count);
            }
        }

        String sql = "SELECT * FROM Polls";

        try {
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            String[] row = new String[4];

            while (rs.next()) {
                row[0] = rs.getString("id");
                row[1] = rs.getString("title");
                row[2] = rs.getString("description");
                row[3] = rs.getString("date");
                model.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminControlPanel.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnViewElectionActionPerformed

    private void btnAddCandidateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCandidateActionPerformed
        switchPanels(addCandidatePanel);
    }//GEN-LAST:event_btnAddCandidateActionPerformed

    private void btnRegisterElectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterElectorActionPerformed
        switchPanels(registerElectorPanel);
    }//GEN-LAST:event_btnRegisterElectorActionPerformed

    private void btnPublishResultsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPublishResultsActionPerformed
        switchPanels(publishResultsPanel);
    }//GEN-LAST:event_btnPublishResultsActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        nameField.setText(null);
        userNameField.setText(null);
        passwordField.setText(null);
        confirmPasswordField.setText(null);
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed

    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed

        // create an election
        if (electionTitleField.getText().equals("") || electionDateChooser.getDateEditor() == null) {
            JOptionPane.showMessageDialog(this, "Please fill all mandatory fields (*)", "Information", JOptionPane.INFORMATION_MESSAGE);
        } else {

            String sql = "INSERT INTO polls (title, date, description) VALUES (?, ?, ?)";
            int count;

            try {

                pstm = con.prepareStatement(sql);
                pstm.setString(1, electionTitleField.getText());
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
                String date = formatter.format(electionDateChooser.getDateEditor().getDate());
                pstm.setString(2, date);
                pstm.setString(3, descriptionArea.getText());
                count = pstm.executeUpdate();

                if (count == 1) {
                    JOptionPane.showMessageDialog(this, "Election created successfully!", "Information", JOptionPane.INFORMATION_MESSAGE);
                    electionTitleField.setText(null);
                    descriptionArea.setText(null);
                    electionDateChooser.setCalendar(null);
                }

            } catch (SQLException ex) {
                Logger.getLogger(AdminControlPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnOKActionPerformed

    private void editElectionTitleFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editElectionTitleFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editElectionTitleFieldActionPerformed

    // delete candidate
    private void btnDeleteCandidateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteCandidateActionPerformed
        DefaultTableModel defaultModel = (DefaultTableModel) tblListCandidate.getModel();
        int selectedRow = tblListCandidate.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please choose candidate to delete", "Information", JOptionPane.INFORMATION_MESSAGE);
        } else {

            // get id of the selected record
            Object id = defaultModel.getValueAt(selectedRow, 0);

            // delete the corresonding record from the database
            String query = "DELETE FROM candidate WHERE Id = ? ";
            String delete = "DELETE FROM election WHERE candidate_Id = ?";
            String sql = "DELETE FROM candidate_polls WHERE candidate_Id = ?";
            try {

                // delete foreign key of the record in election table
                pstm = con.prepareStatement(delete);
                pstm.setObject(1, id);
                int count1 = pstm.executeUpdate();

                // delete foreign key of the record in candidate_polls table
                pstm = con.prepareStatement(sql);
                pstm.setObject(1, id);
                int count2 = pstm.executeUpdate();

                // delete properly the candidate
                if (count1 == 1 && count2 == 1) {
                    pstm = con.prepareStatement(query);
                    pstm.setObject(1, id);
                    int count = pstm.executeUpdate();
                    if (count == 1) {
                        JOptionPane.showMessageDialog(this, "Candidate deleted successfuly", "Information", JOptionPane.INFORMATION_MESSAGE);
                        defaultModel.removeRow(selectedRow);
                        tblListCandidate.setModel(defaultModel);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Sorry you cannot delete this candidate", "Delete candidate", JOptionPane.WARNING_MESSAGE);
                }

            } catch (SQLException ex) {
                Logger.getLogger(AdminControlPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnDeleteCandidateActionPerformed

    // activate election
    private void btnActivateElectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActivateElectionActionPerformed

        // activate an election to enable electors to vote
        switchPanels(activateElectionPanel);
        DefaultListModel listModel = new DefaultListModel();
        String sql = "SELECT * FROM polls";

        try {
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {

                listModel.addElement(rs.getString("title"));
            }

            jListElectionToActivate.setModel(listModel);
        } catch (SQLException ex) {
            Logger.getLogger(AdminControlPanel.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnActivateElectionActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed

        // register new elector 
        String name = nameField.getText();
        String login = userNameField.getText();
        String password = passwordField.getText();
        String confirmPassword = confirmPasswordField.getText();
        boolean voted = false;
        if (name.isEmpty() || login.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
            JOptionPane.showMessageDialog(null, "All fields with * must be filled!", "Message", JOptionPane.INFORMATION_MESSAGE);
        } else {
            if (password.equals(confirmPassword) && !(password.isEmpty())) {
                if (ElectorDAO.getElectorDAO().insertElector(name, login, password, voted) != 0) {
                    JOptionPane.showMessageDialog(null, "Elector registered successfuly!", "Message", JOptionPane.INFORMATION_MESSAGE);
                    nameField.setText(null);
                    userNameField.setText(null);
                    passwordField.setText(null);
                    confirmPasswordField.setText(null);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Password doesn't match", "Message", JOptionPane.ERROR_MESSAGE);

            }
        }

    }//GEN-LAST:event_btnSubmitActionPerformed

    // edit election
    private void btnEditElectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditElectionActionPerformed
        int selectedRow = electionTable.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select election to edit");
        } else {
            getId = electionTable.getValueAt(selectedRow, 0);
            String sqlQuery = "SELECT * FROM polls WHERE Id = ?";

            try {

                pstm = con.prepareStatement(sqlQuery);
                pstm.setObject(1, getId);
                rs = pstm.executeQuery();
                if (rs.next()) {
                    editElectionTitleField.setText(rs.getString("title"));
                    editDescriptionArea.setText(rs.getString("description"));
                }
                switchPanels3(editElectionPanel);
            } catch (SQLException ex) {
                Logger.getLogger(AdminControlPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnEditElectionActionPerformed

    // choose an election and add candidates to it
    private void btnInsertCandidateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertCandidateActionPerformed

        String selectedItem = (String) jComboBox1.getSelectedItem();

        // get Id of election to add candidate to
        if (selectedItem.equals("-select an election-")) {
            JOptionPane.showMessageDialog(this, "Please select an election");
        } else {

            String sql = "SELECT Id FROM Polls WHERE title=?";
            try {
                pstm = con.prepareStatement(sql);
                pstm.setString(1, selectedItem);
                rs = pstm.executeQuery();
                int idValue = 0;
                if (rs.next()) {
                    idValue = rs.getInt(1);
                }

                // add election 
                String addCandidate = "INSERT INTO Candidate (name, voices, aboutCandidate, picture) VALUES (?, ?, ?, ?)";
                pstm = con.prepareStatement(addCandidate);
                pstm.setString(1, candidateField.getText());
                pstm.setInt(2, 0);
                pstm.setString(3, aboutCandidateArea.getText());
                pstm.setString(4, photoField.getText());
                pstm.executeUpdate();

                // get Id of the last inserted candidate
                String getLastInsertId = "SELECT LAST_INSERT_ID()";
                stm = con.createStatement();
                rs = stm.executeQuery(getLastInsertId);
                int lastInsertId = 0;
                if (rs.next()) {
                    lastInsertId = rs.getInt(1);
                } else {
                }

                // show the inserted candidate within the table of GUI
                DefaultTableModel model = (DefaultTableModel) candidateTable.getModel();
                String[] data = new String[5];
                data[0] = String.valueOf(lastInsertId);
                data[1] = candidateField.getText();
                data[2] = "0";
                data[3] = aboutCandidateArea.getText();
                data[4] = photoField.getText();
                model.addRow(data);

                //
                String sqlQuery = "INSERT INTO candidate_polls (polls_Id, candidate_Id) VALUES (?, ?)";
                pstm = con.prepareStatement(sqlQuery);
                pstm.setInt(1, idValue);
                pstm.setInt(2, lastInsertId);
                pstm.executeUpdate();

            } catch (SQLException ex) {
                Logger.getLogger(AdminControlPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }


    }//GEN-LAST:event_btnInsertCandidateActionPerformed

    private void btnPhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPhotoActionPerformed

        // attach a picture to a candidate
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.showOpenDialog(this);
        File file = fileChooser.getSelectedFile();
        String filePath = file.getAbsolutePath();
        photoField.setText(filePath);
    }//GEN-LAST:event_btnPhotoActionPerformed

    private void btnActivateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActivateActionPerformed

        // activate election
        if (jListElectionToActivate.getSelectedValue() == null) {
            JOptionPane.showMessageDialog(this, "Please choose an election to activate", null, JOptionPane.INFORMATION_MESSAGE);
        } else {
            String date = "";
            int id = 0;
            String electionToActivate = (String) jListElectionToActivate.getSelectedValue();
            String query = "SELECT Id, Date FROM polls WHERE title=?";
            try {
                pstm = con.prepareStatement(query);
                pstm.setString(1, electionToActivate);
                rs = pstm.executeQuery();
                if (rs.next()) {
                    date = rs.getString("Date");
                    id = rs.getInt("Id");
                }

                int count = 0;
                String insert = "INSERT INTO election (Polls_Id, Date) VALUES (?, ?)";
                pstm = con.prepareStatement(insert);
                pstm.setInt(1, id);
                pstm.setString(2, date);
                count = pstm.executeUpdate();
                if (count > 0) {
                    JOptionPane.showMessageDialog(this, "Election activated", "Confirmation", JOptionPane.INFORMATION_MESSAGE);
                }

            } catch (SQLException ex) {
                Logger.getLogger(AdminControlPanel.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_btnActivateActionPerformed

    private void jComboBox2PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox2PopupMenuWillBecomeInvisible

        String selectedItem = (String) jComboBox2.getSelectedItem();
        DefaultTableModel model = (DefaultTableModel) tblListCandidate.getModel();

        while (model.getRowCount() > 0) {
            for (int count = 0; count < model.getRowCount(); count++) {
                model.removeRow(count);
            }
        }
        // get id of the selected election
        String query = "SELECT Id FROM polls WHERE title=?";
        try {
            int neededId = 0;
            pstm = con.prepareStatement(query);
            pstm.setString(1, selectedItem);
            rs = pstm.executeQuery();
            if (rs.next()) {
                neededId = rs.getInt("Id");
            }

            // get ids of candidates registered for a given election
            ArrayList<Integer> candidatesId = new ArrayList<>();
            String getIds = "SELECT * FROM candidate_polls WHERE polls_Id=?";
            pstm = con.prepareStatement(getIds);
            pstm.setInt(1, neededId);
            rs = pstm.executeQuery();
            while (rs.next()) {
                candidatesId.add(rs.getInt("Candidate_Id"));
            }

            // get all candidates for a given election
            Object[] row = new Object[5];
            String getCandidates = "SELECT * FROM candidate WHERE Id=?";
            pstm = con.prepareStatement(getCandidates);
            for (Integer id : candidatesId) {
                pstm.setInt(1, id);
                rs = pstm.executeQuery();
                while (rs.next()) {
                    row[0] = rs.getInt("Id");
                    row[1] = rs.getString("name");
                    row[2] = rs.getInt("voices");
                    row[3] = rs.getString("aboutCandidate");
                    row[4] = rs.getString("picture");
                    model.addRow(row);
                }
                tblListCandidate.setModel(model);
            }

        } catch (SQLException ex) {
            Logger.getLogger(AdminControlPanel.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jComboBox2PopupMenuWillBecomeInvisible

    // delete election
    private void btnDeleteElectionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteElectionsActionPerformed
        DefaultTableModel model = (DefaultTableModel) electionTable.getModel();
        int selectedRow = electionTable.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please election to delete", "Delete", JOptionPane.INFORMATION_MESSAGE);
        } else {

            String sqlDelete = "DELETE FROM polls WHERE Id = ?";
            String delete = "DELETE FROM election WHERE polls_Id = ?";
            Object id = model.getValueAt(selectedRow, 0);
            try {

                // delete foreign key in election table
                pstm = con.prepareStatement(delete);
                pstm.setObject(1, id);
                int count = pstm.executeUpdate();
                if (count > 0) {
                    pstm = con.prepareStatement(sqlDelete);
                    pstm.setObject(1, id);
                    int count2 = pstm.executeUpdate();

                    // delete record in polls table
                    if (count2 > 0) {
                        JOptionPane.showMessageDialog(this, "Election deleted", "Delete election", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(this, "Sorry, cannot delete election", delete, count);
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(AdminControlPanel.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_btnDeleteElectionsActionPerformed

    // validate edited election 
    private void btnOK3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOK3ActionPerformed

        String title = editElectionTitleField.getText();
        String description = editDescriptionArea.getText();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String date = formatter.format(jDateChooser1.getDateEditor().getDate());
        String sqlUpdate = "UPDATE polls SET title = '" + title + "', description = '" + description + "', date = '" + date + "' WHERE Id = ?";
        try {
            pstm = con.prepareStatement(sqlUpdate);
            pstm.setObject(1, getId);
            int count = pstm.executeUpdate();
            if (count > 0) {
                JOptionPane.showMessageDialog(this, "Election updated");
                editElectionTitleField.setText(null);
                editDescriptionArea.setText(null);
                jDateChooser1.setCalendar(null);
                switchPanels3(emptyElectionPanel);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminControlPanel.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnOK3ActionPerformed

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
            java.util.logging.Logger.getLogger(AdminControlPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminControlPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminControlPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminControlPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminControlPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea aboutCandidateArea;
    private javax.swing.JPanel activateElectionPanel;
    private javax.swing.JPanel addCandidatePanel;
    private javax.swing.JPanel addCandidatePanel2;
    private javax.swing.JButton btnActivate;
    private javax.swing.JButton btnActivateElection;
    private javax.swing.JButton btnAddCandidate;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnCreateElection;
    private javax.swing.JButton btnDeleteCandidate;
    private javax.swing.JButton btnDeleteElections;
    private javax.swing.JButton btnDeleteElector;
    private javax.swing.JButton btnEditCandidade;
    private javax.swing.JButton btnEditElection;
    private javax.swing.JButton btnFinish;
    private javax.swing.JButton btnInsertCandidate;
    private javax.swing.JButton btnOK;
    private javax.swing.JButton btnOK3;
    private javax.swing.JButton btnPhoto;
    private javax.swing.JButton btnPublishResults;
    private javax.swing.JButton btnRegisterElector;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btnViewCandidate;
    private javax.swing.JButton btnViewElection;
    private javax.swing.JButton btnViewElectors;
    private javax.swing.JTextField candidateField;
    private javax.swing.JTable candidateTable;
    private javax.swing.JPasswordField confirmPasswordField;
    private javax.swing.JPanel controlPanel;
    private javax.swing.JPanel createElectPanel;
    private javax.swing.JPanel createElectionPanel;
    private javax.swing.JTextArea descriptionArea;
    private javax.swing.JTextArea editDescriptionArea;
    private javax.swing.JPanel editElectionPanel;
    private javax.swing.JTextField editElectionTitleField;
    private com.toedter.calendar.JDateChooser electionDateChooser;
    private javax.swing.JLayeredPane electionLayeredPane;
    private javax.swing.JTable electionTable;
    private javax.swing.JTextField electionTitleField;
    private javax.swing.JTable electorTable;
    private javax.swing.JPanel emptyElectionPanel;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabelChoseElection;
    private javax.swing.JList jListElectionToActivate;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLayeredPane layeredPane1;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lblAddDescription;
    private javax.swing.JLabel lblByElection;
    private javax.swing.JLabel lblConfirmPassword;
    private javax.swing.JLabel lblEditDate;
    private javax.swing.JLabel lblEditDescription;
    private javax.swing.JLabel lblEditElectionTitle;
    private javax.swing.JLabel lblElect;
    private javax.swing.JLabel lblElectionDate;
    private javax.swing.JLabel lblElections;
    private javax.swing.JLabel lblElectiontTitle;
    private javax.swing.JLabel lblListOfCandidate;
    private javax.swing.JLabel lblListOfElectors;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JLabel lblchooseElection;
    private javax.swing.JPanel listPanel;
    private javax.swing.JMenuItem mnItemExit;
    private javax.swing.JTextField nameField;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField photoField;
    private javax.swing.JPanel publishResultsPanel;
    private javax.swing.JPanel registerElectorPanel;
    private javax.swing.JPanel registrationPanel;
    private javax.swing.JScrollPane scpElection;
    private javax.swing.JScrollPane scpListCandidate;
    private javax.swing.JScrollPane scpListElector;
    private javax.swing.JTable tblListCandidate;
    private javax.swing.JTextField userNameField;
    private javax.swing.JPanel viewCandidatePanel;
    private javax.swing.JPanel viewElectionsPanel;
    private javax.swing.JPanel viewElectorPanel;
    // End of variables declaration//GEN-END:variables

    Object getId;

// load elections into JcomboBox1
    private void loadElections() {

        DefaultComboBoxModel comboModel = (DefaultComboBoxModel) jComboBox1.getModel();
        DefaultComboBoxModel comboModel2 = (DefaultComboBoxModel) jComboBox2.getModel();

        try {
            String sql = "SELECT * FROM Polls";
            stm = con.createStatement();
            rs = stm.executeQuery(sql);

            while (rs.next()) {
                comboModel.addElement(rs.getString("title"));
                comboModel2.addElement(rs.getString("title"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(AdminControlPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
