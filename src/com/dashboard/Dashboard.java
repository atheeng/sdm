package com.dashboard;

import com.dao.daoImpl.UserDaoImpl;
import com.Enum.RoleType;
import com.dao.ProductDao;
import com.dao.UserDao;
import com.dao.daoImpl.ProductDaoImpl;
import com.dto.ProductModelTable;
import com.dto.UserModelTable;
import com.model.Product;
import com.model.User;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import view.CustomerFrame;
import view.LoginForm;
import view.ProductFrame;

public class Dashboard extends javax.swing.JFrame {
    
    User user;
    int txt_user_id = 0;
    int txt_product_id = 0;
    
    public Dashboard() {
        initComponents();
        
    }
    
    public Dashboard(User user) {
        initComponents();
        this.user = user;
        label_user.setText("WELCOME " + user.getUsername().toUpperCase());
        loadTableCustomer();
        loadTableProduct();
        
        if (user.getRole().toString() == "USER") {
            
        }
    }
    
    public void loadTableCustomer() {
        UserDao ud = new UserDaoImpl();
        List<User> list = ud.getAllUsers();
        UserModelTable model = new UserModelTable(list);
        customer_table.setModel(model);
    }
    
    public void loadTableProduct() {
        ProductDao pd = new ProductDaoImpl();
        List<Product> list = pd.getAllProduct();
        System.out.println("list" + list.size());
        ProductModelTable model = new ProductModelTable(list);
        product_table.setModel(model);
    }
    
    public void resetCustomerForm() {
        txt_user_username.setText("");
        txt_user_first_name.setText("");
        txt_user_password.setText("");
        cb_user_role.setSelectedIndex(0);
        txt_user_first_name.setText("");
        txt_user_last_name.setText("");
        txt_user_address.setText("");
        txt_user_mobile_no.setText("");
        txt_user_id = 0;
    }
    
