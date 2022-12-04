/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.College;

import model.Customer.GeneralInformation;
import model.DatabaseUtility.DB4OUtil;
import model.EcoSystem;
import model.Enterprise.Enterprise;
import model.NetworkLink.Network;
import model.Organization;
import model.UserAccount.UserAccount;
import model.ServiceQueue.AssignToCollegeWorkRequest;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author harsh
 */
public class ManageCollegeJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageCollegeJPanel
     */
    private final EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    public ManageCollegeJPanel(EcoSystem system) {
        initComponents();
         this.system=system;
        populateTable();
        tabbedPanel.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        btnAcceptRequest = new javax.swing.JButton();
        tabbedPanel = new javax.swing.JTabbedPane();
        familyBackPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        rbNuclear = new javax.swing.JRadioButton();
        rbSingleParent = new javax.swing.JRadioButton();
        rbExtended = new javax.swing.JRadioButton();
        criminalPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        rbConvictedNo = new javax.swing.JRadioButton();
        rbConvictedYes = new javax.swing.JRadioButton();
        drugPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        rbDrugsYes = new javax.swing.JRadioButton();
        rbDrugsNo = new javax.swing.JRadioButton();
        guardPanel = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        guardYes = new javax.swing.JRadioButton();
        guardlNo = new javax.swing.JRadioButton();
        jLabel17 = new javax.swing.JLabel();
        techNo = new javax.swing.JRadioButton();
        techYes = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        rbComputerNo1 = new javax.swing.JRadioButton();
        rbComputerYes1 = new javax.swing.JRadioButton();
        physicalPanel = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        isPhysicalYes = new javax.swing.JRadioButton();
        isPhysicalNo = new javax.swing.JRadioButton();
        jLabel15 = new javax.swing.JLabel();
        medicalYes = new javax.swing.JRadioButton();
        medicalNo = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jRegisterTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(153, 0, 0));
        setPreferredSize(new java.awt.Dimension(2193, 1202));

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(2193, 1202));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setBackground(new java.awt.Color(0, 102, 102));
        jLabel1.setFont(new java.awt.Font("Adobe Devanagari", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("NEW ADMIT REQUEST");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setOpaque(true);

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setFont(new java.awt.Font("Adobe Devanagari", 0, 12)); // NOI18N

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ACCEPT", "REJECT" }));

        jLabel2.setFont(new java.awt.Font("Adobe Devanagari", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("STATUS :");

        btnAcceptRequest.setBackground(new java.awt.Color(0, 51, 102));
        btnAcceptRequest.setFont(new java.awt.Font("Adobe Devanagari", 1, 12)); // NOI18N
        btnAcceptRequest.setForeground(new java.awt.Color(204, 204, 204));
        btnAcceptRequest.setText("SUBMIT");
        btnAcceptRequest.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAcceptRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptRequestActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(btnAcceptRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAcceptRequest)
                .addGap(20, 20, 20))
        );

        tabbedPanel.setBackground(new java.awt.Color(204, 204, 204));

        familyBackPanel.setBackground(new java.awt.Color(204, 204, 204));

        jLabel3.setText("What Type of family you are in: ");

        rbNuclear.setText("Nuclear");
        rbNuclear.setEnabled(false);

        rbSingleParent.setText("Single Parent");
        rbSingleParent.setEnabled(false);

        rbExtended.setText("Extended");
        rbExtended.setEnabled(false);

        javax.swing.GroupLayout familyBackPanelLayout = new javax.swing.GroupLayout(familyBackPanel);
        familyBackPanel.setLayout(familyBackPanelLayout);
        familyBackPanelLayout.setHorizontalGroup(
            familyBackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(familyBackPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbNuclear)
                .addGap(50, 50, 50)
                .addComponent(rbSingleParent)
                .addGap(38, 38, 38)
                .addComponent(rbExtended)
                .addContainerGap())
        );
        familyBackPanelLayout.setVerticalGroup(
            familyBackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(familyBackPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(familyBackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(rbNuclear)
                    .addComponent(rbSingleParent)
                    .addComponent(rbExtended))
                .addContainerGap(171, Short.MAX_VALUE))
        );

        tabbedPanel.addTab("Family Background Information", familyBackPanel);

        criminalPanel.setBackground(new java.awt.Color(204, 204, 204));

        jLabel6.setText("Do you ever convicted for a crime:");

        rbConvictedNo.setText("No");
        rbConvictedNo.setEnabled(false);

        rbConvictedYes.setText("Yes");
        rbConvictedYes.setEnabled(false);

        javax.swing.GroupLayout criminalPanelLayout = new javax.swing.GroupLayout(criminalPanel);
        criminalPanel.setLayout(criminalPanelLayout);
        criminalPanelLayout.setHorizontalGroup(
            criminalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(criminalPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(criminalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(criminalPanelLayout.createSequentialGroup()
                        .addComponent(rbConvictedYes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbConvictedNo)))
                .addContainerGap(413, Short.MAX_VALUE))
        );
        criminalPanelLayout.setVerticalGroup(
            criminalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(criminalPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(criminalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbConvictedYes)
                    .addComponent(rbConvictedNo))
                .addContainerGap(149, Short.MAX_VALUE))
        );

        tabbedPanel.addTab("Criminal Information", criminalPanel);

        drugPanel.setBackground(new java.awt.Color(204, 204, 204));

        jLabel4.setText("Do you use drugs:");

        rbDrugsYes.setText("Yes");
        rbDrugsYes.setEnabled(false);

        rbDrugsNo.setText("No");
        rbDrugsNo.setEnabled(false);

        javax.swing.GroupLayout drugPanelLayout = new javax.swing.GroupLayout(drugPanel);
        drugPanel.setLayout(drugPanelLayout);
        drugPanelLayout.setHorizontalGroup(
            drugPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(drugPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(drugPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(drugPanelLayout.createSequentialGroup()
                        .addComponent(rbDrugsYes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbDrugsNo)))
                .addContainerGap(506, Short.MAX_VALUE))
        );
        drugPanelLayout.setVerticalGroup(
            drugPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(drugPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(drugPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbDrugsYes)
                    .addComponent(rbDrugsNo))
                .addGap(205, 205, 205))
        );

        tabbedPanel.addTab("DrugAbuse Information", drugPanel);

        guardPanel.setBackground(new java.awt.Color(204, 204, 204));

        jLabel11.setText("Do you have any previous backlogs :");

        guardYes.setText("Yes");
        guardYes.setEnabled(false);

        guardlNo.setText("No");
        guardlNo.setEnabled(false);

        jLabel17.setText("Do you have any previous technical knowldege ?");

        techNo.setText("No");
        techNo.setEnabled(false);

        techYes.setText("Yes");
        techYes.setEnabled(false);

        jLabel9.setText("Can you use a computer ?");

        rbComputerNo1.setText("No");
        rbComputerNo1.setEnabled(false);

        rbComputerYes1.setText("Yes");
        rbComputerYes1.setEnabled(false);

        javax.swing.GroupLayout guardPanelLayout = new javax.swing.GroupLayout(guardPanel);
        guardPanel.setLayout(guardPanelLayout);
        guardPanelLayout.setHorizontalGroup(
            guardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(guardPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(guardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(guardPanelLayout.createSequentialGroup()
                        .addGroup(guardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(guardPanelLayout.createSequentialGroup()
                                .addComponent(rbComputerYes1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbComputerNo1)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(guardPanelLayout.createSequentialGroup()
                        .addGroup(guardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(guardPanelLayout.createSequentialGroup()
                                .addComponent(techYes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(techNo))
                            .addComponent(jLabel17)
                            .addComponent(jLabel11)
                            .addGroup(guardPanelLayout.createSequentialGroup()
                                .addComponent(guardYes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(guardlNo)))
                        .addContainerGap(335, Short.MAX_VALUE))))
        );
        guardPanelLayout.setVerticalGroup(
            guardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(guardPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(guardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardYes)
                    .addComponent(guardlNo))
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(guardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbComputerYes1)
                    .addComponent(rbComputerNo1))
                .addGap(19, 19, 19)
                .addComponent(jLabel17)
                .addGap(5, 5, 5)
                .addGroup(guardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(techYes)
                    .addComponent(techNo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabbedPanel.addTab("Previous Experience", guardPanel);

        physicalPanel.setBackground(new java.awt.Color(204, 204, 204));

        jLabel10.setText("Are you physically active:");

        isPhysicalYes.setText("Yes");
        isPhysicalYes.setEnabled(false);

        isPhysicalNo.setText("No");
        isPhysicalNo.setEnabled(false);

        jLabel15.setText("Do you have any medical condition ?");

        medicalYes.setText("Yes");
        medicalYes.setEnabled(false);

        medicalNo.setText("No");
        medicalNo.setEnabled(false);

        javax.swing.GroupLayout physicalPanelLayout = new javax.swing.GroupLayout(physicalPanel);
        physicalPanel.setLayout(physicalPanelLayout);
        physicalPanelLayout.setHorizontalGroup(
            physicalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(physicalPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(physicalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(physicalPanelLayout.createSequentialGroup()
                        .addComponent(medicalYes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(medicalNo))
                    .addComponent(jLabel10)
                    .addGroup(physicalPanelLayout.createSequentialGroup()
                        .addComponent(isPhysicalYes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(isPhysicalNo))
                    .addComponent(jLabel15))
                .addContainerGap(403, Short.MAX_VALUE))
        );
        physicalPanelLayout.setVerticalGroup(
            physicalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(physicalPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(physicalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(isPhysicalYes)
                    .addComponent(isPhysicalNo))
                .addGap(18, 18, 18)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(physicalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(medicalYes)
                    .addComponent(medicalNo))
                .addContainerGap(82, Short.MAX_VALUE))
        );

        tabbedPanel.addTab("Physical Information", physicalPanel);

        jRegisterTable.setBackground(new java.awt.Color(204, 204, 204));
        jRegisterTable.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jRegisterTable.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jRegisterTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Default", "STUDENT NAME", "NGO", "HIGHEST EDUCATION", "GENDER", "AGE", "COUNSELLOR"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jRegisterTable.setGridColor(new java.awt.Color(56, 90, 174));
        jRegisterTable.setIntercellSpacing(new java.awt.Dimension(5, 5));
        jRegisterTable.setPreferredSize(new java.awt.Dimension(2193, 1202));
        jRegisterTable.setSelectionBackground(new java.awt.Color(240, 178, 62));
        jRegisterTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRegisterTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jRegisterTable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane1))
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1020, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tabbedPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(1216, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tabbedPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(201, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(485, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAcceptRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptRequestActionPerformed

        int index = jRegisterTable.getSelectedRow();

        if(index<0){
            JOptionPane.showMessageDialog(null, "Kindly select a row to accept/reject the child");
            return;
        }

        AssignToCollegeWorkRequest assignToCollegeWorkRequest=(AssignToCollegeWorkRequest)jRegisterTable.getModel().getValueAt(index, 0);
        int comboIndex = jComboBox1.getSelectedIndex();
        if(comboIndex==0){
            assignToCollegeWorkRequest.setAcceptedByCollege(true);
        }
        else{
            assignToCollegeWorkRequest.setAcceptedByCollege(false);
            String response = JOptionPane.showInputDialog("Kindly enter a reason");
            assignToCollegeWorkRequest.setRejectionMessageByCollege(response);
        }
        populateTable();
        JOptionPane.showMessageDialog(null, "Status Updated");
        dB4OUtil.storeSystem(system);
        tabbedPanel.setVisible(false);

    }//GEN-LAST:event_btnAcceptRequestActionPerformed

    private void jRegisterTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRegisterTableMouseClicked
        try{
            int index = jRegisterTable.getSelectedRow();
            if(index<0){
                JOptionPane.showMessageDialog(null, "Kindly select a row to accept/reject the child");
                return;
            }
            populateDetailedView();
            tabbedPanel.setVisible(true);
        
        }
        catch(Exception ex)
        {
            throw ex;
        }
    }//GEN-LAST:event_jRegisterTableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcceptRequest;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JPanel criminalPanel;
    private javax.swing.JPanel drugPanel;
    private javax.swing.JPanel familyBackPanel;
    private javax.swing.JPanel guardPanel;
    private javax.swing.JRadioButton guardYes;
    private javax.swing.JRadioButton guardlNo;
    private javax.swing.JRadioButton isPhysicalNo;
    private javax.swing.JRadioButton isPhysicalYes;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTable jRegisterTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton medicalNo;
    private javax.swing.JRadioButton medicalYes;
    private javax.swing.JPanel physicalPanel;
    private javax.swing.JRadioButton rbComputerNo1;
    private javax.swing.JRadioButton rbComputerYes1;
    private javax.swing.JRadioButton rbConvictedNo;
    private javax.swing.JRadioButton rbConvictedYes;
    private javax.swing.JRadioButton rbDrugsNo;
    private javax.swing.JRadioButton rbDrugsYes;
    private javax.swing.JRadioButton rbExtended;
    private javax.swing.JRadioButton rbNuclear;
    private javax.swing.JRadioButton rbSingleParent;
    private javax.swing.JTabbedPane tabbedPanel;
    private javax.swing.JRadioButton techNo;
    private javax.swing.JRadioButton techYes;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        ArrayList<AssignToCollegeWorkRequest> finalWorkRequests=new ArrayList<>();
        int loggedinID = system.getLogInUser().getLogInId();
    for(AssignToCollegeWorkRequest workRequest: system.getWorkQueue().getAssignToCollegeWorkRequests()){
        for(Network network:system.getNetworks())
        {
            for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterprises())
            {
                if(enterprise.getEnterpriseType().equals("College"))
                {
                    for(Organization organisation : enterprise.getOrganizationDirectory().getOrganisationList())
                    {
                       for(UserAccount userAccount : organisation.getUserAccountDirectory().getUserAccountList())
                       {
                           if(userAccount.getUniqueId()== loggedinID)
                           {
                              if(workRequest.getCollegeName().equals(enterprise.getName()))
                              {
                                  finalWorkRequests.add(workRequest);
                              }
                           }
                       }
                    }
                }
            }
        }
        DefaultTableModel model = (DefaultTableModel) jRegisterTable.getModel();
        model.setRowCount(0);
        jRegisterTable.getColumnModel().getColumn(0).setMinWidth(0);
        jRegisterTable.getColumnModel().getColumn(0).setMaxWidth(0);
        for(AssignToCollegeWorkRequest requests : finalWorkRequests)
        {
            if(!requests.isAcceptedByCollege() && requests.getRejectionMessageByCollege()== null)
            {
                Object[] row = new Object[7];
                row[0]=requests;
                row[1] = requests.getAssignToCounsellorWorkRequest().getEntryChildWorkRequest().getPerson().getName();
                row[2] = requests.getAssignToCounsellorWorkRequest().getEntryChildWorkRequest().getNgoName();
                row[3] = requests.getAssignToCounsellorWorkRequest().getEntryChildWorkRequest().getPerson().getEducation();
                row[4] = requests.getAssignToCounsellorWorkRequest().getEntryChildWorkRequest().getPerson().getGender();
                row[5] = requests.getAssignToCounsellorWorkRequest().getEntryChildWorkRequest().getPerson().getAge();
                row[6] = requests.getAssignToCounsellorWorkRequest().getCounsellor().getCounsellorName();
                model.addRow(row);
            }
        }
    }
  }
    private void populateDetailedView()
    {
        int rowNumber=jRegisterTable.getSelectedRow();
        if(rowNumber<0)
        {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }
        AssignToCollegeWorkRequest assignToCollegeWorkRequest= (AssignToCollegeWorkRequest) jRegisterTable.getModel().getValueAt(rowNumber, 0);
        int uniqueId=assignToCollegeWorkRequest.getAssignToCounsellorWorkRequest().getEntryChildWorkRequest().getPerson().getLoginId();
        for(AssignToCollegeWorkRequest assignToCollegeWorkRequest1:system.getWorkQueue().getAssignToCollegeWorkRequests())
        {
            if(assignToCollegeWorkRequest1.getAssignToCounsellorWorkRequest().getEntryChildWorkRequest().getPerson().getLoginId()==uniqueId)
            {
               GeneralInformation generalInformation=assignToCollegeWorkRequest.getAssignToCounsellorWorkRequest().getGeneralInformation();
               if(generalInformation.getFamilyType().equals("Nuclear"))
               {
                   rbNuclear.setSelected(true);
               }
               if(generalInformation.getFamilyType().equals("Single Parent"))
               {
                   rbSingleParent.setSelected(true);
               }
               if(generalInformation.getFamilyType().equals("Extended"))
               {
                   rbExtended.setSelected(true);
               }
               if(generalInformation.isCriminalHistory())
               {
                   rbConvictedYes.setSelected(true);
               }
               if(!generalInformation.isCriminalHistory())
               {
                   rbConvictedNo.setSelected(true);
               }
               if(generalInformation.isDrugHsitory())
               {
                   rbDrugsYes.setSelected(true);
               }
               if(!generalInformation.isDrugHsitory())
               {
                   rbDrugsNo.setSelected(true);
               }
               if(generalInformation.isBacklogs())
               {
                   guardYes.setSelected(true);
               }
               if(!generalInformation.isBacklogs())
               {
                   guardlNo.setSelected(true);
               }
               if(generalInformation.isComputerKnowldege())
               {
                   rbComputerYes1.setSelected(true);
               }
               if(!generalInformation.isComputerKnowldege())
               {
                   rbComputerNo1.setSelected(true);
               }
               if(generalInformation.isTechnicalKnowldege())
               {
                   techYes.setSelected(true);
               }
               if(!generalInformation.isTechnicalKnowldege())
               {
                   techNo.setSelected(true);
               }
               if(generalInformation.isPhysicalActive())
               {
                   isPhysicalYes.setSelected(true);
               }
               if(!generalInformation.isPhysicalActive())
               {
                   isPhysicalNo.setSelected(true);
               }
               if(generalInformation.isMedicalCondition())
               {
                   medicalYes.setSelected(true);
               }
               if(!generalInformation.isMedicalCondition())
               {
                   medicalNo.setSelected(true);
               }
            }
        }
    }
}
