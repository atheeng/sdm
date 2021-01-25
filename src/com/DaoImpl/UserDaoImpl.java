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
    public String save(User user) {
        Connection conn = null;
        try {
            conn = DataBaseConnection.getInstance().getConnection();
            String query = "insert into user (username, password, role) values (?, ?, ?)";
            PreparedStatement preparedStmt = conn.prepareStatement(query);
            preparedStmt.setString(1, user.getUsername());
            preparedStmt.setString(2, user.getPassword());
            String role = user.getRole().toString();
            preparedStmt.setString(3, role);
            preparedStmt.executeUpdate();
            preparedStmt.close();
            System.out.println("saved");
        } catch (Exception e) {
            System.out.println("error:" + e.getMessage());
        }
        return user.getUsername();
    }

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
            String query = "select * from user where id=? ";
            PreparedStatement preparedStmt = conn.prepareStatement(query);
            preparedStmt.setInt(1, id);
            ResultSet rs = preparedStmt.executeQuery();
            while (rs.next()) {
                user.setId(rs.getInt(1));
                user.setUsername(rs.getString(2));
                user.setRole(RoleType.valueOf(rs.getString(4)));
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
            String query = "select * from user where username=? AND password=? ";
            PreparedStatement preparedStmt = conn.prepareStatement(query);
            preparedStmt.setString(1, username);
             preparedStmt.setString(2, password);
            ResultSet rs = preparedStmt.executeQuery();
            while (rs.next()) {
                user.setId(rs.getInt(1));
                user.setUsername(rs.getString(2));
                user.setRole(RoleType.valueOf(rs.getString(4)));
            }
            rs.close();
            preparedStmt.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return user;
    }
  

}