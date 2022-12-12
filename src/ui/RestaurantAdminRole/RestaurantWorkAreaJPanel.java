/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.RestaurantAdminRole;

import model.EcoSystem;
import javax.swing.JPanel;

/**
 *
 * @author harsh
 */
public class RestaurantWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RestaurantWorkAreaJPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    public RestaurantWorkAreaJPanel(JPanel userProcessContainer,EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.ecosystem=ecosystem;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        btnManageMenu = new javax.swing.JButton();
        btnManageDeliveryMen = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnOrderHistory = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        btnManageMenu.setBackground(new java.awt.Color(0, 51, 102));
        btnManageMenu.setFont(new java.awt.Font("Adobe Devanagari", 1, 14)); // NOI18N
        btnManageMenu.setForeground(new java.awt.Color(204, 204, 204));
        btnManageMenu.setText("MANAGE MENU");
        btnManageMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageMenuActionPerformed(evt);
            }
        });

        btnManageDeliveryMen.setBackground(new java.awt.Color(0, 51, 102));
        btnManageDeliveryMen.setFont(new java.awt.Font("Adobe Devanagari", 1, 14)); // NOI18N
        btnManageDeliveryMen.setForeground(new java.awt.Color(204, 204, 204));
        btnManageDeliveryMen.setText("MANAGE ORDERS");
        btnManageDeliveryMen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageDeliveryMenActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/logout.png"))); // NOI18N

        btnOrderHistory.setBackground(new java.awt.Color(0, 51, 102));
        btnOrderHistory.setFont(new java.awt.Font("Adobe Devanagari", 1, 14)); // NOI18N
        btnOrderHistory.setForeground(new java.awt.Color(204, 204, 204));
        btnOrderHistory.setText("ORDER HISTORY");
        btnOrderHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderHistoryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnManageMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
            .addComponent(btnManageDeliveryMen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(btnOrderHistory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(87, 87, 87)
                .addComponent(btnManageMenu)
                .addGap(26, 26, 26)
                .addComponent(btnManageDeliveryMen)
                .addGap(26, 26, 26)
                .addComponent(btnOrderHistory)
                .addContainerGap(255, Short.MAX_VALUE))
        );

        jSplitPane.setLeftComponent(jPanel1);

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/RestaurantPlaceOrder.jpg"))); // NOI18N
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 709, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 524, Short.MAX_VALUE)
        );

        jSplitPane.setRightComponent(jPanel2);

        add(jSplitPane, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageMenuActionPerformed
    ManageMenuJPanel manageMenuJPanel =new ManageMenuJPanel(ecosystem);
    jSplitPane.setRightComponent(manageMenuJPanel); 
    }//GEN-LAST:event_btnManageMenuActionPerformed

    private void btnManageDeliveryMenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageDeliveryMenActionPerformed
    ManageOrdeJPanel manageOrdeJPanel=new ManageOrdeJPanel(ecosystem);
    jSplitPane.setRightComponent(manageOrdeJPanel); 
    }//GEN-LAST:event_btnManageDeliveryMenActionPerformed

    private void btnOrderHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderHistoryActionPerformed
    RestaurantOrderHistoryJPanel restaurantOrderHistoryJPanel=new RestaurantOrderHistoryJPanel(ecosystem);
    jSplitPane.setRightComponent(restaurantOrderHistoryJPanel); 
    }//GEN-LAST:event_btnOrderHistoryActionPerformed
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageDeliveryMen;
    private javax.swing.JButton btnManageMenu;
    private javax.swing.JButton btnOrderHistory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane;
    // End of variables declaration//GEN-END:variables
}
