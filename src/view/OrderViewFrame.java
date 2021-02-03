
package view;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class OrderViewFrame extends javax.swing.JFrame {
    public OrderViewFrame() {
        initComponents();
    }

    void loadOrderData(int id){
//        OrderDao orderDao = new OrderDaoImpl();
//        OrderDto orderDto = orderDao.findOrderById(id);
//        if(orderDto == null){
//            JOptionPane.showMessageDialog(null, "Order id " + id + " doesnot found.");
//            return;
//        }
//        label_id.setText(String.valueOf(id));
//        label_created_date.setText(orderDto.getCreatedDate().toString());
//        label_name.setText(orderDto.getClientName());
//        label_grand_total.setText(String.valueOf(orderDto.getGrandTotal()));
//        label_status.setText(orderDto.getStatus().toString());        
//        
//        OrderItemDao orderItemDao = new OrderItemDaoImpl();
//        List<OrderItemDto> orderItems = orderItemDao.orderItems(id);
//        
//        DefaultTableModel model = new DefaultTableModel();
//        String headers[] = { "S.No.", "Name", "Quantity", "Unit Price" ,"Total Amount" };
//        model.setColumnIdentifiers(headers);
//        for(OrderItemDto orderItem: orderItems){
//            model.addRow(
//                    new String[]{ 
//                        String.valueOf(orderItem.getId()), 
//                        orderItem.getItemName(), 
//                        String.valueOf(orderItem.getQuantity()), 
//                        String.valueOf(orderItem.getUnitPrice()), 
//                        String.valueOf(orderItem.getUnitPrice()*orderItem.getQuantity())
//            });
//        }
//        tbl_order_items.setModel(model);
    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        label_name = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        label_grand_total = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        label_id = new javax.swing.JLabel();
        label_created_date = new javax.swing.JLabel();
        txt_header = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_order_items = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("order Details");
        setAlwaysOnTop(true);
        setResizable(false);

        jLabel1.setText("Full Name");

        label_name.setText("Item");

        jLabel3.setText("Total Amt.");

        label_grand_total.setText("123");

        jLabel17.setText("Id");

        jLabel7.setText("Created Date");

        label_id.setText("1");

        label_created_date.setText("2021-01-25");

        txt_header.setEditable(false);
        txt_header.setBackground(new java.awt.Color(153, 255, 255));
        txt_header.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        txt_header.setText("                                       ONLINE SHOPPING MGMT SYS.");
        txt_header.setMargin(new java.awt.Insets(2, 30, 2, 30));
        txt_header.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_headerActionPerformed(evt);
            }
        });

        jLabel2.setText("Item");

        tbl_order_items.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tbl_order_items);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt_header, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addComponent(jLabel1)
                    .addComponent(jLabel17)
                    .addComponent(jLabel2))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_created_date)
                    .addComponent(label_grand_total)
                    .addComponent(label_name)
                    .addComponent(label_id)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(txt_header, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(label_id))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(label_name))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(label_grand_total))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(label_created_date))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 91, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_headerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_headerActionPerformed
        
    }//GEN-LAST:event_txt_headerActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderViewFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel label_created_date;
    private javax.swing.JLabel label_grand_total;
    private javax.swing.JLabel label_id;
    private javax.swing.JLabel label_name;
    private javax.swing.JTable tbl_order_items;
    private javax.swing.JTextField txt_header;
    // End of variables declaration//GEN-END:variables
}
