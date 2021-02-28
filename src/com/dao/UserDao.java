
package com.dao;

import com.model.User;
import java.util.List;

public interface UserDao {
    String saveUpdate(User user);
    List<User> getAllUsers();
    boolean existingUser(String username);
    boolean deleteUser(int id);
    User getById(int id);
    void getAllUserList();
    List<User> getAlluserByname(String search);
    User getByUserPassword(String username,String password);
}
