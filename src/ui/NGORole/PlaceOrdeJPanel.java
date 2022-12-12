/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.NGORole;

import model.Customer.Customer;
import model.DatabaseUtility.DB4OUtil;
import model.EcoSystem;
import model.Enterprise.Enterprise;
import model.NetworkLink.Network;
import model.Organization;
import model.FoodCatering.FoodItem;
import model.UserAccount.UserAccount;
import model.ServiceQueue.Cart;
import model.ServiceQueue.PlaceOrderWorkRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author harsh
 */
public class PlaceOrdeJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageOrdeJPanel
     */
    private final EcoSystem system;
    private List<Cart> orderItems;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    public PlaceOrdeJPanel(EcoSystem system) {
       orderItems = new ArrayList<Cart>();
        initComponents();
        this.system=system;
        populateComboBox();
        populateTable();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        JMenu = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        JCart = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnPlaceOrder = new javax.swing.JButton();
        btnRemoveItem = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtMessage = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 102, 102));
        setPreferredSize(new java.awt.Dimension(2193, 1202));

        jLabel1.setBackground(new java.awt.Color(0, 102, 102));
        jLabel1.setFont(new java.awt.Font("Adobe Devanagari", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PLACE ORDER");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setOpaque(true);

        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Adobe Devanagari", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("RESTAURANT");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

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
                "ITEM NAME", "AVAILABLITY"
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
        jScrollPane2.setViewportView(JMenu);

        JCart.setBackground(new java.awt.Color(204, 204, 204));
        JCart.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        JCart.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        JCart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ITEM NAME", "QUANTITY"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(JCart);

        jLabel2.setFont(new java.awt.Font("Adobe Devanagari", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CART ");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnPlaceOrder.setBackground(new java.awt.Color(0, 51, 102));
        btnPlaceOrder.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnPlaceOrder.setForeground(new java.awt.Color(204, 204, 204));
        btnPlaceOrder.setText("PLACE ORDER");
        btnPlaceOrder.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPlaceOrder.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPlaceOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaceOrderActionPerformed(evt);
            }
        });

        btnRemoveItem.setBackground(new java.awt.Color(0, 51, 102));
        btnRemoveItem.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnRemoveItem.setForeground(new java.awt.Color(204, 204, 204));
        btnRemoveItem.setText("REMOVE ITEM");
        btnRemoveItem.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRemoveItem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRemoveItem.setInheritsPopupMenu(true);
        btnRemoveItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveItemActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Adobe Devanagari", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("MESSAGE");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txtTotal.setEditable(false);
        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Adobe Devanagari", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("TOTAL");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txtMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMessageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btnPlaceOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btnRemoveItem, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(1567, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 1037, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPlaceOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemoveItem, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(655, 655, 655))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void JMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMenuMouseClicked
         try{
            int rowNumber=JMenu.getSelectedRow();
           if(JMenu.getModel().getValueAt(rowNumber, 1).equals("Out Of Stock"))
           {
               JOptionPane.showMessageDialog(null, "Item Out of Stock .Please wait until next in stock");
           }
           else{
               Cart cart =new Cart();
               cart.setItemName((String) JMenu.getModel().getValueAt(rowNumber, 0));
               cart.setQuantity(1);
               orderItems.add(cart);
               populateTableCart();
           }
        }
        catch(Exception e)
        {
            throw  e;
        }
    }//GEN-LAST:event_JMenuMouseClicked

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        try {
            populateTable();
            orderItems.removeAll(orderItems);
            populateTableCart();

        } catch (Exception e) {
        }
               
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void btnRemoveItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveItemActionPerformed
       try{
        int rowNumber=JCart.getSelectedRow();
        if(rowNumber<0)
        {
            JOptionPane.showMessageDialog(null, "Please select item in cart");
        }
        else{
        orderItems.remove(rowNumber);
        populateTableCart();
        JOptionPane.showMessageDialog(null, "User Deleted Succesfully");
       }
       }
       catch(Exception ex)
       {
           throw ex;
       }
    }//GEN-LAST:event_btnRemoveItemActionPerformed

    private void btnPlaceOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaceOrderActionPerformed
        try{
            int total=0;
        if(orderItems.size()<=0)
        {
            JOptionPane.showMessageDialog(null, "Please add items to cart, it cannot be empty");
        }
        else{
            PlaceOrderWorkRequest placeOrderWorkRequest = new PlaceOrderWorkRequest();
             for(int i=0;i<orderItems.size();i++)
             {
                 if(!String.valueOf(orderItems.get(i).getQuantity()).equals(String.valueOf(JCart.getValueAt(i, 1))))
                {
                    orderItems.get(i).setQuantity(Integer.parseInt(JCart.getValueAt(i, 1).toString()));
                }
                 total=(orderItems.size());
                 txtTotal.setText(String.valueOf(total));
                 placeOrderWorkRequest.setItemsWithQuatityList(orderItems.get(i));
             }
         
            placeOrderWorkRequest.setMessage(txtMessage.getText());
            int uniqueId=system.getLogInUser().getLogInId();
            for (Network network : system.getNetworks())
            {
                for(Enterprise enterprise:network.getEnterpriseDirectory().getEnterprises())
                {
                    for(Organization organization:enterprise.getOrganizationDirectory().getOrganisationList())
                    {
                        for(UserAccount userAccount : organization.getUserAccountDirectory().getUserAccountList())
                        {
                            if(userAccount.getUniqueId()==uniqueId)
                            {
                                Customer customer=new Customer();
                                customer.setName(userAccount.getEmployee().getName());
                                customer.setCustomerId(uniqueId);
                                placeOrderWorkRequest.setCustomer(customer);
                            }
                        }
                    }
                }
            }

            for (Network network : system.getNetworks())
            {
                for(Enterprise enterprise:network.getEnterpriseDirectory().getEnterprises())
                {
                    if(enterprise.getName()==jComboBox1.getSelectedItem())
                    {
                        placeOrderWorkRequest.setRestaurant(enterprise.getRestaurant());
                    }
                }
            }
            placeOrderWorkRequest.setRequestDate(new Date());
            placeOrderWorkRequest.setStatus("Ordered");
            
            system.getWorkQueue().setWorkRequestList(placeOrderWorkRequest);
            dB4OUtil.storeSystem(system);
            JOptionPane.showMessageDialog(null, "Ordered Placed Successfully");
            txtTotal.setText("");
            orderItems.removeAll(orderItems);
            populateTableCart();
        }
        }
        catch(Exception ex)
        {
            throw ex;
        }
    }//GEN-LAST:event_btnPlaceOrderActionPerformed

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed

    private void txtMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMessageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMessageActionPerformed
    private  void populateComboBox(){
        try {
            DefaultComboBoxModel model = (DefaultComboBoxModel) jComboBox1.getModel();
         model.removeAllElements();
         for(Network network :system.getNetworks())
         {
             for(Enterprise enterprise:network.getEnterpriseDirectory().getEnterprises())
             {
                 if(enterprise.getEnterpriseType().equals("Restaurant"))
                 {
                      model.addElement(enterprise.getName());
                 }
             }
         }
        jComboBox1.setModel(model);
        this.add(jComboBox1);  
        } catch (Exception e) {
        }
        
    }
     private  void populateTable(){
         try {
             DefaultTableModel model = (DefaultTableModel) JMenu.getModel();
             model.setRowCount(0);
             for(Network network :system.getNetworks())
            {
                for(Enterprise enterprise:network.getEnterpriseDirectory().getEnterprises())
                {
                    if(enterprise.getEnterpriseType().equals("Restaurant") && enterprise.getName().equals(jComboBox1.getSelectedItem()) )
                    {
                          for (FoodItem foodItem : enterprise.getRestaurant().getMenu().getItems()) {
                                      Object[] row = new Object[3];
                                      row[0] = foodItem.getName();
                                      row[1] = foodItem.isInStock();
                                      model.addRow(row);
                                    }
                              return;
                    }

                }
            }
         } catch (Exception e) {
             throw e;
         }
         
    }
     private  void populateTableCart(){
         try{
         DefaultTableModel model = (DefaultTableModel) JCart.getModel();
         model.setRowCount(0);
         
         for(Cart item:orderItems)
         {
            Object[] row = new Object[3];
            row[0] = item.getItemName();
            row[1] = item.getQuantity();
            
            model.addRow(row);
         }
         
         }
         catch(Exception ex)
         {
             throw ex;
         }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JCart;
    private javax.swing.JTable JMenu;
    private javax.swing.JButton btnPlaceOrder;
    private javax.swing.JButton btnRemoveItem;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField txtMessage;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
