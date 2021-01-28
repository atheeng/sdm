/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DaoImpl;

import com.Enum.RoleType;
import com.dao.UserDao;
import com.db.DataBaseConnection;
import com.model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import view.CustomerFrame;

/**
 *
 * @author salinthapa
 */
public class UserDaoImpl implements UserDao {

    @Override
    public List<User> getAllUsers() {

        List<User> userList = new ArrayList<>();
        Connection conn = null;
        try {
            conn = DataBaseConnection.getInstance().getConnection();
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM USER");
            while (rs.next()) {
                User u = new User();
                u.setId(rs.getInt(1));
                u.setUsername(rs.getString(2));
                u.setRole(RoleType.valueOf(rs.getString(4)));
                u.setFirstName(rs.getString(5));
                u.setLastName(rs.getString(6));
                u.setAddress(rs.getString(7));
                u.setMobileNo(rs.getString(8));
                userList.add(u);
            }
            rs.close();
            statement.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return userList;
    }

    @Override
    public boolean updateUser(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteUser(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User getById(int id) {
        Connection conn = null;
        User user = new User();
        try {
            conn = DataBaseConnection.getInstance().getConnection();
            String query = "select id,username,password,role,firstName,lastName,address,mobileNo from user where id=? ";
            PreparedStatement preparedStmt = conn.prepareStatement(query);
            preparedStmt.setInt(1, id);
            ResultSet rs = preparedStmt.executeQuery();
            while (rs.next()) {
                user.setId(rs.getInt(1));
                user.setUsername(rs.getString(2));
                user.setPassword(rs.getString(3));
                user.setRole(RoleType.valueOf(rs.getString(4)));
                user.setFirstName(rs.getString(5));
                user.setLastName(rs.getString(6));
                user.setAddress(rs.getString(7));
                user.setMobileNo(rs.getString(8));
            }
            rs.close();
            preparedStmt.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return user;
    }

    @Override
    public void getAllUserList() {
        System.out.println("");

    }

    @Override
    public User getByUserPassword(String username, String password) {
        Connection conn = null;
        User user = new User();
        try {
            conn = DataBaseConnection.getInstance().getConnection();
            String query = "select id,username,role from user where username=? AND password=sha(?)";
            PreparedStatement preparedStmt = conn.prepareStatement(query);
            preparedStmt.setString(1, username);
            preparedStmt.setString(2, password);
            ResultSet rs = preparedStmt.executeQuery();
            while (rs.next()) {
                user.setId(rs.getInt(1));
                user.setUsername(rs.getString(2));
                user.setRole(RoleType.valueOf(rs.getString(3)));
            }
            rs.close();
            preparedStmt.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return user;
    }

    @Override
    public String saveUpdate(User user) {
        Connection conn = null;
        int id = user.getId();
       
        if (id==0) {
            try {
                conn = DataBaseConnection.getInstance().getConnection();
                String query = "insert into user (username, password, role,firstName,lastName,address,mobileNo) values (?, sha(?), ?,?, ?, ?,?)";
                PreparedStatement preparedStmt = conn.prepareStatement(query);
                preparedStmt.setString(1, user.getUsername());
                preparedStmt.setString(2, user.getPassword());
                String role = user.getRole().toString();
                preparedStmt.setString(3, role);
                preparedStmt.setString(4, user.getFirstName());
                preparedStmt.setString(5, user.getLastName());
                preparedStmt.setString(6, user.getAddress());
                preparedStmt.setString(7, user.getMobileNo());
                preparedStmt.executeUpdate();
                preparedStmt.close();
                System.out.println("saved");
            } catch (Exception e) {
                System.out.println("error:" + e.getMessage());
            }
        } else {
               try {
                conn = DataBaseConnection.getInstance().getConnection();
                String query = "update user set username=?, password=sha(?), role=?,firstName=?,lastName=?,address=?,mobileNo=? where id=?";
                PreparedStatement preparedStmt = conn.prepareStatement(query);
                preparedStmt.setString(1, user.getUsername());
                preparedStmt.setString(2, user.getPassword());
                String role = user.getRole().toString();
                preparedStmt.setString(3, role);
                preparedStmt.setString(4, user.getFirstName());
                preparedStmt.setString(5, user.getLastName());
                preparedStmt.setString(6, user.getAddress());
                preparedStmt.setString(7, user.getMobileNo());
                preparedStmt.setInt(8, user.getId());
                preparedStmt.executeUpdate();
                preparedStmt.close();
                System.out.println("Update");
            } catch (Exception e) {
                System.out.println("error:" + e.getMessage());
            }
        }
        return user.getUsername();

    }

}
