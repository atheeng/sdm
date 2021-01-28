package view;

import com.DaoImpl.UserDaoImpl;
import com.Enum.RoleType;
import com.dao.UserDao;
import com.dashboard.Dashboard;
import com.db.DataBaseConnection;
import com.dto.UserModelTable;
import com.model.User;
import com.utils.ButtonEditor;
import com.utils.ButtonRenderer;
import com.utils.TableWithButtonDemo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class CustomerFrame extends javax.swing.JFrame {

    User user;
    String customerId;

    public CustomerFrame() {
        initComponents();
        loadUsers();
        if (txt_username.getText() != "") {
        }

    }

    public void loadUsers() {
        UserDao ud = new UserDaoImpl();
        List<User> list = ud.getAllUsers();
        UserModelTable model = new UserModelTable(list);
        customerTable.setModel(model);
//        customerTable.getColumn("View").setCellRenderer(new ButtonRenderer());
//        customerTable.getColumn("View").setCellEditor(new ButtonEditor(new JCheckBox()));
//        this.setTitle("Table Example");
//        customerTable.getColumn("Delete").setCellRenderer(new ButtonRenderer());
//        customerTable.getColumn("Delete").setCellEditor(new ButtonEditor(new JCheckBox()));
//        this.setTitle("Table Example");
//        this.pack();
    }

    public void loginUserDetails(User user) {
        this.user = user;
        jLabel8.setText("WELCOME "+user.getUsername());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txt_first_name = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_last_name = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_password = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        cb_role = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txt_address = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_mobile_no = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        save = new javax.swing.JButton();
        update = new javax.swing.JButton();
        search = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        customerTable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        dashboard = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Customer Details"));
        jPanel1.setLayout(new java.awt.GridLayout(7, 2, 10, 10));

        jLabel3.setText("first name");
        jPanel1.add(jLabel3);

        txt_first_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_first_nameActionPerformed(evt);
            }
        });
        jPanel1.add(txt_first_name);

        jLabel5.setBackground(new java.awt.Color(102, 102, 0));
        jLabel5.setText("last name");
        jPanel1.add(jLabel5);

        txt_last_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_last_nameActionPerformed(evt);
            }
        });
        jPanel1.add(txt_last_name);

        jLabel1.setBackground(java.awt.SystemColor.activeCaption);
        jLabel1.setText("username");
        jPanel1.add(jLabel1);

        txt_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usernameActionPerformed(evt);
            }
        });
        jPanel1.add(txt_username);

        jLabel4.setBackground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("password");
        jPanel1.add(jLabel4);

        txt_password.setText("jPasswordField1");
        jPanel1.add(txt_password);

        jLabel2.setText("role");
        jPanel1.add(jLabel2);

        cb_role.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADMIN", "MANAGER", "CUSTOMER" }));
        jPanel1.add(cb_role);

        jLabel6.setText("address");
        jPanel1.add(jLabel6);
        jPanel1.add(txt_address);

        jLabel7.setText("mobile number");
        jPanel1.add(jLabel7);
        jPanel1.add(txt_mobile_no);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel2.setLayout(new java.awt.GridLayout(1, 4, 10, 0));

        save.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        save.setForeground(new java.awt.Color(0, 0, 255));
        save.setText("save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        jPanel2.add(save);

        update.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        update.setForeground(new java.awt.Color(0, 226, 0));
        update.setText("update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel2.add(update);

        search.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        search.setForeground(new java.awt.Color(0, 153, 153));
        search.setText("search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel2.add(search);

        delete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 0, 51));
        delete.setText("delete");
        jPanel2.add(delete);

        customerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "username", "full name", "role", "address", "contact no", "action"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        customerTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customerTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(customerTable);

        dashboard.setText("DASHBOARD");
        dashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashboardActionPerformed(evt);
            }
        });

        jLabel8.setText("WELCOME TO");

        logout.setText("LOGOUT");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(logout))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dashboard)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logout))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 674, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_first_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_first_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_first_nameActionPerformed

    private void customerTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerTableMouseClicked
        // TODO add your handling code here:
        customerId = customerTable.getValueAt(customerTable.getSelectedRow(), 0).toString();
        UserDao ud = new UserDaoImpl();
        User user = ud.getById(Integer.parseInt(customerId));
        txt_username.setText(user.getUsername());
        txt_first_name.setText(user.getFirstName());
        txt_last_name.setText(user.getLastName());
        txt_password.setText(user.getPassword());
        txt_address.setText(user.getAddress());
        txt_mobile_no.setText(user.getMobileNo());
        cb_role.setSelectedItem(user.getRole().toString());

    }//GEN-LAST:event_customerTableMouseClicked

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        String userName = txt_first_name.getText();
        String password = txt_password.getText();
        String roles = cb_role.getSelectedItem().toString();
        RoleType roleText = RoleType.valueOf(roles);
        String firstName = txt_first_name.getText();
        String lastName = txt_last_name.getText();
        String address = txt_address.getText();
        String mobileNo = txt_mobile_no.getText();
        User user = new User(userName, password, roleText, firstName, lastName, mobileNo, address);
        UserDao userDao = new UserDaoImpl();
       String result= userDao.saveUpdate(user);
        JOptionPane.showMessageDialog(null,
                result+"Saved. successfully",
                "Success",
                JOptionPane.WARNING_MESSAGE);
        loadUsers();

    }//GEN-LAST:event_saveActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    private void txt_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usernameActionPerformed

    private void txt_last_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_last_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_last_nameActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        int userId = Integer.parseInt(customerId);
        String userName = txt_first_name.getText();
        String password = txt_password.getText();
        String roles = cb_role.getSelectedItem().toString();
        RoleType roleText = RoleType.valueOf(roles);
        String firstName = txt_first_name.getText();
        String lastName = txt_last_name.getText();
        String address = txt_address.getText();
        String mobileNo = txt_mobile_no.getText();
        User user=new User();
        user.setId(userId);
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setAddress(address);
        user.setRole(roleText);
        user.setUsername(userName);
        user.setPassword(password);
        user.setMobileNo(mobileNo);
        UserDao userDao=new UserDaoImpl();
       String result= userDao.saveUpdate(user);
       txt_first_name.setText("");
       txt_last_name.setText("");
       txt_address.setText("");
       txt_mobile_no.setText("");
       txt_username.setText("");
       txt_password.setText("");
           JOptionPane.showMessageDialog(null,
                result+"Updated successfully",
                "Success",
                JOptionPane.WARNING_MESSAGE);
        
        loadUsers();
    }//GEN-LAST:event_updateActionPerformed

    private void dashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboardActionPerformed
        this.setVisible(false);
        Dashboard landingPage = new Dashboard(user);
        landingPage.setVisible(true);
    }//GEN-LAST:event_dashboardActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        this.dispose();
        LoginForm loginForm = new LoginForm();
        loginForm.setVisible(true);
    }//GEN-LAST:event_logoutActionPerformed

    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerFrame().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb_role;
    private javax.swing.JTable customerTable;
    private javax.swing.JButton dashboard;
    private javax.swing.JButton delete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton logout;
    private javax.swing.JButton save;
    private javax.swing.JButton search;
    private javax.swing.JTextField txt_address;
    private javax.swing.JTextField txt_first_name;
    private javax.swing.JTextField txt_last_name;
    private javax.swing.JTextField txt_mobile_no;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_username;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables

    public void populateData() {
        Connection conn = null;
        try {
            conn = DataBaseConnection.getInstance().getConnection();
            System.out.println("conn:" + conn);
            int rows = 0;
            int rowIndex = 0;
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM USER");
            if (rs.next()) {
                rs.last();
                rows = rs.getRow();
                rs.beforeFirst();
            }
            String data[][] = new String[rows][3];
            while (rs.next()) {
                data[rowIndex][0] = rs.getInt(1) + "";
                data[rowIndex][1] = rs.getString(3);
                data[rowIndex][2] = rs.getString(4);
                rowIndex++;
            }
            String cols[] = {"id", "username", "role"};
            DefaultTableModel table = new DefaultTableModel(data, cols);
            customerTable.setModel(table);
            rs.close();
            statement.close();
        } catch (Exception e) {
            System.out.println("data can not retrieve");
        }
    }

    public void tableShow(List<User> u) {
        //create the model
        UserModelTable model = new UserModelTable(u);

        //create the table
        customerTable.setModel(model);
        this.setTitle("Table Example");
        this.pack();
    }
}
