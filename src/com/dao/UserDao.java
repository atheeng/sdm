/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.model.User;
import java.util.List;

/**
 *
 * @author salinthapa
 */
public interface UserDao {
    String save(User user);
    List<User> getAllUsers();
    boolean updateUser(int id);
    boolean deleteUser(int id);
    User getById(int id);
    void getAllUserList();
}
