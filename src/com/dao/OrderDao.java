/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.model.CartOrder;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Arun Tamang
 */
public interface OrderDao {
   String saveUpdate(CartOrder order);
   boolean existingItem(String item);
   boolean deleteAll();
   boolean deleteById(int id);
   List<CartOrder> getAllTempList();
   String purchase(List<CartOrder> list);
    
}
