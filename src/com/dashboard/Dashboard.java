package com.dashboard;

import com.DaoImpl.UserDaoImpl;
import com.dao.UserDao;
import com.dto.UserModelTable;
import com.model.User;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import view.CustomerFrame;
import view.ProductFrame;

public class Dashboard extends javax.swing.JFrame {

    User user;

    public Dashboard() {
        initComponents();
    }

    public Dashboard(User user) {
        initComponents();
        this.user = user;
        display_user.setText("Welcome to " + user.getUsername());
        display_user.setEditable(false);
//        productMenu.setVisible(false);
        if (user.getRole().toString() == "USER") {

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        display_user = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        customerMenu = new javax.swing.JMenu();
        productMenu = new javax.swing.JMenu();
        orderMenu = new javax.swing.JMenu();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jMenu1.setText("File");
        jMenuBar2.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar2.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.setText("jTextField1");

        jTextField2.setText("jTextField2");

        jTextField3.setText("jTextField3");

        display_user.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        display_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                display_userActionPerformed(evt);
            }
        });

        customerMenu.setText("customer");
        customerMenu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        customerMenu.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                customerMenuMenuSelected(evt);
            }
        });
        customerMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerMenuActionPerformed(evt);
            }
        });
        jMenuBar1.add(customerMenu);

        productMenu.setText("products");
        productMenu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        productMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productMenuMouseClicked(evt);
            }
        });
        productMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productMenuActionPerformed(evt);
            }
        });
        jMenuBar1.add(productMenu);

        orderMenu.setText("orders");
        orderMenu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuBar1.add(orderMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 330, Short.MAX_VALUE)
                .addComponent(display_user, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(display_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 258, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void customerMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerMenuActionPerformed

    }//GEN-LAST:event_customerMenuActionPerformed

    private void customerMenuMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_customerMenuMenuSelected
        CustomerFrame customerFrame = new CustomerFrame();
        customerFrame.loadUsers();
        customerFrame.loginUserDetails(user);
        this.setVisible(false);
        customerFrame.setVisible(true);
    }//GEN-LAST:event_customerMenuMenuSelected

    private void display_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_display_userActionPerformed

    }//GEN-LAST:event_display_userActionPerformed

    private void productMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productMenuActionPerformed

    }//GEN-LAST:event_productMenuActionPerformed

    private void productMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productMenuMouseClicked
        JOptionPane.showMessageDialog(this, "product");
        ProductFrame productFrame = new ProductFrame();
        productFrame.loginUserDetails(user);
        this.setVisible(false);
        productFrame.setVisible(true);

    }//GEN-LAST:event_productMenuMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu customerMenu;
    private javax.swing.JTextField display_user;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JMenu orderMenu;
    private javax.swing.JMenu productMenu;
    // End of variables declaration//GEN-END:variables
}
