/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao.daoImpl;

import com.dao.OrderDao;
import com.db.DataBaseConnection;
import com.model.TempOrder;
import com.util.ProductReserve;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Arun Tamang
 */
public class OrderDaoImpl implements OrderDao {

    @Override
    public String saveUpdate(TempOrder tempOrder) {
        Connection conn = null;
        long millis = System.currentTimeMillis();
        java.sql.Date date = new java.sql.Date(millis);
        int id = 0;
        int idrows = 0;
        if (tempOrder.getId() == 0) {
//            for id
            boolean existingUser = existingItem(tempOrder.getItem());
            if (existingUser == true) {
                return "EXIST";
            } else {
                try {
                    conn = DataBaseConnection.getInstance().getConnection();
                    Statement statement = conn.createStatement();
                    ResultSet rs = statement.executeQuery("SELECT COUNT(*) as id FROM temp_order");
                    while (rs.next()) {
                        idrows = rs.getInt(1);
                    }
                    rs.close();
                    statement.close();
                    if (idrows == 0) {
                        idrows = 1;
                    } else {
                        idrows = idrows + 1;
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
            try {
                conn = DataBaseConnection.getInstance().getConnection();
                String query = "INSERT INTO temp_order VALUES(?,?,?,?,?,?)";
                PreparedStatement preparedStmt = conn.prepareStatement(query);
                preparedStmt.setInt(1, idrows);
                preparedStmt.setInt(2, tempOrder.getProductId());
                preparedStmt.setString(3, tempOrder.getItem());
                preparedStmt.setDouble(4, tempOrder.getUnitPrice());
                preparedStmt.setInt(5, tempOrder.getQty());
                preparedStmt.setDouble(6, (tempOrder.getUnitPrice()) * (tempOrder.getQty()));
                preparedStmt.executeUpdate();
                preparedStmt.close();

            } catch (Exception e) {
                System.out.println("error:" + e.getMessage());
            }
            return tempOrder.getItem() + " with " + tempOrder.getQty() + " quantity is added";

        } else {
            try {
                conn = DataBaseConnection.getInstance().getConnection();
                String query = "UPDATE temp_order SET product_id=?,item=?,unit_price=?,quantity=?,totalAmount=? where id=?";
                PreparedStatement preparedStmt = conn.prepareStatement(query);
                preparedStmt.setInt(1, tempOrder.getProductId());
                preparedStmt.setString(2, tempOrder.getItem());
                preparedStmt.setDouble(3, tempOrder.getUnitPrice());
                preparedStmt.setInt(4, tempOrder.getQty());
                preparedStmt.setDouble(5, (tempOrder.getUnitPrice()) * (tempOrder.getQty()));
                preparedStmt.setInt(6, tempOrder.getId());
                preparedStmt.executeUpdate();
                preparedStmt.close();

            } catch (Exception e) {
                System.out.println("error:" + e.getMessage());
            }
            return tempOrder.getItem() + " with " + tempOrder.getQty() + " quantity is updated";
        }
    }

    @Override
    public boolean existingItem(String item) {
        Connection conn = null;
        Integer id = null;
        try {
            conn = DataBaseConnection.getInstance().getConnection();
            String query = "SELECT * FROM `temp_order` WHERE item=?";
            PreparedStatement preparedStmt = conn.prepareStatement(query);
            preparedStmt.setString(1, item);
            ResultSet rs = preparedStmt.executeQuery();
            while (rs.next()) {
                id = rs.getInt(1);
            }
            rs.close();
            preparedStmt.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        if (id != null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean deleteAll() {
        Connection conn = null;
        try {
            conn = DataBaseConnection.getInstance().getConnection();
            String query = "delete from temp_order";
            PreparedStatement preparedStmt = conn.prepareStatement(query);
            preparedStmt.executeUpdate();
            preparedStmt.close();

        } catch (Exception e) {
            System.out.println("error:" + e.getMessage());
        }
        return true;
    }

    @Override
    public boolean deleteById(int id) {
        Connection conn = null;
        try {
            conn = DataBaseConnection.getInstance().getConnection();
            String query = "delete from temp_order where id=?";
            PreparedStatement preparedStmt = conn.prepareStatement(query);
            preparedStmt.setInt(1, id);
            preparedStmt.executeUpdate();
            preparedStmt.close();

        } catch (Exception e) {
            System.out.println("error:" + e.getMessage());
        }
        return true;
    }

    @Override
    public List<TempOrder> getAllTempList() {
        List<TempOrder> productList = new ArrayList<>();
        Connection conn = null;
        try {
            conn = DataBaseConnection.getInstance().getConnection();
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("SELECT id,product_id,item,unit_price,quantity,totalAmount FROM temp_order");
            while (rs.next()) {
                TempOrder product = new TempOrder();
                product.setId(rs.getInt(1));
                product.setProductId(rs.getInt(2));
                product.setItem(rs.getString(3));
                product.setUnitPrice(rs.getDouble(4));
                product.setQty(rs.getInt(5));
                product.setTotalPrice(rs.getDouble(6));
                productList.add(product);
            }
            rs.close();
            statement.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return productList;
    }

    @Override
    public String purchase(List<TempOrder> list) {
        Connection conn = null;
        for (TempOrder purchase : list) {
//            try {
//                conn = DataBaseConnection.getInstance().getConnection();
//                String query = "INSERT INTO temp_order VALUES(?,?,?,?,?,?)";
//                PreparedStatement preparedStmt = conn.prepareStatement(query);
//                preparedStmt.setInt(1, purchase.);
//                preparedStmt.setString(3, tempOrder.getItem());
//                preparedStmt.setDouble(4, tempOrder.getUnitPrice());
//                preparedStmt.setInt(5, tempOrder.getQty());
//                preparedStmt.setDouble(6, (tempOrder.getUnitPrice()) * (tempOrder.getQty()));
//                preparedStmt.executeUpdate();
//                preparedStmt.close();
//
//            } catch (Exception e) {
//                System.out.println("error:" + e.getMessage());
//            }
        }

//        return tempOrder.getItem() + " with " + tempOrder.getQty() + " quantity is added";
        return "";
    }

}
