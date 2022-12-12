/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.RestaurantAdminRole;

import model.DatabaseUtility.DB4OUtil;
import model.EcoSystem;
import model.Enterprise.Enterprise;
import model.NetworkLink.Network;
import model.Organization;
import model.FoodCatering.FoodItem;
import model.UserAccount.UserAccount;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 
 * @author harsh
 */
public class ManageMenuJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageMenuJPanel
     */
    private final EcoSystem system;  
    boolean validateNullOrEmpty=true;
    boolean validateRegex=true;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    public ManageMenuJPanel(EcoSystem system) {
        initComponents();
        this.system=system;
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JMenu = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        lblItem = new javax.swing.JLabel();
        lblAvailablity = new javax.swing.JLabel();
        btnAddItem = new javax.swing.JButton();
        btnUpdateItem = new javax.swing.JButton();
        cmbAvailablity = new javax.swing.JComboBox<>();
        txtItemName = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setBackground(new java.awt.Color(0, 102, 102));
        jLabel1.setFont(new java.awt.Font("Adobe Devanagari", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MENU");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setOpaque(true);

        JMenu.setBackground(new java.awt.Color(204, 204, 204));
        JMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        JMenu.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        JMenu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Item", "Availablity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JMenuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JMenu);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        lblItem.setFont(new java.awt.Font("Adobe Devanagari", 1, 14)); // NOI18N
        lblItem.setForeground(new java.awt.Color(255, 255, 255));
        lblItem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblItem.setText("ITEM NAME  :");
        lblItem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblAvailablity.setFont(new java.awt.Font("Adobe Devanagari", 1, 14)); // NOI18N
        lblAvailablity.setForeground(new java.awt.Color(255, 255, 255));
        lblAvailablity.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAvailablity.setText("AVAILABLITY :");
        lblAvailablity.setFocusable(false);
        lblAvailablity.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnAddItem.setBackground(new java.awt.Color(0, 51, 102));
        btnAddItem.setFont(new java.awt.Font("Adobe Devanagari", 1, 12)); // NOI18N
        btnAddItem.setForeground(new java.awt.Color(204, 204, 204));
        btnAddItem.setText("ADD ITEM");
        btnAddItem.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAddItem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAddItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddItemActionPerformed(evt);
            }
        });

        btnUpdateItem.setBackground(new java.awt.Color(0, 51, 102));
        btnUpdateItem.setFont(new java.awt.Font("Adobe Devanagari", 1, 12)); // NOI18N
        btnUpdateItem.setForeground(new java.awt.Color(204, 204, 204));
        btnUpdateItem.setText("UPDATE ITEM");
        btnUpdateItem.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnUpdateItem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUpdateItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateItemActionPerformed(evt);
            }
        });

        cmbAvailablity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "In Stock ", "Out Of Stock" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblItem)
                    .addComponent(lblAvailablity, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(cmbAvailablity, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtItemName, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(btnAddItem, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnUpdateItem, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblItem, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtItemName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAvailablity, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(cmbAvailablity, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddItem, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdateItem, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(189, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(385, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(99, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddItemActionPerformed
       if(validateNullOrEmpty())
       {
           if(validateFields()){
               FoodItem foodItem=new FoodItem();
               foodItem.setName(txtItemName.getText());
               foodItem.setInStock((String) cmbAvailablity.getSelectedItem());
                try {
                      int uniqueId=system.getLogInUser().getLogInId();
                      for(Network network :system.getNetworks())
                      {
                          for(Enterprise enterprise:network.getEnterpriseDirectory().getEnterprises())
                          {
                              if(enterprise.getEnterpriseType().equals("Restaurant"))
                              {
                                  for(Organization organization:enterprise.getOrganizationDirectory().getOrganisationList())
                                  {
                                      for(UserAccount userAccount :organization.getUserAccountDirectory().getUserAccountList())
                                      {
                                          if(userAccount.getUniqueId()== system.getLogInUser().getLogInId())
                                          {
                                              enterprise.getRestaurant().getMenu().getItems().add(foodItem);
                                              populateTable();
                                              reset();
                                          }

                                      }
                                  }
                              }
                              
                          }
                      }
                        dB4OUtil.storeSystem(system);
                        JOptionPane.showMessageDialog(null, "Item Added to the menu successfully");
                } catch (Exception e) {
                    throw e;
                }
           }
           else{
               JOptionPane.showMessageDialog(this, "Validation Failed .Please check the red boxes");
                validateNullOrEmpty=true;
                validateRegex=true;
           }
       }
       else{
           JOptionPane.showMessageDialog(this, "Validation Failed .Please check the red boxes");
            validateNullOrEmpty=true;
            validateRegex=true;
       }
    }//GEN-LAST:event_btnAddItemActionPerformed

    private void JMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMenuMouseClicked
        try{
           int rowNumber=JMenu.getSelectedRow();
            txtItemName.setText(JMenu.getModel().getValueAt(rowNumber, 0).toString());
            cmbAvailablity.setSelectedItem(JMenu.getModel().getValueAt(rowNumber, 2).toString());    
       }
      catch(Exception e)
      {
          throw  e;
      }
    }//GEN-LAST:event_JMenuMouseClicked

    private void btnUpdateItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateItemActionPerformed
       
        int selectedRowIndex=JMenu.getSelectedRow();
        if(selectedRowIndex<0)
        {
            JOptionPane.showMessageDialog(this, "Select a row before updating");
                    return;
        }
        FoodItem foodItem=new FoodItem();
       foodItem.setName(txtItemName.getText());
       foodItem.setInStock((String) cmbAvailablity.getSelectedItem());
//        try {
//              int uniqueId=system.getLogInUser().getLogInId();
//                for (Restaurant restaurant : system.getRestaurantDirectory().getRestaurants()) {
//                   if(restaurant.getUniqueId()==uniqueId)
//                   {
//                      restaurant.getMenu().getMenu().set(selectedRowIndex, foodItem);
//                       populateTable();
//                       reset();
//                   }
//                }
//                dB4OUtil.storeSystem(system);
//                JOptionPane.showMessageDialog(null, "Item Updated to the Menu Successfully");
//        } catch (Exception e) {
//            throw e;
//        }
    }//GEN-LAST:event_btnUpdateItemActionPerformed
private void populateTable() {
    try {
        DefaultTableModel model = (DefaultTableModel) JMenu.getModel();
        model.setRowCount(0);
       for(Network network :system.getNetworks())
                      {
                          for(Enterprise enterprise:network.getEnterpriseDirectory().getEnterprises())
                          {
                              if(enterprise.getEnterpriseType().equals("Restaurant"))
                              {
                                  for(Organization organization:enterprise.getOrganizationDirectory().getOrganisationList())
                                  {
                                      for(UserAccount userAccount :organization.getUserAccountDirectory().getUserAccountList())
                                      {
                                          if(userAccount.getUniqueId()== system.getLogInUser().getLogInId())
                                          {
                                            for (FoodItem foodItem : enterprise.getRestaurant().getMenu().getItems()) {
                                              Object[] row = new Object[3];
                                                        row[0] = foodItem.getName();
                                                        row[1] = foodItem.isInStock();
                                                        model.addRow(row);
                                            }
                                          }

                                      }
                                  }
                              }
                              
                          }
                      }
    } catch (Exception e) {
    }
       
            }
    private void reset() {
            txtItemName.setText("");
            cmbAvailablity.setSelectedIndex(0);
        }
    private  boolean validateNullOrEmpty()
    {
        validateNullOrEmpty=true;
        if(txtItemName.getText().trim().isEmpty() || txtItemName.getText()==null)
        {
            validateNullOrEmpty=false;
            txtItemName.setToolTipText("Please Enter Item Name");
            txtItemName.setBorder(BorderFactory.createLineBorder(Color.red,1));
        }
        if(!txtItemName.getText().trim().isEmpty() && txtItemName.getText()!=null)
        {
            txtItemName.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
        }
        return  validateNullOrEmpty;
    }
    private  boolean  validateFields()
    {
        validateRegex=true;
        return validateRegex;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JMenu;
    private javax.swing.JButton btnAddItem;
    private javax.swing.JButton btnUpdateItem;
    private javax.swing.JComboBox<String> cmbAvailablity;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAvailablity;
    private javax.swing.JLabel lblItem;
    private javax.swing.JTextField txtItemName;
    // End of variables declaration//GEN-END:variables
}
