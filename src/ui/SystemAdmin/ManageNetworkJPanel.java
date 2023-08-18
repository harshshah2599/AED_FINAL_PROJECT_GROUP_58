/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.SystemAdmin;

import model.DatabaseUtility.DB4OUtil;
import model.EcoSystem;
import model.NetworkLink.Network;
import com.github.javafaker.Faker;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author harsh
 */
public class ManageNetworkJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageCustomersJPanel
     */
    private final EcoSystem system; 
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    public ManageNetworkJPanel(EcoSystem system) {
        initComponents();
       this.system = system;
       fakerImplement();
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jRegisterTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        btnCreateNetwork = new javax.swing.JButton();
        btnModifyNetwork = new javax.swing.JButton();
        btnDeleteNetwork = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 102, 102));
        setMaximumSize(new java.awt.Dimension(2293, 1232));
        setPreferredSize(new java.awt.Dimension(2193, 1202));

        jRegisterTable.setBackground(new java.awt.Color(204, 204, 204));
        jRegisterTable.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jRegisterTable.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jRegisterTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Default", "Network Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jRegisterTable.setGridColor(new java.awt.Color(56, 90, 174));
        jRegisterTable.setSelectionBackground(new java.awt.Color(240, 178, 62));
        jRegisterTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRegisterTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jRegisterTable);

        jLabel1.setFont(new java.awt.Font("Adobe Devanagari", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Networks");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel4.setFont(new java.awt.Font("Adobe Devanagari", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Name :");

        btnCreateNetwork.setBackground(new java.awt.Color(0, 51, 102));
        btnCreateNetwork.setFont(new java.awt.Font("Adobe Devanagari", 1, 14)); // NOI18N
        btnCreateNetwork.setForeground(new java.awt.Color(204, 204, 204));
        btnCreateNetwork.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/add1.png"))); // NOI18N
        btnCreateNetwork.setText("Create Network");
        btnCreateNetwork.setToolTipText("");
        btnCreateNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateNetworkActionPerformed(evt);
            }
        });

        btnModifyNetwork.setBackground(new java.awt.Color(0, 51, 102));
        btnModifyNetwork.setFont(new java.awt.Font("Adobe Devanagari", 1, 14)); // NOI18N
        btnModifyNetwork.setForeground(new java.awt.Color(204, 204, 204));
        btnModifyNetwork.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/edit1.png"))); // NOI18N
        btnModifyNetwork.setText("Update Network");
        btnModifyNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyNetworkActionPerformed(evt);
            }
        });

        btnDeleteNetwork.setBackground(new java.awt.Color(0, 51, 102));
        btnDeleteNetwork.setFont(new java.awt.Font("Adobe Devanagari", 1, 14)); // NOI18N
        btnDeleteNetwork.setForeground(new java.awt.Color(204, 204, 204));
        btnDeleteNetwork.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/del.png"))); // NOI18N
        btnDeleteNetwork.setText("Delete Network");
        btnDeleteNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteNetworkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1007, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1026, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 1161, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCreateNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, 152, Short.MAX_VALUE)
                    .addComponent(btnModifyNetwork, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                    .addComponent(btnDeleteNetwork, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCreateNetwork, btnModifyNetwork});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(btnCreateNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDeleteNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(334, 334, 334)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnModifyNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(724, 724, 724))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnCreateNetwork, btnModifyNetwork});

    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateNetworkActionPerformed
    try {
        String networkName = txtName.getText();
        if(networkName.trim().isEmpty() || networkName == null)
        {
            txtName.setBorder(BorderFactory.createLineBorder(Color.BLUE));
            txtName.setToolTipText("Please enter a network");
           JOptionPane.showMessageDialog(null, "Validation failed, please check the blue box");
           return;
        }
      if(!networkName.trim().isEmpty()|| networkName==null)
      {
          txtName.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
      }
        if(networkName.equals(""))
        {
            System.out.println("Network "+networkName+" added");
            JOptionPane.showMessageDialog(null, "Please enter network name");
            return;
        }
        for (Network network : system.getNetworks()) {
            if(network.getNetworkName().equals(networkName))
            {
                System.out.println("Network with this name already exist");
                JOptionPane.showMessageDialog(null, "Network with this name already exists");
                return;
            }
        }
     
        Network network = new  Network();
        network.setNetworkName(networkName);
        system.getNetworks().add(network);
        dB4OUtil.storeSystem(system);
        populateTable();
        reset();
        JOptionPane.showMessageDialog(null, "Netwrok added successfully");
    } catch (Exception e) {
       
        throw e;
    }
    }//GEN-LAST:event_btnCreateNetworkActionPerformed

    private void btnModifyNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyNetworkActionPerformed
    try{
        int index=0;
        int selectedRowIndex=jRegisterTable.getSelectedRow();
        if(selectedRowIndex<0)
        {
            JOptionPane.showMessageDialog(this, "Select a row before updating");
                    return;
        }
        for (Network network : system.getNetworks()) {
			
            String network1 = txtName.getText();
      		if(network1.trim().isEmpty()|| network1==null){
				txtName.setBorder(BorderFactory.createLineBorder (Color.BLUE));
				txtName.setToolTipText("Please Enter A Network");
				JOptionPane.showMessageDialog(this, "Validation Failed .Please check the blue box");
				return;
			}
			if(!network1.trim().isEmpty()|| network1==null){
			txtName.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
			}
			
            if(network.getNetworkName().equals(txtName.getText()) && selectedRowIndex != index)
            {
                System.out.println("Network with this name already exist");
                JOptionPane.showMessageDialog(null, "Network with this name already exists");
                return;
            }
            else{
                index++;
            }
        }
        Network network = new  Network();
        
        network.setNetworkName(txtName.getText());
        system.getNetworks().set(selectedRowIndex,network);
        populateTable();
        reset();
        dB4OUtil.storeSystem(system);
        System.out.println("Network with"+ network.getNetworkName()+"updated succesfully");
        JOptionPane.showMessageDialog(null, "Network Updated Succesfully");
    }
    catch(Exception e)
    {
        throw e;
    }
    }//GEN-LAST:event_btnModifyNetworkActionPerformed

    private void btnDeleteNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteNetworkActionPerformed
    try{
        int selectedRowIndex=jRegisterTable.getSelectedRow();
        if(selectedRowIndex<0)
        {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }
        else{
            Network network=(Network) jRegisterTable.getValueAt(selectedRowIndex, 0);
            system.getNetworks().remove(network);
            populateTable();
            dB4OUtil.storeSystem(system);
            System.out.println("Network with"+ network.getNetworkName()+"deleted succesfully");
            JOptionPane.showMessageDialog(null, "Network Deleted Succesfully");
            reset();
        }
    }
    catch(Exception e)
    {
        throw e;
    }
    }//GEN-LAST:event_btnDeleteNetworkActionPerformed

    private void jRegisterTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRegisterTableMouseClicked
       try{
           txtName.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
           int rowNumber=jRegisterTable.getSelectedRow();
            txtName.setText(jRegisterTable.getModel().getValueAt(rowNumber, 1).toString());
       }
      catch(Exception e)
      {
          throw  e;
      }
    }//GEN-LAST:event_jRegisterTableMouseClicked
    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) jRegisterTable.getModel();
        model.setRowCount(0);
        jRegisterTable.getColumnModel().getColumn(0).setMinWidth(0);
        jRegisterTable.getColumnModel().getColumn(0).setMaxWidth(0);
        if(system.getNetworks()==null)
        {
            return;
        }
        for (Network network : system.getNetworks()) {
                    Object[] row = new Object[3];
                    row[0]=network;
                    row[1] = network.getNetworkName();
                    model.addRow(row);
            }
        
    }
    private void reset() {
            txtName.setText("");
        }
    private void fakerImplement()
    {
        try{
             Faker faker = new Faker();
             Network network = new Network();
             network.setNetworkName(faker.country().name());
             system.getNetworks().add(network);
             System.out.println("Faker implemented");
             reset();
        }
        catch(Exception ex)
        {
            throw ex;
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateNetwork;
    private javax.swing.JButton btnDeleteNetwork;
    private javax.swing.JButton btnModifyNetwork;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTable jRegisterTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}