    public void resetProductForm() {
        txt_product_name.setText("");
        txt_product_name.setEditable(true);
        txt_product_price.setText(null);
        txt_product_quantity.setText(null);
        cb_product_type.setSelectedIndex(0);
        cb_product_type.setEnabled(true);
        txt_product_description.setText("");
        txt_product_id = 0;
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
        orderTab = new javax.swing.JTabbedPane();
        customer_panel = new javax.swing.JPanel();
        user_password = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        txt_user_first_name = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txt_user_username = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txt_user_last_name = new javax.swing.JTextField();
        user_save_update = new javax.swing.JButton();
        user_delete = new javax.swing.JButton();
        cb_user_role = new javax.swing.JComboBox<>();
        txt_user_address = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txt_user_mobile_no = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_user_password = new javax.swing.JPasswordField();
        user_reset = new javax.swing.JButton();
        product_search_panel1 = new javax.swing.JPanel();
        customer_search = new javax.swing.JButton();
        txt_user_search_username = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        customer_table = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        reloadCustomerTable = new javax.swing.JButton();
        productPanel = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        txt_product_name = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txt_product_quantity = new javax.swing.JTextField();
        cb_product_type = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txt_product_price = new javax.swing.JTextField();
        product_save_update = new javax.swing.JButton();
        product_delete = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        txt_product_description = new javax.swing.JTextArea();
        reset_product = new javax.swing.JButton();
        product_search_panel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        product_table = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jTextField9 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        user_password1 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        txt_user_first_name1 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        txt_user_username1 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        txt_user_last_name1 = new javax.swing.JTextField();
        user_save_update1 = new javax.swing.JButton();
        user_delete1 = new javax.swing.JButton();
        cb_user_role1 = new javax.swing.JComboBox<>();
        txt_user_address1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_user_mobile_no1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_user_password1 = new javax.swing.JPasswordField();
        user_reset1 = new javax.swing.JButton();
        product_search_panel2 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jTextField11 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        label_user = new javax.swing.JLabel();
        logout = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jMenu1.setText("File");
        jMenuBar2.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar2.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.setText("jTextField1");

        jTextField2.setText("jTextField2");

        jTextField3.setText("jTextField3");

        user_password.setBorder(javax.swing.BorderFactory.createTitledBorder("Customer Form"));

        jLabel20.setText("First Name:");

        txt_user_first_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_user_first_nameActionPerformed(evt);
            }
        });

        jLabel21.setText("Last Name:");

        jLabel22.setText("Username:");

        jLabel23.setText("Address:");

        jLabel24.setText("Role:");

        user_save_update.setText("SAVE/UPDATE");
        user_save_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_save_updateActionPerformed(evt);
            }
        });

        user_delete.setText("DELETE");
        user_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_deleteActionPerformed(evt);
            }
        });

        cb_user_role.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT ROLE", "ADMIN", "MANAGER", "CUSTOMER" }));
        cb_user_role.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_user_roleActionPerformed(evt);
            }
        });

        txt_user_address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_user_addressActionPerformed(evt);
            }
        });

        jLabel1.setText("MobileNo:");

        jLabel7.setText("Password:");

        txt_user_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_user_passwordActionPerformed(evt);
            }
        });

        user_reset.setText("RESET");
        user_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_resetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout user_passwordLayout = new javax.swing.GroupLayout(user_password);
        user_password.setLayout(user_passwordLayout);
        user_passwordLayout.setHorizontalGroup(
            user_passwordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(user_passwordLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(user_passwordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(user_passwordLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(user_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(user_passwordLayout.createSequentialGroup()
                        .addGroup(user_passwordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(user_passwordLayout.createSequentialGroup()
                                .addComponent(user_save_update, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(user_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(user_passwordLayout.createSequentialGroup()
                                .addGroup(user_passwordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel24)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(32, 32, 32)
                                .addGroup(user_passwordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_user_address, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_user_first_name)
                                    .addComponent(txt_user_username)
                                    .addComponent(txt_user_last_name)
                                    .addComponent(cb_user_role, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_user_password)
                                    .addComponent(txt_user_mobile_no, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(10, 10, 10))))
        );
        user_passwordLayout.setVerticalGroup(
            user_passwordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(user_passwordLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(user_passwordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(txt_user_first_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(user_passwordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(txt_user_last_name, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(user_passwordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(txt_user_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(user_passwordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_user_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(user_passwordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_user_role, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addGap(18, 18, 18)
                .addGroup(user_passwordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(txt_user_address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(user_passwordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_user_mobile_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(13, 13, 13)
                .addComponent(user_reset)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(user_passwordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(user_delete)
                    .addComponent(user_save_update))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        product_search_panel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Customer Details"));

        customer_search.setText("SEARCH");
        customer_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customer_searchActionPerformed(evt);
            }
        });

        txt_user_search_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_user_search_usernameActionPerformed(evt);
            }
        });

        customer_table.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        customer_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "id", "username", "full name", "role", "address", "contact no"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        customer_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customer_tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(customer_table);
        if (customer_table.getColumnModel().getColumnCount() > 0) {
            customer_table.getColumnModel().getColumn(0).setHeaderValue("id");
            customer_table.getColumnModel().getColumn(1).setHeaderValue("username");
            customer_table.getColumnModel().getColumn(2).setHeaderValue("full name");
            customer_table.getColumnModel().getColumn(3).setHeaderValue("role");
            customer_table.getColumnModel().getColumn(4).setHeaderValue("address");
            customer_table.getColumnModel().getColumn(5).setHeaderValue("contact no");
        }

        jLabel2.setText("username");

        reloadCustomerTable.setText("Table Reload");
        reloadCustomerTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reloadCustomerTableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout product_search_panel1Layout = new javax.swing.GroupLayout(product_search_panel1);
        product_search_panel1.setLayout(product_search_panel1Layout);
        product_search_panel1Layout.setHorizontalGroup(
            product_search_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(product_search_panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(product_search_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(product_search_panel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 871, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(product_search_panel1Layout.createSequentialGroup()
                        .addComponent(reloadCustomerTable, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(29, 29, 29)
                        .addComponent(txt_user_search_username, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(customer_search, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
        );
        product_search_panel1Layout.setVerticalGroup(
            product_search_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, product_search_panel1Layout.createSequentialGroup()
                .addGroup(product_search_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(product_search_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(customer_search)
                        .addComponent(txt_user_search_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addGroup(product_search_panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(reloadCustomerTable)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout customer_panelLayout = new javax.swing.GroupLayout(customer_panel);
        customer_panel.setLayout(customer_panelLayout);
        customer_panelLayout.setHorizontalGroup(
            customer_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customer_panelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(user_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(product_search_panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(95, Short.MAX_VALUE))
        );
        customer_panelLayout.setVerticalGroup(
            customer_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customer_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(customer_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(product_search_panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, Short.MAX_VALUE)
                    .addComponent(user_password, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 245, Short.MAX_VALUE))
        );

        orderTab.addTab("Customer", customer_panel);

        productPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Product Form"));

        jLabel15.setText("Name");

        txt_product_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_product_nameActionPerformed(evt);
            }
        });

        jLabel16.setText("Type");

        jLabel17.setText("Quantity");

        cb_product_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Type", "Electronic_Media", "Foods", "Furniture_Appliances", "Clothing", "Books" }));

        jLabel18.setText("Description");

        jLabel19.setText("Unit Price");

        product_save_update.setText("SAVE/UPDATE");
        product_save_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                product_save_updateActionPerformed(evt);
            }
        });

        product_delete.setText("DELETE");
        product_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                product_deleteActionPerformed(evt);
            }
        });

        txt_product_description.setColumns(20);
        txt_product_description.setRows(5);
        jScrollPane4.setViewportView(txt_product_description);

        reset_product.setText("RESET");
        reset_product.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset_productActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel16)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_product_name)
                            .addComponent(txt_product_quantity)
                            .addComponent(cb_product_type, javax.swing.GroupLayout.Alignment.TRAILING, 0, 146, Short.MAX_VALUE)
                            .addComponent(txt_product_price)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(product_save_update, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(product_delete, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                            .addComponent(reset_product, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txt_product_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(cb_product_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txt_product_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel19))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txt_product_price, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(reset_product)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(product_delete)
                    .addComponent(product_save_update))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        product_search_panel.setBorder(javax.swing.BorderFactory.createTitledBorder("Product Details"));

        product_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Name", "Type", "Quantity", "Price", "Description"
            }
        ));
        product_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                product_tableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(product_table);

        jButton4.setText("SEARCH");

        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout product_search_panelLayout = new javax.swing.GroupLayout(product_search_panel);
        product_search_panel.setLayout(product_search_panelLayout);
        product_search_panelLayout.setHorizontalGroup(
            product_search_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(product_search_panelLayout.createSequentialGroup()
                .addGroup(product_search_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, product_search_panelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, product_search_panelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 891, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        product_search_panelLayout.setVerticalGroup(
            product_search_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, product_search_panelLayout.createSequentialGroup()
                .addGroup(product_search_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout productPanelLayout = new javax.swing.GroupLayout(productPanel);
        productPanel.setLayout(productPanelLayout);
        productPanelLayout.setHorizontalGroup(
            productPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(productPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(product_search_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        productPanelLayout.setVerticalGroup(
            productPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(productPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(productPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(product_search_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(224, Short.MAX_VALUE))
        );

        orderTab.addTab("Product", productPanel);

        user_password1.setBorder(javax.swing.BorderFactory.createTitledBorder("Customer Form"));

        jLabel25.setText("First Name:");

        txt_user_first_name1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_user_first_name1ActionPerformed(evt);
            }
        });

        jLabel26.setText("Last Name:");

        jLabel27.setText("Username:");

        jLabel28.setText("Address:");

        jLabel29.setText("Role:");

        user_save_update1.setText("SAVE/UPDATE");
        user_save_update1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_save_update1ActionPerformed(evt);
            }
        });

        user_delete1.setText("DELETE");

        cb_user_role1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT ROLE", "ADMIN", "MANAGER", "CUSTOMER" }));

        txt_user_address1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_user_address1ActionPerformed(evt);
            }
        });

        jLabel8.setText("MobileNo:");

        jLabel9.setText("Password:");

        txt_user_password1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_user_password1ActionPerformed(evt);
            }
        });

        user_reset1.setText("RESET");
        user_reset1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_reset1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout user_password1Layout = new javax.swing.GroupLayout(user_password1);
        user_password1.setLayout(user_password1Layout);
        user_password1Layout.setHorizontalGroup(
            user_password1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(user_password1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(user_password1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(user_password1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(user_reset1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(user_password1Layout.createSequentialGroup()
                        .addGroup(user_password1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(user_password1Layout.createSequentialGroup()
                                .addComponent(user_save_update1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(user_delete1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(user_password1Layout.createSequentialGroup()
                                .addGroup(user_password1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel26)
                                    .addComponent(jLabel29)
                                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addGap(32, 32, 32)
                                .addGroup(user_password1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_user_address1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_user_first_name1)
                                    .addComponent(txt_user_username1)
                                    .addComponent(txt_user_last_name1)
                                    .addComponent(cb_user_role1, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_user_password1)
                                    .addComponent(txt_user_mobile_no1, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(10, 10, 10))))
        );
        user_password1Layout.setVerticalGroup(
            user_password1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(user_password1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(user_password1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(txt_user_first_name1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(user_password1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(txt_user_last_name1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(user_password1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(txt_user_username1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(user_password1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt_user_password1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(user_password1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_user_role1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29))
                .addGap(18, 18, 18)
                .addGroup(user_password1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(txt_user_address1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(user_password1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_user_mobile_no1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(13, 13, 13)
                .addComponent(user_reset1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(user_password1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(user_delete1)
                    .addComponent(user_save_update1))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        product_search_panel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Product Details"));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(jTable3);

        jButton5.setText("SEARCH");

        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout product_search_panel2Layout = new javax.swing.GroupLayout(product_search_panel2);
        product_search_panel2.setLayout(product_search_panel2Layout);
        product_search_panel2Layout.setHorizontalGroup(
            product_search_panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(product_search_panel2Layout.createSequentialGroup()
                .addGroup(product_search_panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, product_search_panel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, product_search_panel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 891, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        product_search_panel2Layout.setVerticalGroup(
            product_search_panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, product_search_panel2Layout.createSequentialGroup()
                .addGroup(product_search_panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(user_password1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(product_search_panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(user_password1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(245, 245, 245))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(product_search_panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        orderTab.addTab("Order", jPanel3);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("ONLINE SHOPPING MANAGEMENT SYSTEM");

        label_user.setText("user");

        logout.setText("LOGOUT");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(503, 503, 503)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addComponent(label_user, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(label_user, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(logout))
                    .addComponent(jLabel14))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(orderTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(orderTab, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_product_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_product_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_product_nameActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void txt_user_first_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_user_first_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_user_first_nameActionPerformed

    private void txt_user_search_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_user_search_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_user_search_usernameActionPerformed

    private void txt_user_addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_user_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_user_addressActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        LoginForm loginForm = new LoginForm();
        this.dispose();
        loginForm.setVisible(true);
        loginForm.setResizable(false);
    }//GEN-LAST:event_logoutActionPerformed

    private void customer_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customer_tableMouseClicked
        // TODO add your handling code here:
        txt_user_id = Integer.parseInt(customer_table.getValueAt(customer_table.getSelectedRow(), 0).toString());
        UserDao ud = new UserDaoImpl();
        User user = ud.getById(txt_user_id);
        txt_user_username.setText(user.getUsername());
        txt_user_username.setEditable(false);
        txt_user_first_name.setText(user.getFirstName());
        txt_user_last_name.setText(user.getLastName());
        txt_user_password.setText(user.getPassword());
        txt_user_address.setText(user.getAddress());
        txt_user_mobile_no.setText(user.getMobileNo());
        cb_user_role.setSelectedItem(user.getRole().toString());
    }//GEN-LAST:event_customer_tableMouseClicked

    private void txt_user_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_user_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_user_passwordActionPerformed

    private void user_save_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_save_updateActionPerformed
        int userId = txt_user_id;
        String firstName = txt_user_first_name.getText().trim();
        String lastName = txt_user_last_name.getText().trim();
        String userName = txt_user_first_name.getText().trim();
        String password = txt_user_password.getText().trim();
        String roles = cb_user_role.getSelectedItem().toString();
        String address = txt_user_address.getText().trim();
        String mobileNo = txt_user_mobile_no.getText().trim();
        RoleType roleText = null;
        if (firstName.length() == 0) {
            JOptionPane.showMessageDialog(null, "first name is required", "Warning", JOptionPane.WARNING_MESSAGE);
        } else if (lastName.length() == 0) {
            JOptionPane.showMessageDialog(null, "last name is required", "Warning", JOptionPane.WARNING_MESSAGE);
        } else if (userName.length() == 0) {
            JOptionPane.showMessageDialog(null, "username is required", "Warning", JOptionPane.WARNING_MESSAGE);
        } else if (password.length() < 4) {
            JOptionPane.showMessageDialog(null, "password is empty/less than 4 characters", "Warning", JOptionPane.WARNING_MESSAGE);
        } else if (roles == "SELECT ROLE") {
            JOptionPane.showMessageDialog(null, "role should be selected", "Warning", JOptionPane.WARNING_MESSAGE);
        } else if (address.length() == 0) {
            JOptionPane.showMessageDialog(null, "address is empty", "Warning", JOptionPane.WARNING_MESSAGE);
        } else if (mobileNo.length() == 0) {
            JOptionPane.showMessageDialog(null, "mobile no is required", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        roleText = RoleType.valueOf(roles);
        UserDao userDao = new UserDaoImpl();
        User user;
        if (userId == 0) {
            user = new User(userName, password, roleText, firstName, lastName, mobileNo, address);
            
        } else {
            user = userDao.getById(userId);
            user.setId(userId);
            user.setFirstName(firstName);
            user.setLastName(lastName);
            user.setAddress(address);
            user.setRole(roleText);
            user.setUsername(userName);
            user.setPassword(password);
            user.setMobileNo(mobileNo);
        }
        resetCustomerForm();
        String result = userDao.saveUpdate(user);
        JOptionPane.showMessageDialog(null, result, "Success", JOptionPane.WARNING_MESSAGE);
        txt_user_username.setEditable(true);
        loadTableCustomer();
    }//GEN-LAST:event_user_save_updateActionPerformed

    private void user_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_resetActionPerformed
        txt_user_username.setEditable(true);
        resetCustomerForm();
    }//GEN-LAST:event_user_resetActionPerformed

    private void txt_user_first_name1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_user_first_name1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_user_first_name1ActionPerformed

    private void user_save_update1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_save_update1ActionPerformed
        int userId = txt_user_id;
    }//GEN-LAST:event_user_save_update1ActionPerformed

    private void txt_user_address1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_user_address1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_user_address1ActionPerformed

    private void txt_user_password1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_user_password1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_user_password1ActionPerformed

    private void user_reset1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_reset1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_user_reset1ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void user_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_deleteActionPerformed
        int userId = txt_user_id;
        if (userId == 0) {
            JOptionPane.showMessageDialog(null, "Please Select User", "Success", JOptionPane.WARNING_MESSAGE);
        } else {
            UserDao userDao = new UserDaoImpl();
            boolean status = userDao.deleteUser(userId);
            JOptionPane.showMessageDialog(null, "Delete successfully", "Success", JOptionPane.WARNING_MESSAGE);
            loadTableCustomer();
            resetCustomerForm();
        }
        

    }//GEN-LAST:event_user_deleteActionPerformed

    private void customer_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customer_searchActionPerformed
        String searchUsername = txt_user_search_username.getText().trim();
        if (searchUsername.length() == 0) {
            JOptionPane.showMessageDialog(null, "Please enter the username for search", "Success", JOptionPane.WARNING_MESSAGE);
        }
        UserDao userDao = new UserDaoImpl();
        List<User> list = userDao.getAlluserByname(searchUsername);
        UserModelTable model = new UserModelTable(list);
        customer_table.setModel(model);

    }//GEN-LAST:event_customer_searchActionPerformed

    private void reloadCustomerTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reloadCustomerTableActionPerformed
        txt_user_search_username.setText("");
        loadTableCustomer();
    }//GEN-LAST:event_reloadCustomerTableActionPerformed

    private void product_save_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_product_save_updateActionPerformed
        
        int productId = txt_product_id;
        String productName = txt_product_name.getText().trim();
        if (productName.length() == 0) {
            JOptionPane.showMessageDialog(null, "product name is required", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        String productType = cb_product_type.getSelectedItem().toString();
        if (productType == "Select Type") {
            JOptionPane.showMessageDialog(null, "product type is required", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Integer qty = null;
        if ((txt_product_quantity.getText().trim()).length() == 0) {
            JOptionPane.showMessageDialog(null, "product quantity is required", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        } else {
            try {
                qty = Integer.parseInt(txt_product_quantity.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "product quantity should be numeric", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
        }
        Double price = null;
        if ((txt_product_price.getText().trim()).length() == 0) {
            JOptionPane.showMessageDialog(null, "product price is required", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        } else {
            try {
                price = Double.parseDouble(txt_product_price.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "product price should be numeric ", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
        }
        
        String description = txt_product_description.getText().trim();
        if (description.length() == 0) {
            JOptionPane.showMessageDialog(null, "description is required", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Product product;
        ProductDao productDao = new ProductDaoImpl();
        if (productId == 0) {
            product = new Product(productName, productType, price, qty, qty, description);
        } else {
            product = productDao.getById(productId);
            product.setId(productId);
            product.setProductName(productName);
            product.setProductType(productType);
            product.setPrice(price);
            product.setTotalQty(qty);
            product.setAvailableQty(qty);
            product.setDescription(description);
        }
        resetProductForm();
        String result = productDao.saveUpdate(product);
        JOptionPane.showMessageDialog(null, result, "Success", JOptionPane.WARNING_MESSAGE);
        txt_product_name.setEditable(true);
        cb_product_type.setEnabled(true);
        loadTableProduct();

    }//GEN-LAST:event_product_save_updateActionPerformed

    private void product_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product_tableMouseClicked
        // TODO add your handling code here:
        txt_product_id = Integer.parseInt(product_table.getValueAt(product_table.getSelectedRow(), 0).toString());
        ProductDao pd = new ProductDaoImpl();
        Product product = pd.getById(txt_product_id);
        txt_product_name.setText(product.getProductName());
        txt_product_name.setEditable(false);
        cb_product_type.setSelectedItem(product.getProductType().toString());
        cb_product_type.setEnabled(false);
        String qty = String.valueOf(product.getTotalQty());
        txt_product_quantity.setText(qty);
        String price = String.valueOf(product.getPrice());
        txt_product_price.setText(price);
        txt_product_description.setText(product.getDescription());
        
    }//GEN-LAST:event_product_tableMouseClicked

    private void cb_user_roleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_user_roleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_user_roleActionPerformed

    private void reset_productActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset_productActionPerformed
        resetProductForm();
    }//GEN-LAST:event_reset_productActionPerformed

    private void product_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_product_deleteActionPerformed
        int productId=txt_product_id;
        System.out.println("productId::"+productId);
        ProductDao productDao =new ProductDaoImpl();
        boolean status=productDao.deleteProduct(productId);
        JOptionPane.showMessageDialog(null, "Deleted", "Deleted", JOptionPane.WARNING_MESSAGE);
        loadTableProduct();
        resetProductForm();
    }//GEN-LAST:event_product_deleteActionPerformed
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb_product_type;
    private javax.swing.JComboBox<String> cb_user_role;
    private javax.swing.JComboBox<String> cb_user_role1;
    private javax.swing.JPanel customer_panel;
    private javax.swing.JButton customer_search;
    private javax.swing.JTable customer_table;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel label_user;
    private javax.swing.JButton logout;
    private javax.swing.JTabbedPane orderTab;
    private javax.swing.JPanel productPanel;
    private javax.swing.JButton product_delete;
    private javax.swing.JButton product_save_update;
    private javax.swing.JPanel product_search_panel;
    private javax.swing.JPanel product_search_panel1;
    private javax.swing.JPanel product_search_panel2;
    private javax.swing.JTable product_table;
    private javax.swing.JButton reloadCustomerTable;
    private javax.swing.JButton reset_product;
    private javax.swing.JTextArea txt_product_description;
    private javax.swing.JTextField txt_product_name;
    private javax.swing.JTextField txt_product_price;
    private javax.swing.JTextField txt_product_quantity;
    private javax.swing.JTextField txt_user_address;
    private javax.swing.JTextField txt_user_address1;
    private javax.swing.JTextField txt_user_first_name;
    private javax.swing.JTextField txt_user_first_name1;
    private javax.swing.JTextField txt_user_last_name;
    private javax.swing.JTextField txt_user_last_name1;
    private javax.swing.JTextField txt_user_mobile_no;
    private javax.swing.JTextField txt_user_mobile_no1;
    private javax.swing.JPasswordField txt_user_password;
    private javax.swing.JPasswordField txt_user_password1;
    private javax.swing.JTextField txt_user_search_username;
    private javax.swing.JTextField txt_user_username;
    private javax.swing.JTextField txt_user_username1;
    private javax.swing.JButton user_delete;
    private javax.swing.JButton user_delete1;
    private javax.swing.JPanel user_password;
    private javax.swing.JPanel user_password1;
    private javax.swing.JButton user_reset;
    private javax.swing.JButton user_reset1;
    private javax.swing.JButton user_save_update;
    private javax.swing.JButton user_save_update1;
    // End of variables declaration//GEN-END:variables
}
