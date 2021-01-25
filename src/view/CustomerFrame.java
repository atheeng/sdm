package view;

import com.DaoImpl.UserDaoImpl;
import com.Enum.RoleType;
import com.dao.UserDao;
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

    public CustomerFrame() {
        initComponents();
        loadUsers();
//        List<User> list=new
        
//        getUserList(list);
//        populateData();
//        UserDao u=new UserDaoImpl();
//        u.getAllUserList();
    }
    
   public void loadUsers(){
       UserDao ud = new UserDaoImpl();
       List<User> list = ud.getAllUsers();
       System.out.println("list fetch");
        UserModelTable model = new UserModelTable(list);
        customerTable.setModel(model);
        customerTable.getColumn("View").setCellRenderer(new ButtonRenderer());
        customerTable.getColumn("View").setCellEditor(new ButtonEditor(new JCheckBox()));this.setTitle("Table Example");
        customerTable.getColumn("Delete").setCellRenderer(new ButtonRenderer());
        customerTable.getColumn("Delete").setCellEditor(new ButtonEditor(new JCheckBox()));this.setTitle("Table Example");
        this.pack();
   }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        role = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        save = new javax.swing.JButton();
        update = new javax.swing.JButton();
        search = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        customerTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Customer Details"));
        jPanel1.setLayout(new java.awt.GridLayout(3, 2, 10, 20));

        jLabel1.setText("username");
        jPanel1.add(jLabel1);

        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        jPanel1.add(username);

        jLabel4.setText("password");
        jPanel1.add(jLabel4);
        jPanel1.add(password);

        jLabel2.setText("role");
        jPanel1.add(jLabel2);

        role.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roleActionPerformed(evt);
            }
        });
        jPanel1.add(role);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel2.setLayout(new java.awt.GridLayout(1, 4, 10, 0));

        save.setText("save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        jPanel2.add(save);

        update.setText("update");
        jPanel2.add(update);

        search.setText("search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel2.add(search);

        delete.setText("delete");
        jPanel2.add(delete);

        customerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "id", "username", "role"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
                .addGap(29, 29, 29))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void roleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roleActionPerformed

    private void customerTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerTableMouseClicked
        // TODO add your handling code here:
        String customerId = customerTable.getValueAt(customerTable.getSelectedRow(), 0).toString();
         UserDao ud = new UserDaoImpl();
        User u=ud.getById(Integer.parseInt(customerId));
        username.setText(u.getUsername());
        password.setText(u.getPassword());
        role.setText(u.getRole().toString());

    }//GEN-LAST:event_customerTableMouseClicked

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        String usernameText = username.getText();
        String passwordText = password.getText();
        String roles = role.getText().toUpperCase();
        RoleType roleText = RoleType.valueOf(roles);
//        User u = new User(usernameText, passwordText, roleText);
        UserDao userDao = new UserDaoImpl();
//        String result = userDao.save(u);
        JOptionPane.showMessageDialog(null,
                "WARNING.",
                "Warning",
                JOptionPane.WARNING_MESSAGE);
       loadUsers();

    }//GEN-LAST:event_saveActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable customerTable;
    private javax.swing.JButton delete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField role;
    private javax.swing.JButton save;
    private javax.swing.JButton search;
    private javax.swing.JButton update;
    private javax.swing.JTextField username;
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
